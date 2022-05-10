package com.company.design;

import com.company.design.adapter.*;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

     // Singleton Pattern
     /* AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        // 같은 싱글톤 방식인 경우 -> ture
        // 하나의 객체를 가져야하는 싱글톤 방식이 아닌, 객체를 각각 생성하는 경우 -> false
        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
      */

     // Adapter Pattern
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
        // Browser browser = new Browser("www.naver.com");
        // browser.show(); 를 할때마다, url 이 새롭게 계속 할당(loading)되므로 비효율적
        
        // Proxy 를 통해서, Cache(캐시) 를 만들어 url 저장
        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show(); // 한번만 loading
        browser1.show(); // 동일한 url 은 cache 사용
        browser1.show();
        browser1.show();
        browser1.show();
    }

    // Adapter 콘센트 동작
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
