package com.company.design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    // 파일 생성
    public void fileConnect() {
        String msg = String.format("Reader %s 로 연결 합니다.", fileName);
        System.out.println(msg);
    }

    // 파일 이어쓰기
    public void write() {
        String msg = String.format("Reader %s 로 파일 쓰기를 합니다.", fileName);
        System.out.println(msg);
    }

    // 파일 종료
    public void fileDisconnect() {
        String msg = String.format("Reader %s 로 연결 종료 합니다.", fileName);
        System.out.println(msg);
    }


}
