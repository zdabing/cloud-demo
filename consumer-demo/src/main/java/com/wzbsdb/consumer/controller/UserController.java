package com.wzbsdb.consumer.controller;

import com.wzbsdb.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2018/11/4
 * @since 1.0.0
 */
@RestController
@RequestMapping("consumer")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        String url = "http://192.168.2.178:8081/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
