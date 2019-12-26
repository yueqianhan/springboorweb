package com.bjsxt.springboorweb.config;

import com.bjsxt.springboorweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 8:23
 */
@Configuration
public class ServletConfig
{
    @Bean
    public ServletRegistrationBean getServletRegistration()
    {
        ServletRegistrationBean bean =new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
