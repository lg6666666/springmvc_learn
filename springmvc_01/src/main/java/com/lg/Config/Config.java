package com.lg.Config;

import com.lg.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//添加拦截器方法
@Configuration
public class Config implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns任何类型的路径都经过拦截器;excludePathPatterns排除一些请求
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/img/**","/js/**","/css/**");
    }
}
