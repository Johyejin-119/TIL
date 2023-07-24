package com.company.design.proxy;

public class Browser implements IBrowser {
    private String url;

    public Browser(String url) {
        this.url = url;
    }

    // 브라우저가 어떤 페이지 동작 시, 매번 새로운 url 을 로딩하고, 새롭게 생성된 해당 HTML 파일을 return
    @Override
    public HTML show() {
        System.out.println("browser loading html from: " + url);
        return new HTML(url);
    }
}
