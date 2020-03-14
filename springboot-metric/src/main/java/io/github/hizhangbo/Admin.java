package io.github.hizhangbo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bob
 * @date 2020-03-14 1:58
 */
@SpringBootApplication
@EnableAdminServer
public class Admin {
    public static void main(String[] args) {
        SpringApplication.run(Admin.class, args);
    }
}
