package com.lg.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器实现

public class MyInterceptor implements HandlerInterceptor {
    //在符合条件的方法执行之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //符合条件后才能往下执行
        System.out.println("你请求的地址为："+request.getRequestURI());
        return true;
    }
    //在符合条件的方法调用dispatcherServlet进行试图渲染之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    //在符合条件的方法调用dispatcherServlet进行试图渲染之后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
