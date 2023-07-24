package com.ssamz.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//@WebListener
public class BoardWebSessionListener implements HttpSessionListener, 
                                                HttpSessionAttributeListener {

    public BoardWebSessionListener() {
        System.out.println("===> BoardWebSessionListener 생성");
    }

    public void sessionCreated(HttpSessionEvent se) {
    	System.out.println("===> 세션이 생성됨");
    }
    
    public void sessionDestroyed(HttpSessionEvent se) {
    	System.out.println("===> 세션이 삭제됨");
    }
    
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("---> 세션에 정보가 추가됨");
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("---> 세션에 정보가 삭제됨");
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("---> 세션에 정보가 덮어쓰기됨");
	}
}
