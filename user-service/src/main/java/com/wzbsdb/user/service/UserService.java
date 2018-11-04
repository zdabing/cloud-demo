package com.wzbsdb.user.service;

import com.wzbsdb.user.mapper.Usermapper;
import com.wzbsdb.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2018/11/4
 * @since 1.0.0
 */
@Service
public class UserService {

    @Autowired
    private Usermapper usermapper;

    public User findById(Long id){
        return usermapper.selectByPrimaryKey(id);
    }
}
