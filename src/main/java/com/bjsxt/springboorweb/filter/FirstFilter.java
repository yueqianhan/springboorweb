package com.bjsxt.springboorweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 8:33
 */
@WebFilter(filterName = "FirstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        System.out.println("进入Filter...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开filter....");
    }

    @Override
    public void destroy()
    {

    }
}
