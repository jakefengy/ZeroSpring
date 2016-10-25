package com.hello.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 2016-10-25.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate template;

    public int findPriceById(int bookId) {

        String sql = "SELECT price from book WHERE id = ?";

        return template.queryForObject(sql, Integer.class, bookId);
    }

    public void updateBookCount(int bookId) throws BookCountException {

        String sql = "SELECT stock from book WHERE id = ?";

        int count = template.queryForObject(sql, Integer.class, bookId);

        if (count <= 0) {
            throw new BookCountException("库存不足！");
        }

        sql = "UPDATE book SET stock = ? WHERE id = ?";

        template.update(sql, count - 1, bookId);

    }
}
