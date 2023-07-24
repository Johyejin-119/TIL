package com.company.design.adapter;

// 자기자신(110V)와 연결할 대상(220V)를 연결(Adapter)하여 변환
public class SocketAdapter implements Electronic110V{
    private Electronic220V electronic220V;

    public  SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
