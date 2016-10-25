package com.hello.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 2016-10-25.
 */
@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BookDao bookDao;

    @Transactional
    public void purchase(int userId, int bookId) {

        int price = bookDao.findPriceById(bookId);

        bookDao.updateBookCount(bookId);

        userDao.updateMoney(userId, price);

    }

    @Transactional
    public int buyOne(int bookId) {

        int price = bookDao.findPriceById(bookId);

        bookDao.updateBookCount(bookId);

        int stock = bookDao.findStockById(bookId);

        System.out.println("Buy book " + bookId + ", " + price + ", stock=" + stock);
        return price;

    }

    @Transactional
    public void checkOut(int userId, List<Integer> bookIds) {

        int count = 0;

        for (int bookId : bookIds) {
            count += buyOne(bookId);
        }

        System.out.println(userId + " checkOut " + count);
        userDao.updateMoney(userId, count);

    }
}
