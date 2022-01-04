package com.bruce.observerPartterns.demo2;

import java.util.Observable;
import java.util.Observer;

public class QinObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("秦国接到间谍通知");
		this.report(arg.toString());
		System.out.println("秦国间谍汇报完毕");
	}

	public void report(String msg){
		System.out.println(msg);
	}
}
