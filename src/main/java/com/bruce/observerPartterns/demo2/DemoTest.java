package com.bruce.observerPartterns.demo2;

/**
 * 通过Java.Util.Observer以及Java.Util.Observable
 */
public class DemoTest {
	public static void main(String[] args) {
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(new QinObserver());
		hanFeiZi.addObserver(new ChuObserver());
		hanFeiZi.awake();
		hanFeiZi.eat();
	}
}
