package com.bruce.proxyPartterns.demo2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 开始找代练了
 *
 * 普通的代理模式
 */
public class Client {
	public static void main(String[] args) {
		// 玩家
		IGamePlayer gamePlayer =  new GamePlayer("张三");
		// 代理
		IGamePlayer proxyPlayer = new GamePlayerProxy(gamePlayer);
		System.out.println("startTime is" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		proxyPlayer.login("zhangsan","password");
		proxyPlayer.killBoss();
		proxyPlayer.upgrade();
		System.out.println("endTime is" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

	}
}
