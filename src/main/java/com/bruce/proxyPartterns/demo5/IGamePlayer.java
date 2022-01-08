package com.bruce.proxyPartterns.demo5;

/**
 * @author bruce
 */
public interface IGamePlayer {

	void login(String user,String password);

	void killBoss();

	void upgrade();

	/**
	 * 每个人都可以找一下自己的代理
	 * @return
	 */
	IGamePlayer getProxy();
}
