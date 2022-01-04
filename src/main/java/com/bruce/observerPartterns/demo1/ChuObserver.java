package com.bruce.observerPartterns.demo1;

/**
 * 楚国观察者
 * @author bruce
 */
public class ChuObserver implements Observer{
	@Override
	public void update() {
		System.out.println("楚王，收到谍报");
	}
}
