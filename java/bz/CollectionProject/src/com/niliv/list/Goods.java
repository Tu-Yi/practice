package com.niliv.list;

public class Goods implements Comparable<Goods> {
	
	private int num;
	private String name;
	private double price;
	private String press;
	
	public Goods() {
		super();
	}
	public Goods(int num, String name, double price, String press) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.press = press;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + ((press == null) ? 0 : press.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (press == null) {
			if (other.press != null)
				return false;
		} else if (!press.equals(other.press))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public int compareTo(Goods o) {
		
		if((this.num-o.num)==0) {
			return (int)(this.price-o.price);
		}else {
			return this.num-o.num;
		}

	}
	@Override
	public String toString() {
		return "Goods [num=" + num + ", name=" + name + ", price=" + price + ", press=" + press + "]";
	}
	
	
}
