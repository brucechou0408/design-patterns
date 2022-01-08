package com.bruce.proxyPartterns.demo4;

public class GamePalyerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer;

	/**
	 * 此处构造函数是否可以通过增加一个class来扩展
	 * @param name
	 */
	public GamePalyerProxy(String name) {
		try{
			gamePlayer = new GamePlayer(this,name);

		}catch(Exception e){
			// 异常处理
		}
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
