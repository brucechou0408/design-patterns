package com.bruce.proxyPartterns.demo4;

/**
 *
 * @author bruce
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePalyerProxy("张三");


		proxy.login("zhangsan","password");

		proxy.killBoss();

		proxy.upgrade();
	}
}
