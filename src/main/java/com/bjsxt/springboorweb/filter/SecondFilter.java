package com.bjsxt.springboorweb.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 8:41
 */
public class SecondFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        System.out.println("进入SecondFilter....");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开SecondFilter....");
    }

    @Override
    public void destroy()
    {

    }
}
