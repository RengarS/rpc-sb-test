package com.aries.rpcsbtest.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Author: aries
 * Date: 2018/8/25
 * Description:
 */
@Data
@TableName("t_user")
public class User {
    private String id;
    private String name;
}
