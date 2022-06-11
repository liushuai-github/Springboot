package com.example.springssmp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = SpringSsmpApplication.class)
@ContextConfiguration(classes = SpringSsmpApplication.class)
class SpringSsmpApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("aaa");
    }

}
