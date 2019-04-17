package com.niliv.demo;

import java.io.FileInputStream;
import java.io.IOException;
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
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		MainBoard mb = new MainBoard();
		Properties prop = new Properties();// 属性集合对象
		FileInputStream fis = new FileInputStream("pci.properties");// 属性文件流
		prop.load(fis);// 将属性文件流装载到Properties对象中
		
		for(int i=0;i<prop.size();i++) {
			String pciName = prop.getProperty("pci"+ (i+1));
			
			Class clazz = Class.forName(pciName);
			System.out.println(clazz);
			PCI pci = (PCI)clazz.newInstance();
			mb.usePci(pci);
		}
		fis.close();
	}
}

