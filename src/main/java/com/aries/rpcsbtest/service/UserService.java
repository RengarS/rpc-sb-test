package com.aries.rpcsbtest.service;

import com.aries.rpcsbtest.domain.User;
import com.aries.rpcsbtest.mapper.UserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/25
 * Description:
 */
@Service
@Primary
public class UserService extends ServiceImpl<UserMapper, User> {
}
