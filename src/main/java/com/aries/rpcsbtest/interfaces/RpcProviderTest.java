package com.aries.rpcsbtest.interfaces;

import com.aries.rpcsbtest.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/24
 * Description:
 */
public interface RpcProviderTest {

    List<User> list();

    void bark();

    void test();
}
