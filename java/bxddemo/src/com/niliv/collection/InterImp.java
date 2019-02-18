package com.niliv.collection;

public class InterImp<Q> implements Inter<Q> {
	@Override
	public void show(Q q) {
		System.out.println(q);
	}
}
