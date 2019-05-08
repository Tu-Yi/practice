package com.niliv.server;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请求处理
 * @author yuankun
 * @Date 2019-05-08 13:11:49
 * @Description 
 *
 */
public class Request {
	
		//协议信息
		private String requestInfo;
		//请求方式
		private String method=""; 
		//请求url
		private String url; 
		//请求参数
		private String queryStr;
		//存储参数
		private Map<String,List<String>> parameterMap;
		//换行
		private final  String CRLF = "\r\n";
		/**
		 * 构造函数
		 * @param client
		 * @throws IOException
		 */
		public Request(Socket client) throws IOException {
			this(client.getInputStream());
		}
		/**
		 * 构造函数
		 * @param is
		 */
		public Request(InputStream is) {		
			parameterMap = new HashMap<String,List<String>>();
			StringBuffer request=new StringBuffer(2048);
			byte[] datas = new byte[2048];
			int len;
			try {
				len = is.read(datas);
				for(int j=0;j<len;j++){
					request.append((char)datas[j]);
				}
				System.out.println(request);
				this.requestInfo = request.toString();	
				System.out.println(requestInfo);
			} catch (IOException e) {
				e.printStackTrace();
				len=-1;
				return ;
			}
			//分解字符串
			parseRequestInfo();
		}
		/**
		 * 分解字符串
		 */
		private void parseRequestInfo() {
			if("".equals(this.requestInfo) || null==this.requestInfo) {
				return;
			}
			this.method = this.requestInfo.substring(0, this.requestInfo.indexOf("/")).toLowerCase();
			this.method=this.method.trim();

			//1)、获取/的位置
			int startIdx = this.requestInfo.indexOf("/")+1;
			//2)、获取 HTTP/的位置
			int endIdx = this.requestInfo.indexOf("HTTP/");
			//3)、分割字符串
			this.url = this.requestInfo.substring(startIdx, endIdx);	
			this.url = this.url.trim();
			System.out.println(this.url);
			//4)、获取？的位置
			int queryIdx =this.url.indexOf("?");	
			if(queryIdx>=0) {//表示存在请求参数
				String[] urlArray = this.url.split("\\?");
				this.url =urlArray[0];
				queryStr =urlArray[1];
			}
			System.out.println(this.url);
			
			if(method.equals("post")) {
				String qStr =this.requestInfo.substring(this.requestInfo.lastIndexOf(CRLF)).trim();
				System.out.println(qStr+"-->"); 
				if(null==queryStr) {
					queryStr =qStr;
				}else { 
					queryStr +="&"+qStr;
				}
			}
			queryStr = null==queryStr?"":queryStr;
			System.out.println(method+"-->"+url+"-->"+queryStr);
			//转成Map fav=1&fav=2&uname=shsxt&age=18&others=
			if(this.url!="upload") {
				convertMap();
			}
			
		}
		/**
		 * 处理请求参数为Map
		 */
		private void convertMap() {
			//1、分割字符串 &
			String[] keyValues =this.queryStr.split("&");
			for(String queryStr:keyValues) {
				//2、再次分割字符串  =
				String[] kv = queryStr.split("=");
				kv =Arrays.copyOf(kv, 2);
				//获取key和value
				String key = kv[0];
				String value = kv[1]==null?null:decode( kv[1],"utf-8");
				//存储到map中
				if(!parameterMap.containsKey(key)) { //第一次
					parameterMap.put(key, new ArrayList<String>());
				}
				parameterMap.get(key).add(value);			
			}
		}
		/**
		 * 处理中文
		 * @return
		 */
		private String decode(String value,String enc) {
			try {
				return java.net.URLDecoder.decode(value, enc);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		/**
		 * 通过name获取对应的多个值
		 * @param key
		 * @return
		 */
		public String[] getParameterValues(String key) {
			List<String> values = this.parameterMap.get(key);
			if(null==values || values.size()<1) {
				return null;
			}
			return values.toArray(new String[0]);
		}
		/**
		 * 通过name获取对应的一个值
		 * @param key
		 * @return
		 */
		public String getParameter(String key) {
			String []  values =getParameterValues(key);
			return values ==null?null:values[0];
		}
		public String getMethod() {
			return method;
		}
		
		public String getUrl() {
			return url;
		}
		
		public String getQueryStr() {
			return queryStr;
		}
	
}
