package com.bjsxt.springboorweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-上午 9:21
 */
@Controller
public class PageController
{
    @RequestMapping("/index")
    public String showPage()
    {
        return "index.html";
    }
}
