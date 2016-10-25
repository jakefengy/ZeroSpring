package com.hello.spring.tx;

import java.util.List;

/**
 * 2016-10-25.
 */
public interface BookShopService {

    void purchase(int userId, int bookId);

    int buyOne(int bookId);

    void checkOut(int userId, List<Integer> bookIds);

}
