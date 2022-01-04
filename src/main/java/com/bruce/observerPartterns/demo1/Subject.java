package com.bruce.observerPartterns.demo1;

import java.util.Vector;

/**
 * @author bruce
 * 被观察者
 */
public abstract class Subject {

	private Vector<Observer> observerVector = new Vector<>();

	/**
	 * 添加观察者
	 * @param observer 观察者
	 */
	public void addObserver(Observer observer){
		observerVector.add(observer);
	}

	/**
	 * 删除观察者
	 * @param observer 观察者
	 */
	public void delObserver(Observer observer){
		observerVector.remove(observer);
	}

	/**
	 * 通知观察者
	 */
	public void notifyObserver(){
		for (Observer observer : observerVector) {
			observer.update();
		}
	}

}
