package com.hello.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 2016-10-24.
 */
public class JdbcTest {

    ApplicationContext ctx = null;
    JdbcTemplate template = null;
    NamedParameterJdbcTemplate namedParameterJdbcTemplate = null;

    {
        ctx = new ClassPathXmlApplicationContext("spring-jdbc-config.xml");
        template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        namedParameterJdbcTemplate = ctx.getBean(NamedParameterJdbcTemplate.class);
    }

    // Example JdbcTemplate

    @Test
    public void testConnection() throws SQLException {

        DataSource dataSource = ctx.getBean(DataSource.class);
        dataSource.getConnection();

    }

    @Test
    public void add() {

        String sql = "INSERT INTO user(id, nickname, password, first_name, last_name) VALUES (?,?,?,?,?)";
        String[] args = new String[]{"5", "AA", "111", "a", "a"};

        template.update(sql, args);

    }

    @Test
    public void addBatch() {
        String sql = "INSERT INTO user(id, nickname, password, first_name, last_name) VALUES (?,?,?,?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        String[] args = new String[]{"6", "BB", "111", "b", "b"};
        list.add(args);
        args = new String[]{"7", "CC", "111", "c", "c"};
        list.add(args);

        template.batchUpdate(sql, list);
    }

    @Test
    public void update() {

        String sql = "UPDATE user SET password=? where id=?";

        Object[] args = new Object[]{"222", 7};

        template.update(sql, args);

    }

    @Test
    public void updateBatch() {
        String sql = "UPDATE user SET password=? where id=?";

        List<Object[]> list = new ArrayList<Object[]>();

        Object[] args = new Object[]{"222", 7};
        list.add(args);

        args = new Object[]{"111", 6};
        list.add(args);

        template.batchUpdate(sql, list);
    }

    @Test
    public void query() {

        String sql = "SELECT * FROM user WHERE id = ?";

        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        User users = template.queryForObject(sql, rowMapper, 3);
        System.out.println(users);

    }

    @Test
    public void queryAll() {

        String sql = "SELECT * FROM user";

        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        List<User> users = template.query(sql, rowMapper);
        System.out.println(users);

    }

    // Example NamedParameterJdbcTemplate

    @Test
    public void queryUser() {
        String sql = "SELECT * FROM user";

        SqlParameterSource source = new BeanPropertySqlParameterSource(User.class);
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        List<User> users = namedParameterJdbcTemplate.query(sql, source, rowMapper);
        System.out.println(users);

    }

    @Test
    public void addUser() {
        String sql = "INSERT INTO user(id, nickname, password, firstname, lastname) VALUES (:id,:nickname,:password,:firstname,:lastname)";

        User user = new User(8, "DD", "123", "d", "d");

        SqlParameterSource source = new BeanPropertySqlParameterSource(user);

        namedParameterJdbcTemplate.update(sql, source);

    }


}
