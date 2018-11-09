package com.wzbsdb.consumer.controller;

import com.wzbsdb.consumer.client.UserClient;
import com.wzbsdb.consumer.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2018/11/4
 * @since 1.0.0
 */

@Slf4j
@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback= "queryUserByIdFallback")
public class UserController {
//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private UserClient userclient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        User user = userclient.queryById(id);
        return user;
    }

//    @GetMapping("{id}")
//    @HystrixCommand
//    public String queryById(@PathVariable("id") Long id) {
//        long begin = System.currentTimeMillis();
//        // 地址直接写服务名称即可
//        String baseUrl = "http://user-service/user/" + id;
//        String user = restTemplate.getForObject(baseUrl, String.class);
//        long end = System.currentTimeMillis();
//        // 记录访问用时：
//        log.info("访问用时：{}", end - begin);
//        return user;
//    }

    public String queryUserByIdFallback(){
        return "超时";
    }

//    @GetMapping("{id}")
//    public User queryById(@PathVariable("id") Long id) {
////        //根据服务id获取实例
////        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
////        //从实例中获取ip跟端口
////        ServiceInstance instance = instances.get(0);
////        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
////        User user = restTemplate.getForObject(url, User.class);
//        List<User> users = new ArrayList<>();
//        // 地址直接写服务名称即可
//        String baseUrl = "http://user-service/user/" + id;
//        User user = restTemplate.getForObject(baseUrl, User.class);
//        return user;
//    }
}
