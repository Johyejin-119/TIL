package com.company.design.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    // 파일 연결
    public void fileConnect() {
        String msg = String.format("Reader %s 로 연결 합니다.", fileName);
        System.out.println(msg);
    }

    // 파일 읽기
    public void fileRead() {
        String msg = String.format("Reader %s 의 내용을 읽어 옵니다.", fileName);
        System.out.println(msg);
    }

    // 파일 연결 종료
    public void fileDisconnect() {
        String msg = String.format("Reader %s 로 연결 종료 합니다.", fileName);
        System.out.println(msg);
    }

}
