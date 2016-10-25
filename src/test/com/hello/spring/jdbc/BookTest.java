package com.hello.spring.jdbc;

import com.hello.spring.tx.BookDao;
import com.hello.spring.tx.BookShopService;
import com.hello.spring.tx.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-25.
 */
public class BookTest {

    private ApplicationContext ctx;
    private UserDao userDao;
    private BookDao bookDao;
    private BookShopService bookShopService;

    {
        ctx = new ClassPathXmlApplicationContext("spring-jdbc-config.xml");
        userDao = (UserDao) ctx.getBean("userDao");
        bookDao = (BookDao) ctx.getBean("bookDao");
        bookShopService = (BookShopService) ctx.getBean("bookShopService");
    }

    @Test
    public void testUpdateMoney() {

        userDao.updateMoney(2, 100);

    }

    @Test
    public void testFindPriceById() {
        System.out.println(bookDao.findPriceById(1));
    }

    @Test
    public void testUpdateBookCount() {
        bookDao.updateBookCount(1);
    }

    @Test
    public void testPurchase() {

        bookShopService.purchase(2, 1);

    }

}
