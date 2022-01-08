package com.bruce.proxyPartterns.demo6;

public class GamePlayer implements IGamePlayer {

	private String name ;

	private IGamePlayer proxy;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		if(isProxy()){
			System.out.println("登录名为" + user + "的用户," + this.name + "登录成功。");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public void killBoss() {
		if(isProxy()){
			System.out.println(this.name + "正在打怪");
		}else{
			System.out.println("请使用指定的代理访问");

		}

	}

	@Override
	public void upgrade() {
		if(isProxy()){
			System.out.println(this.name + "正在升级");
		}else{
			System.out.println("请使用指定的代理访问");

		}

	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePalyerProxy(this);
		return this.proxy;
	}

	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}
}
