package com.bruce.proxyPartterns.demo7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	// 被代理者
	Class cls = null;
	// 被代理者实例
	Object obj = null;
	// 我要代理谁
	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object result = method.invoke(this.obj,args);
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("有人在登录我的账号");
		}
		return result;
	}
}
