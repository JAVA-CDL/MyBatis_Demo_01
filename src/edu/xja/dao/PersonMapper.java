package edu.xja.dao;

import edu.xja.entity.Person;
import edu.xja.pojo.SelectPersonById;

public interface PersonMapper {
    Person selectPersonById1(Integer id);
    Person selectPersonById2(Integer id);

    SelectPersonById selectPersonById3(Integer id);
}
