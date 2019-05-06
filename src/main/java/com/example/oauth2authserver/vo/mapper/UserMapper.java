package com.example.oauth2authserver.vo.mapper;

import com.example.oauth2authserver.vo.User;
import org.springframework.stereotype.Component;

////这两个注解用于实现Mapper的注解映射，而无需使用XML配置
////但复杂的SQL语句依旧建议使用Mapper.xml来映射
//@Repository
//@Mapper
@Component
public interface UserMapper {
//    @Select("select * from user where username = #{username}")
//    public User selectUser(String username);

    User selectByUsername(String username);
}
