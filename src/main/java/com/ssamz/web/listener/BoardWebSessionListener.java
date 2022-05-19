package com.ssamz.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class BoardWebSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

	public BoardWebSessionListener() {
		System.out.println("===> BoardWebSessionListener 생성");
	}

	// HttpSessionListener에서 오버라이딩. 라이프사이클
	public void sessionCreated(HttpSessionEvent se) { 
		System.out.println("===> 세션이 생성됨");
	}
	
	public void sessionDestroyed(HttpSessionEvent se) { 
		System.out.println("===> 세션이 삭제됨");
	}
	
	
	// HttpSessionAttributeListener에서 오버라이딩
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("===> 세션의 정보가 추가됨");
	}
	
	
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("===> 세션의 정보가 삭제됨");
	}
	
	
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("===> 세션의 정보가 덮어쓰기됨");
	}
}
