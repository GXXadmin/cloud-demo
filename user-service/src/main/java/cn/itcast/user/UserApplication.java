package cn.itcast.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello1111");
        System.out.println("hello2222");
        System.out.println("hello0000");
        SpringApplication.run(UserApplication.class, args);
    }
}
