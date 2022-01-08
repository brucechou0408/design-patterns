package com.bruce.proxyPartterns.demo8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target= null;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.target,args);
		return result;
	}

	public MyInvocationHandler(Object _target) {
		this.target = _target;
	}


}
