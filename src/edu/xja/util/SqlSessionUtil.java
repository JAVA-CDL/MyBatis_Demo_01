package edu.xja.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSessionFactory getSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        InputStream is;
        SqlSessionFactory sqlSessionFactory = null;
        try {
            is = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }
}
