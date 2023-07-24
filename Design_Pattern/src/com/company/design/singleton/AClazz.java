package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
        // this.socketClient = new SocketClient(); // AClazz, BClazz 의 두 객체가 동일하지 않은 경우
    }

    public SocketClient getSocketClient() {
        return  this.socketClient;
    }

}
