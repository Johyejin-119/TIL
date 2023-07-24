package com.company.design.singleton;

// singleton 은 자기 자신을 객체로 가짐
public class SocketClient {
    private static SocketClient socketClient = null;
    private  SocketClient() { // 기본 생성자는 private 로 막기
        // AClazz, BClazz 각자 새로운 객체로 초기화하는 경우(두 객체가 동일하지 않은 경우)에는 public
    }

    // 어떤 class 라도 SocketClient 에 바로 접근 가능하도록 static
    public static SocketClient getInstance() {
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient; // 객체 자기자신을 return
    }

    public void connect() {
        System.out.println("connect");
    }
}
