package com.bjsxt.springboorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringboorwebApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringboorwebApplication.class, args);
    }

}
