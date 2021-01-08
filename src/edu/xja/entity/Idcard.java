package  edu.xja.entity;
public class Idcard {
    private Integer id;
    private String code;

 // 省略setter和getter方法


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 为方便测试，重写了toString方法
     */
    @Override
    public String toString() {
        return "Idcard [id=" + id + ",code=" + code + "]";
    }
}
