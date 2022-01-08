package com.bruce.proxyPartterns.demo3;

/**
 * 代理主题角色
 *
 * @author bruce
 */
public class Proxy implements Subject {

	private Subject subject = null;

	@Override
	public void request() {
		subject.request();
	}

	public Proxy() {
		this.before();
		this.subject = new Proxy();
		this.after();
	}
	/**
	 * 	传递被代理对象
	 */
	public Proxy(Subject subject){
		subject = subject;
	}

	/**
	 * 预处理
	 */
	private void before(){

	}
	// 善后处理
	private void after(){

	}


}
