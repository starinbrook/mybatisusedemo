package com.zhuyca.kkb.mapper;

import com.zhuyca.kkb.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Title :
 * @Program :       mybatisusedemo
 * @Description :
 * @Date :          2019/8/30 15:24
 * @Author :        Y.C.ZHU
 * @Copyright :     Copyright (c) 2016<br>
 */
public interface UserMapper {
    /**
     * 使用XML
     *
     * @param id
     * @return
     */
    User selectUserById(int id);

    /**
     * 使用注解
     *
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User selectUserByIdUserAnnotation(int id);
}
