package io.github.hizhangbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Bob
 * @date 2020-03-14 11:00
 */
@SpringBootApplication
@EnableScheduling
public class Client {
    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}
