package cn.itcast.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        System.out.println("111111");
        System.out.println("2222222");
        SpringApplication.run(UserApplication.class, args);
    }
}
