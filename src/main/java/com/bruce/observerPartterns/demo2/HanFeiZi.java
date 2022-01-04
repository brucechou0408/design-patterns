package com.bruce.observerPartterns.demo2;

import java.util.Observable;
import java.util.Observer;

public class HanFeiZi extends Observable implements IHanFeiZi {
	@Override
	public void awake() {
		System.out.println("我韩非子开始醒了");
		super.setChanged();
		super.notifyObservers("韩非子醒了");
	}

	@Override
	public void eat() {
		System.out.println("我韩非子开始吃东西了");
		super.setChanged();
		super.notifyObservers("韩非子吃东西了");

	}
}
