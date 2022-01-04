package com.bruce.observerPartterns.demo1;

/**
 * 观察者模式
 * @author bruce
 */
public class DemoTest {
	public static void main(String[] args) {
		HanFeiZiSubject hanfeizi = new HanFeiZiSubject();
		hanfeizi.addObserver(new QinObserver());
		hanfeizi.addObserver(new ChuObserver());
		hanfeizi.awake();
		hanfeizi.eat();
	}
}
