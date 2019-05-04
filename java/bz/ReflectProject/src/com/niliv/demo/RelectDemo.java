package com.niliv.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
/**
 * 	mainboard run
	class com.niliv.demo.SoundCart
	soundcart open
	soundcart close
 * @author Administrator
 * @Date 2019-04-17 12:49:11
 * @Description 
 *
 */
public class RelectDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		MainBoard mb = new MainBoard();
		Properties prop = new Properties();// 灞炴�ч泦鍚堝璞�
		FileInputStream fis = new FileInputStream("pci.properties");// 灞炴�ф枃浠舵祦
		prop.load(fis);// 灏嗗睘鎬ф枃浠舵祦瑁呰浇鍒癙roperties瀵硅薄涓�
		
		for(int i=0;i<prop.size();i++) {
			String pciName = prop.getProperty("pci"+ (i+1));
			
			Class clazz = Class.forName(pciName);
			System.out.println(clazz);
			PCI pci = (PCI)clazz.getConstructor().newInstance();
			mb.usePci(pci);
		}
		fis.close();
	}
}

