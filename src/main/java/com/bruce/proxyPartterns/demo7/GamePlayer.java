package com.bruce.proxyPartterns.demo7;

import com.bruce.proxyPartterns.demo5.GamePalyerProxy;

public class GamePlayer implements IGamePlayer {

	private String name ;


	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println("登录名为" + user + "的用户," + this.name + "登录成功。");

	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "正在打怪");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "正在升级");
	}




}
