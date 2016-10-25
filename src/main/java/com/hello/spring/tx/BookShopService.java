package com.hello.spring.tx;

/**
 * 2016-10-25.
 */
public interface BookShopService {

    void purchase(int userId, int bookId) throws BookCountException, UserMoneyException;

}
