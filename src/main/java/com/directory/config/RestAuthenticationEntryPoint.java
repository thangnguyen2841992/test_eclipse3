package com.directory.config;

import java.io.IOException;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.AuthenticationEntryPoint;

public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			org.springframework.security.core.AuthenticationException authException)
			throws IOException, ServletException {
		   System.out.println("Unauthorized error. Message - {}" + authException.getMessage());
	        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error -> Unauthorized");
		
	}
	
}
