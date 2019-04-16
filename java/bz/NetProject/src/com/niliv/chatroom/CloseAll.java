package com.niliv.chatroom;

import java.io.Closeable;
/**
 * 关闭流工具类
 * @author yuankun
 * @Date 2019-04-16 10:41:19
 * @Description 
 *
 */
public class CloseAll {
	public static void CloseUtil(Closeable...clos) {
		for (Closeable clo : clos) {
			try {
				if(null!=clo) {
					clo.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
