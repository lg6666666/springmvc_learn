package com.lg.filters;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//过滤器，lg下的请求都经过过滤器
@WebFilter(urlPatterns = "/lg/*")
public class MyFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("过滤器提醒，你请求的地址为："+req.getRequestURI());
        Object username = req.getSession().getAttribute("username");
        if (username==null){
            res.sendRedirect("login");
        }else {
            //完成整个http请求后面的任务
            chain.doFilter(req, res);
        }
    }
}
