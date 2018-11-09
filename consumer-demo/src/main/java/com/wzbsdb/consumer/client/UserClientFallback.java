package com.wzbsdb.consumer.client;

import com.wzbsdb.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 熔断
 *
 * @author Administrator
 * @create 2018/11/9
 * @since 1.0.0
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
