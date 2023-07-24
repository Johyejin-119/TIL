package com.example.springioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider  implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // (ApplicationContext applicationContext) 알아서 주입
        context = applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
