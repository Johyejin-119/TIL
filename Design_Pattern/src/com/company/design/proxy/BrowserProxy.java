package com.company.design.proxy;

// Cache 기능을 갖는 Proxy Pattern
public class BrowserProxy implements IBrowser{
    private String url;
    private HTML html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public HTML show() {
        // Cache
        if(html == null) {
            // HTML 에 url 데이터가 없다면, 새롭게 url 을 생성해서 브라우저에 반환
            this.html = new HTML(url);
            System.out.println("BrowserProxy loading html from: " + url);
        }
        // HTML 에 url 데이터가 있다면, 기존에 저장된 url 을 반환 -> Cache
        System.out.println("BrowserProxy use cache html: " + url);
        return html;
    }
}
