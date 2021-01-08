package edu.xja.test;

import edu.xja.dao.IdCardMapper;
import edu.xja.dao.PersonMapper;
import edu.xja.dao.RoleMapper;
import edu.xja.dao.UserMapper;
import edu.xja.entity.Idcard;
import edu.xja.entity.Person;
import edu.xja.entity.Role;
import edu.xja.entity.User;
import edu.xja.pojo.MapUser;
import edu.xja.pojo.SelectPersonById;
import edu.xja.pojo.SeletUserParam;
import org.apache.ibatis.session.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.xja.util.SqlSessionUtil.getSqlSessionFactory;

public class SqlSessionTest {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSessionFactory sql SessionFactoryCode = getSqlSessionFactoryCode();
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
//        Map<String,Object> param=new HashMap<>();
//        param.put("u_name","曹操");
//        param.put("u_sex","男");

//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<MapUser> listResultMap = userMapper.selectuserMap();
//        for (MapUser myUser:listResultMap){
//            System.out.println(myUser);
//        }

        IdCardMapper idCardMapper = sqlSession.getMapper(IdCardMapper.class);
        Idcard idcard = idCardMapper.selectCodeById(1);
        System.out.println(idcard.getCode());
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        SelectPersonById selectPersonById = personMapper.selectPersonById3(idcard.getId());
        System.out.println(selectPersonById.getCode());
//        SeletUserParam userParam = new SeletUserParam();
//        userParam.setUname("哈哈哈");
//        userParam.setUsex("男");
//        List<User> userList = userMapper.selectAllUser(userParam);
//        for (User user:userList){
//            System.out.println("UID："+user.getUid()+"，姓名："+user.getuName()+"，性别："+user.getuSex());
//        }


//        SeletUserParam param = new SeletUserParam();
//        param.setUname("曹操");
//        param.setUsex("男");
//        List<User> userList = userMapper.selectAllUser(param);
//        System.out.println(userList.get(0).getuName());

//        User user = new User();
//        user.setuName("哈哈哈");
//        user.setuSex("男");
//        Integer integer = userMapper.addUser(user);
//        sqlSession.commit();
//        System.out.println("添加了"+integer+"条记录");
//        System.out.println("添加的主键是："+user.getUid());



//        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
//        Role role = roleMapper.selectById(1);
//        System.out.println(role.getRoleName());
//        List<Role> all = roleMapper.findAll();
//        System.out.println(all.size());
//        Role role1 = new Role();
//        role1.setId(4);
//        role1.setRoleName("程东亮");
//        role1.setNote("无敌");
//        Integer add = roleMapper.add(role1);
//        sqlSession.commit();
//        System.out.println("添加结果："+add);
//        Role role2 = new Role();
//        role2.setId(3);
//        role2.setRoleName("王占起");
//        role2.setNote("是憨憨");
//        Integer update = roleMapper.update(role2);
//        sqlSession.commit();
//        System.out.println("修改结果："+update);
//        Integer delete = roleMapper.delete(2);
//        sqlSession.commit();
//        System.out.println(delete);
    }
}