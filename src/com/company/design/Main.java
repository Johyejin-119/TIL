package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

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
    }

    // Adapter 콘센트 동작
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
