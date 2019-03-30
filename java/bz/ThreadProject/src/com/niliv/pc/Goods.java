package com.niliv.pc;
/**
 * 共享对象Goods
 * @author Administrator
 *
 */
public class Goods {
	
	private String brand;
	private String name;
	private boolean isFlag;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Goods(String brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}
	public Goods() {
		super();
	}
	
	public synchronized void set(String brand, String name)  {
		if(isFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.setBrand(brand);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		this.setName(name);
		this.notifyAll();
		isFlag=true;
	}
	public synchronized void get()  {
		if(!isFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("消费者消费了"+this.getBrand()+this.getName());
		notifyAll();
		isFlag=false;
	}
}
