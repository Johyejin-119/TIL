package com.company.design.facade;

// Facade 객체로 Ftp, Reader, Writer 기능 모아서 제공
public class SftpClient {
    private  Ftp ftp;
    private Reader reader;
    private Writer writer;

    // 객체를 한 번 감싸서, 의존성은 SftpClient 가 전부 가져김
    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    // 오버로딩 -> 새로운 인터페이스 제공(Facade 의 핵심 역할)
    public SftpClient(String host, int port, String path, String fileName) {
        this.ftp = new Ftp(host, port, path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect() {
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect() {
        writer.fileDisconnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read() {
        reader.fileRead();
    }

    public void write() {
        writer.write();
    }
}
