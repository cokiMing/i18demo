package com.cokiMing.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by wuyiming on 2017/10/25.
 */
@Component
public class LocaleType {
    @Autowired
    private MessageSource messageSource;

    private static ThreadLocal<Locale> threadLocal = new NamedThreadLocal<Locale>("language_threadLocal");

    public static void setLocale(Locale locale) {
        threadLocal.set(locale);
    }

    public String getMessage(String key) {
        return messageSource.getMessage(key,null,threadLocal.get());
    }
}
