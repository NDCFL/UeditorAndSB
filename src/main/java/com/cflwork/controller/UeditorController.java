package com.cflwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenfeilong on 2017/10/18.
 */
@Controller
@RequestMapping("ueditor")
public class UeditorController {
    @RequestMapping("core")
    public String core(){
        return "ueditor/jsp/controller";
    }

    /**
     * 替换原始的ue的controller.jsp
     * @param response
     * @param request
     * @throws Exception

    @RequestMapping("core")
    public void core(HttpServletResponse response, HttpServletRequest request) throws Exception {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding( "utf-8" );
        response.setHeader("Content-Type" , "text/html");
        String rootPath = request.getSession().getServletContext().getRealPath( "/" );
        out.write( new ActionEnter( request, rootPath ).exec() );
    }*/
}
