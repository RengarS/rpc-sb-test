package com.aries.rpcsbtest.web;

import com.aries.dubbo.like.rpc.common.annotations.RpcConsumer;
import com.aries.rpcsbtest.domain.User;
import com.aries.rpcsbtest.interfaces.RpcProviderTest;
import com.aries.rpcsbtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/24
 * Description:
 */
@RestController
public class TestController {

    @RpcConsumer(interfaceClass = RpcProviderTest.class)
    private RpcProviderTest rpcProviderTest;
    @Autowired
    private RpcProviderTest rpcProviderTest1;
    @Autowired
    private TestService testService;

    @RequestMapping("/local/test")
    public void localTest() {
        rpcProviderTest1.test();
    }

    @RequestMapping("/local/test1")
    public void localTest1() {
        rpcProviderTest1.bark();
    }

    @RequestMapping("/local/list")
    public List<User> localList() {
        return rpcProviderTest1.list();
    }

    @RequestMapping("/rpc/test")
    public void test() {
        rpcProviderTest.test();
    }

    @RequestMapping("/rpc/test1")
    public void test1() {
        rpcProviderTest.bark();
    }

    @RequestMapping("/rpc/list")
    public List<User> list() {
        return rpcProviderTest.list();
    }
}
