package com.web.hotel.config;

import com.web.hotel.interceptor.AdminInterceptor;
import com.web.hotel.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            //重写父类提供的跨域请求处理的接口
            public void addCorsMappings(CorsRegistry registry) {
                //设置允许跨域的路径
                registry.addMapping("/**")  // 可限制哪个请求可以通过跨域
                        .allowedHeaders("*")  // 可限制固定请求头可以通过跨域
                        .allowedMethods("*") // 可限制固定methods可以通过跨域
                        .allowedOrigins("localhost")  // 可限制访问ip可以通过跨域
                        .allowCredentials(true) // 是否允许发送cookie
                        .exposedHeaders(HttpHeaders.SET_COOKIE);
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/user/**");
                registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/admin/**");
            }
        };
    }
}
