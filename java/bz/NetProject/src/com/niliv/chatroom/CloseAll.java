package com.niliv.chatroom;

import java.io.Closeable;

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
