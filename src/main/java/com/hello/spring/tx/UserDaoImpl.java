package com.hello.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 2016-10-25.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateMoney(int id, int money) throws UserMoneyException {

        String sql = "SELECT money FROM user WHERE id = ?";

        int balance = jdbcTemplate.queryForObject(sql, Integer.class, id);

        if (balance < money) {
            throw new UserMoneyException("余额不足！");
        }

        sql = "UPDATE user SET money = ? WHERE id = ?";

        jdbcTemplate.update(sql, balance - money, id);

    }
}
