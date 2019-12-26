package com.bjsxt.springboorweb.config;

import com.bjsxt.springboorweb.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 9:09
 */
@Configuration
public class ListenerConfig
{
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean()
    {
        ServletListenerRegistrationBean bean =new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
