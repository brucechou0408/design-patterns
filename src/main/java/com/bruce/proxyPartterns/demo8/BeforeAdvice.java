package com.bruce.proxyPartterns.demo8;

/**
 * @author bruce
 */
public class BeforeAdvice implements IAdvice {
	@Override
	public void exec() {
		System.out.println("我是前置通知，我被执行了");
	}
}
