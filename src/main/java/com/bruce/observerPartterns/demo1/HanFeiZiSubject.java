package com.bruce.observerPartterns.demo1;

/**
 * 具体被观察者 韩非子
 * @author bruce
 */
public class HanFeiZiSubject extends Subject{

	/**
	 * 睡醒
	 */
	public void awake(){
		System.out.println("我韩非子睡醒了");
		super.notifyObserver();
	}

	public void eat(){
		System.out.println("我韩非子吃饭了");
		super.notifyObserver();
	}


}
