package com.bruce.proxyPartterns.demo8;

public class RealSubject implements Subject{



	@Override
	public void doSomething(String str) {
		System.out.println("do somethine!----->" + str);
	}
}
