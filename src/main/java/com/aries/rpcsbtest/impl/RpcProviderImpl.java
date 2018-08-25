package com.aries.rpcsbtest.impl;

import com.aries.dubbo.like.rpc.common.annotations.RpcProvider;
import com.aries.rpcsbtest.domain.User;
import com.aries.rpcsbtest.interfaces.RpcProviderTest;
import com.aries.rpcsbtest.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/24
 * Description:
 */
@RpcProvider(interfaceClass = RpcProviderTest.class)
public class RpcProviderImpl implements RpcProviderTest {

    @Autowired
    private UserService userService;

    @Override
    public List<User> list() {
        UserService userService=this.userService;
        return userService.selectList(new EntityWrapper<>());
    }

    @Override
    public void bark() {
        System.out.println("bark!");
    }

    @Override
    public void test() {

    }

}
