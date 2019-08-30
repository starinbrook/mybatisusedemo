package com.zhuyca.kkb.service;

import com.zhuyca.kkb.entity.User;
import com.zhuyca.kkb.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Title :
 * @Program :       mybatisusedemo
 * @Description :
 * @Date :          2019/8/30 14:44
 * @Author :        Y.C.ZHU
 * @Copyright :     Copyright (c) 2016<br>
 */
public class UserService {

    public static void main(String[] args) {
        // 指定mybatis全局配置文件路径
        String resource = "mybatis-config.xml";
        try {
            // 使用mybatis工具类Resources加载全局配置文件（全局配置文件中引用了映射文件，因此也会加载映射文件）
            InputStream inputStream = Resources.getResourceAsStream(resource);

            // 使用SqlSessionFactoryBuilder构建SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // 使用sqlSessionFactory获取SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 执行sql
            // 方式一：直接调用SqlSession接口
            User user = (User) sqlSession.selectOne("com.zhuyca.kkb.mapper.UserMapper.selectUserById", 1);
            // 方式二：通过SqlSession获取Mapper类，然后再调用Mapper类的接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user1 = userMapper.selectUserById(1);

            System.out.println(user.getId() + " " + user.getName() + " " + user.getSex() + " " + user.getAge());
            System.out.println(user1.getId() + " " + user1.getName() + " " + user1.getSex() + " " + user1.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
