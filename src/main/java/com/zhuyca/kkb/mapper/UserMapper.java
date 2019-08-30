package com.zhuyca.kkb.mapper;

import com.zhuyca.kkb.entity.User;

/**
 * @Title :
 * @Program :       mybatisusedemo
 * @Description :
 * @Date :          2019/8/30 15:24
 * @Author :        Y.C.ZHU
 * @Copyright :     Copyright (c) 2016<br>
 */
public interface UserMapper {
    User selectUserById(int id);
}
