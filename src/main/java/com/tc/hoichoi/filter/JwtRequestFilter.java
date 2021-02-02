package com.tc.hoichoi.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import com.tc.hoichoi.util.JwtUtil;

//@Component
//@Order(value = 1)
//public class JwtRequestFilter implements Filter {
//
//	@Autowired
//	private JwtUtil jwtUtil;

//	@Autowired
//	UserService UserService;

//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws ServletException, IOException {
//		System.out.println("auth filter");
//		final String authorizationHeader = ((HttpServletRequest) request).getHeader("Authorization");
//
//		String userId = null;
//		String jwt = null;
//
//		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//			jwt = authorizationHeader.substring(7);
//			userId = jwtUtil.extractUserId(jwt);
//		}

//		if (userId != null && SecurityContextHolder.getContext().getAuthentication() == null) {

//			UserEntity userEntity = UserService.getUserById(userId);

//			if (jwtUtil.validateToken(jwt, userEntity)) {

//				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//						userEntity, null, null);
//				usernamePasswordAuthenticationToken
//						.setDetails(new WebAuthenticationDetailsSource().buildDetails((HttpServletRequest) request));
//				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			}
//		}
//		chain.doFilter(request, response);
//	}
//
//}
