package com.hello.spring.jdbc;

/**
 * 2016-10-24.
 */
public class User {

    private Integer id;
    private String nickname;
    private String password;
    private String firstname;
    private String lastname;

    public User() {
    }

    public User(Integer id, String nickname, String password, String firstname, String lastname) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User={id: " + id + ", nickname: " + nickname + ", password: " + password + ", first_name: " + firstname + ", last_name: " + lastname + "}";
    }

}
