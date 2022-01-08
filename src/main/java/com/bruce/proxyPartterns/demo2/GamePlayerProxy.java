package com.bruce.proxyPartterns.demo2;

/**
 * 代理人有一个玩家对象，并且不设置无参构造
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
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

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
}
