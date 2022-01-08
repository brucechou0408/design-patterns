package com.bruce.proxyPartterns.demo7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) throws Throwable {
		// 定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		InvocationHandler handler = new GamePlayIH(player);

		ClassLoader classLoader = player.getClass().getClassLoader();

		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);

		proxy.login("zhangsan","password");

		proxy.killBoss();

		proxy.upgrade();



	}
}
