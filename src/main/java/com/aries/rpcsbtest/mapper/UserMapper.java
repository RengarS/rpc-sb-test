package com.aries.rpcsbtest.mapper;

import com.aries.rpcsbtest.domain.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/25
 * Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
