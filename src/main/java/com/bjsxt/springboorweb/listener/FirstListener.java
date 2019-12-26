package com.bjsxt.springboorweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 9:00
 */
@WebListener
public class FirstListener implements ServletContextListener
{
    public void  contextDestroyed(ServletContextEvent event)
    {

    }

    public void  contextInitialized(ServletContextEvent event)
    {
        System.out.println("Listener...Init...");
    }
}
