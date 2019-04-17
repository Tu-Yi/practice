package com.niliv.demo;

public class MainBoard {
	
	public MainBoard() {
		System.out.println("mainboard run");
	}
	
	public void usePci(PCI pci) {
		pci.open();
		pci.close();
	}
}
