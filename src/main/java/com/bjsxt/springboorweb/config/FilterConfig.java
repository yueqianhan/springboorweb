package com.bjsxt.springboorweb.config;

import com.bjsxt.springboorweb.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 8:42
 */
@Configuration
public class FilterConfig
{
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean()
    {
        FilterRegistrationBean bean =new FilterRegistrationBean(new SecondFilter());
//        bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/second");
        return bean;
    }
}
