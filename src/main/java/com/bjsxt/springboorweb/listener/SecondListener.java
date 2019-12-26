package com.bjsxt.springboorweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 9:07
 */
public class SecondListener implements ServletContextListener
{
    public void contextDestroyed(ServletContextEvent event)
    {

    }
    public  void contextInitialized(ServletContextEvent event)
    {
        System.out.println("SecondListener...Init...");
    }
}
