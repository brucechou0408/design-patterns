package com.bruce.proxyPartterns.demo6;

public class GamePalyerProxy implements IGamePlayer,IProxy {
	private IGamePlayer gamePlayer;

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	/**
	 *
	 * @param
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
		this.count();
	}

	@Override
	public void count() {
		System.out.println("升级总费用是：150元");
	}
}
