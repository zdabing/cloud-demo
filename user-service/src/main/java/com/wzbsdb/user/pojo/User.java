package com.wzbsdb.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2018/11/4
 * @since 1.0.0
 */
@Data
@Table(name = "tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private LocalDateTime birthday;

    private LocalDateTime created;

    private LocalDateTime updated;

    private String note;
}
