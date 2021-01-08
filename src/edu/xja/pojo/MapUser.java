package edu.xja.pojo;
public class MapUser {
    private Integer mUid;
    private String mUname;
    private String mUsex;
    // 此处省略setter和getter方法
    @Override
    public String toString() {
        return "User[uid=" + mUid + ",uname=" + mUname + ",usex=" + mUsex
                + "]";
    }
}
