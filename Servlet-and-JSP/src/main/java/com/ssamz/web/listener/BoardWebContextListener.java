package com.ssamz.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class BoardWebContextListener implements ServletContextListener {

    public BoardWebContextListener() {
        System.out.println("===> BoardWebContextListener 생성");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("---> contextInitialized() 호출");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("---> contextDestroyed() 호출");
    }

	
}
