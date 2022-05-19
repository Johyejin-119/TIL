package com.ssamz.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BoardWebContextListener implements ServletContextListener {

	public BoardWebContextListener() {
		System.out.println("===> BoardWebContextListener 생성");
	}
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("===> contextInitialized 생성");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("===> contextDestroyed 생성");
	}

}
