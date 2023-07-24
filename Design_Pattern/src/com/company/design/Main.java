package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

     // Singleton
     /* AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        // 같은 싱글톤 방식인 경우 -> ture
        // 하나의 객체를 가져야하는 싱글톤 방식이 아닌, 객체를 각각 생성하는 경우 -> false
        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
      */

     // Adapter
     /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer); // 출력 : 헤어 들라이기 110v on

        // Adapter 를 통해서, 원래 220v인 Cleaner 를 110v에 연결 가능
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter); // 출력 : 청소기 220v on

        // Adapter 를 통해서, 원래 220v인 AirConditioner 를 110v에 연결 가능
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter); // 출력 : 에어컨 220v on
      */

     // Proxy
     /*
        // Browser browser = new Browser("www.naver.com");
        // browser.show(); 를 할때마다, url 이 새롭게 계속 할당(loading)되므로 비효율적
        
        // Proxy 를 통해서, Cache(캐시) 를 만들어 url 저장
        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show(); // 한번만 loading
        browser1.show(); // 동일한 url 은 cache 사용
        browser1.show();
        browser1.show();
        browser1.show();


        // Proxy 를 통해서, Aop 기능 구현
        // 시간 method 는 동시성 문제때문에 atomic 사용
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        // Aop 기능 람다식으로 표현
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis()); // 시작 시간
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get()); // 끝난 시간(실행 시간) = 현재 시간 - 시작 시간
                }
        );
        aopBrowser.show();
        System.out.println("loading time : " + end.get()); // 1.5초 + 실행 시간

        aopBrowser.show();
        System.out.println("loading time2 : " + end.get()); // cache 를 사용해서 0초
      */

     // Decorator
     /*
        ICar audi = new Audi(1000);
        audi.showPrice();

        // 기존 가격에서 등급을 하나씩 추가하는 decorator
        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice(); // 1000

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice(); // 2000

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice(); // 3000
      */

     // Observer
     /*
        // Listener 를 통해서 event 를 전달
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            // 익명 클래스로 입력 버튼 전달
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");

      */

     // Facade
     /*
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect(); // FTP 연결
        ftpClient.moveDirectory(); // 해당 디렉토리로 이동

        Writer writer = new Writer("text.tmp");
        writer.fileConnect(); // 해당 파일 연결
        writer.write(); // 파일에 내용 쓰기

        Reader reader = new Reader("text.tmp");
        reader.fileConnect(); // 쓴 파일 읽기 위해 파일 연결
        reader.fileRead(); // 파일 읽기

        // 읽은 후, 연결 끊기
        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        // 각각 다 method 호출해야하는 번거로움 + 각 객체의 의존성
        // Facade 를 통해서, 한 번에 해결
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
      */

     // Strategy
        // Encoder 객체 자체는 달라지지 않고, 전략에 따라 각기 다른 결과 출력
        Encoder encoder = new Encoder();

        // 전략 세팅
        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();

        // 전략에 따른 결과 확인
        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result); // 출력 : aGVsbG8gamF2YQ==

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult); // 출력 : hello java

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult); // 출력 : ABCDhello java

    }

    // Adapter 콘센트 동작
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
