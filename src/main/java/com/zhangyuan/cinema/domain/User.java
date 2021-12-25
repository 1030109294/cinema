package com.zhangyuan.cinema.domain;

/**
 * @author 17925
 * @date 2021/12/25 15:11
 */

public class User {
    private int uid;
    private String username;
    private String password;
    private String createDate;
    private int right;
    private int phone;

    public User() {
    }

    public User(int uid, String username, String password, String createDate, int right, int phone) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.right = right;
        this.phone = phone;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createDate='" + createDate + '\'' +
                ", right=" + right +
                ", phone=" + phone +
                '}';
    }
}
