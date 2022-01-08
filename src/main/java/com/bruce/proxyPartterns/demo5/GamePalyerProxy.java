package com.bruce.proxyPartterns.demo5;

public class GamePalyerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer;

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	/**
	 * 此处构造函数是否可以通过增加一个class来扩展
	 * @param name
	 */
	public GamePalyerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user,password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
}
