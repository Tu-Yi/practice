package com.niliv.demo;

public class SoundCart implements PCI {

	@Override
	public void open() {
		System.out.println("soundcart open");
	}

	@Override
	public void close() {
		System.out.println("soundcart close");
	}
	
}
