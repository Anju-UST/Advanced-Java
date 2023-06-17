package com.ust.security.filters;


import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ust.security.MyUserDetailsService;
import com.ust.security.util.Jwtutil;

public class JwtRequestFilter {//extends OncePerRequestFilter {
//	@Autowired
//	private MyUserDetailsService userDetailsService;
//	
//	 @Autowired
//	 private Jwtutil jwtUtil;
//	
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		System.out.println("from doFilterInternal .............");
//		final String authorizationHeader = request.getHeader("Authorization");
//		
//		String username = null;
//		String jwt = null;
//		
//		if(authorizationHeader !=null && authorizationHeader.startsWith("Bearer ")) {
//			
//		    jwt = authorizationHeader.substring(7);
//		    username = jwtUtil.extractUsername(jwt);
//		}	
//		if(username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//			
//			UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//			if(jwtUtil.validateToken(jwt, userDetails)){
//				
//		}
//	    
//		filterChain.doFilter(request,response);
//				
//	}
//	}
}