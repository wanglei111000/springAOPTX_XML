package com.st.sp.test;

import com.st.sp.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester03 {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:/conf/applicationContext.xml");
    @Test
    public void test() {
        BookService bookService = ioc.getBean(BookService.class);
        bookService.checkout("Jerry","ISBN-001");

    }
}
