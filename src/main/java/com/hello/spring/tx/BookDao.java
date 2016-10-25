package com.hello.spring.tx;

/**
 * 2016-10-25.
 */
public interface BookDao {

    int findPriceById(int bookId);

    void updateBookCount(int bookId) throws BookCountException;

}
