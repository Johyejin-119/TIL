package com.company.design.facade;

public class Ftp {
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    // FTP 연결
    public void connect() {
        System.out.println("FTP Host : " + host + ", Port : " + port + " 로 연결 합니다.");
    }

    // 해당 디렉토리 이동
    public void moveDirectory() {
        System.out.println("FTP path : " + path + "로 이동 합니다. ");
    }

    // FTP 연결 종료
    public void disConnect() {
        System.out.println("FTP 연결을 종료 합니다.");
    }

}
