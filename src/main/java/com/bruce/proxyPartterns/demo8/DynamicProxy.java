package com.bruce.proxyPartterns.demo8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bruce
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
		if(true){
			(new BeforeAdvice()).exec();
		}
		return (T)Proxy.newProxyInstance(loader,interfaces,h);
	}
}

