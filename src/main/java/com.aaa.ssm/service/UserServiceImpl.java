package com.aaa.ssm.service;

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserDao ud;
    /*@Autowired
    private JedisUtil jedisUtil;*/
    @Override
    public List<Map> selectUser() {
        /*Object userList=jedisUtil.getObject("userList");
        if (userList!=null){
            System.out.println("从redi缓存中获取！！！");
            return (List<Map>) userList;
        }else{
            System.out.println("从数据库中获取。。。。。。");
            List<Map> userList1=ud.selectUser();
            jedisUtil.putObject("userList",userList1);*/

        return ud.selectUser();
        /*}*/
    }

}
