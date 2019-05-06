package com.niliv.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭流
 * @author yuankun
 * @Date 2019-05-06 11:44:48
 * @Description 
 *
 */
public class IOClose {
	
	public static void closeAll(Closeable...closeables) {
		for (Closeable closeable : closeables) {
			if(null!=closeable) {
				try {
					closeable.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
