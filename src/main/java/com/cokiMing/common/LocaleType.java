package com.cokiMing.common;

import org.springframework.context.MessageSource;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by wuyiming on 2017/10/25.
 */
@Component
public class LocaleType {

    private static MessageSource messageSource;

    private static ThreadLocal<Locale> threadLocal = new NamedThreadLocal<Locale>("language_threadLocal");

    public static void setLocale(Locale locale) {
        threadLocal.set(locale);
    }

    public static String getMessage(String key) {
        if (messageSource == null) {
            messageSource = SpringContextHolder.getBean(MessageSource.class);
        }

        return messageSource.getMessage(key,null,threadLocal.get());
    }
}
