package com.bruce.observerPartterns.demo1;

/**
 * 秦国观察者
 * @author bruce
 */
public class QinObserver implements Observer{
	@Override
	public void update() {
		System.out.println("秦王，收到谍报");
	}
}
