package com.web.hotel.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.hotel.utils.APIResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("userId") != null && session.getAttribute("role").equals(0)){
            return true;
        }else {
            setCorsMappings(request, response);
            PrintWriter writer = response.getWriter();
            APIResponse result = APIResponse.fail401("no login");
            ObjectMapper mapper = new ObjectMapper();
            writer.write(mapper.writeValueAsString(result));
            return false;
        }
    }

    private void setCorsMappings(HttpServletRequest request, HttpServletResponse response){
        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Cookie, Accept,");
        response.setHeader("Access-Control-Allow-Credentials", "true");
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
