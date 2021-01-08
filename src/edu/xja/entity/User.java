package edu.xja.entity;

import java.util.List;

public class User {
    //uid	tinyint
    private Integer uid;
    //uname	varchar
    private String uName;
    //usex	varchar
    private String uSex;
    private List<UserOrder> userOrderList;

    public List<UserOrder> getUserOrderList() {
        return userOrderList;
    }

    public void setUserOrderList(List<UserOrder> userOrderList) {
        this.userOrderList = userOrderList;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", uSex='" + uSex + '\'' +
                ", userOrderList=" + userOrderList +
                '}';
    }
}
