package com.springsecurity.demo.config;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

//@Service
public class CustomAuthenticatonProvider implements AuthenticationProvider {
	

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		return new UsernamePasswordAuthenticationToken("abc", "123", new ArrayList<>());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return false;
	}

}
