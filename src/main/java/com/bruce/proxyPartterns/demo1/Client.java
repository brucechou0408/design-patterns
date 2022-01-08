package com.bruce.proxyPartterns.demo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 代理模式
 * 懵懵懵
 *
 * @author bruce
 */
public class Client {
	public static void main(String[] args) {
		// 定义一个痴迷游戏的玩家
		IGamePlayer player = new GamePlayer("张三");
		System.out.println("startTime is" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		player.login("zhangsan","password");
		player.killBoss();
		player.upgrade();
		System.out.println("endTime is" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

}
