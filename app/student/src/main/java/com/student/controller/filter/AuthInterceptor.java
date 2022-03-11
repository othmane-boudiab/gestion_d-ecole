package com.student.controller.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getServletPath().equals("/login")) return true;

        HttpSession session = request.getSession(false);
        if (session.getAttribute("admin") != null) return true;
        else response.sendRedirect(request.getContextPath().concat("/login"));
        return false;
    }
}
