package com.cflwork.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
@WebFilter(filterName = "ueditorFilter",urlPatterns = {"/*"})
public class UEditorFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		System.out.println(url);
		if (url.contains("/jsp/controller.jsp") || url.contains("/ueditor/core")) {
			filterChain.doFilter(request, response);
		}else{
			super.doFilter(request, response, filterChain);
		}
	}
}