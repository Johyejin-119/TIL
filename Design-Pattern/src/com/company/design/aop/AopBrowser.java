package com.company.design.aop;

import com.company.design.proxy.HTML;
import com.company.design.proxy.IBrowser;

// aop : 특정 패키지에 포함된 모든 method 를 일괄적으로 구현
/* Aop method 특징
    - 기본적으로 before, after method 가 있음
    - 관점지향, 일괄적적 */
public class AopBrowser implements IBrowser {
    private String url;
    private HTML html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }
    @Override
    public HTML show() {
        before.run(); // html loading time
        if(html == null) {
            this.html = new HTML(url);
            System.out.println("AopBrowser html loading from : " + url);
            try {
                // method 실행 시간이 너무 짧을 수 있어서 sleep()
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        after.run(); // html loading time
        System.out.println("AopBrowser html cache : " + url);
        return html;
    }
}
