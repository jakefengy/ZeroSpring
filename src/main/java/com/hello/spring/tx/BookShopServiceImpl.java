package com.hello.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
