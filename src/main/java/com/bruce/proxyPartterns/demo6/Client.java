package com.bruce.proxyPartterns.demo6;

/**
 *
 * @author bruce
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer("张三");
		IGamePlayer proxy = gamePlayer.getProxy();

		proxy.login("zhangsan","password");

		proxy.killBoss();

		proxy.upgrade();
	}
}
