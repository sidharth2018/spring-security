package com.springsecurity.demo.config;

import javax.servlet.FilterChain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity(debug=true)
public class SecurityConfiguration {
	
	
//	@Bean
//	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity auth) throws Exception {
//		
//		auth.authorizeHttpRequests()
//		.antMatchers("/name","/orders").authenticated();
//		
//		auth.authorizeHttpRequests().antMatchers("/contact","/about","/create").permitAll();
//		auth.csrf().disable();
//		auth.cors().disable();
////		auth.httpBasic(Customizer.withDefaults());
////		auth.addFilterAfter(new JwtGeneratorFilter(), BasicAuthenticationFilter.class);
////		auth.addFilterBefore(new JwtValidatorFilter(), BasicAuthenticationFilter.class);
////		auth.addFilterBefore(new NonLoginUrlFilter(), UsernamePasswordAuthenticationFilter.class);
//		return auth.build();
//		
//	}
//	
//	@Bean
//	public InMemoryUserDetailsManager userService() {
//		InMemoryUserDetailsManager userds = new InMemoryUserDetailsManager();
//		UserDetails u1 = User.withDefaultPasswordEncoder()
//				.username("abc")
//				.password("123")
//				.authorities("admin")
//				.build();
//		UserDetails u2 = User.withDefaultPasswordEncoder()
//				.username("efg")
//				.password("345")
//				.authorities("user")
//				.build();
//		userds.createUser(u1);
//		userds.createUser(u2);
//		return userds;
//	}
	
//	@Bean 
//	FilterRegistrationBean<CustomFilter2> fBean(){
//		FilterRegistrationBean<CustomFilter2> b = new FilterRegistrationBean<CustomFilter2>();
//		b.setFilter(new CustomFilter2());
//		b.addUrlPatterns("/orders");
//		return b;
//	}
//	
//	@Bean 
//	FilterRegistrationBean<JwtGeneratorFilter> gBean(){
//		FilterRegistrationBean<JwtGeneratorFilter> b = new FilterRegistrationBean<JwtGeneratorFilter>();
//		b.setFilter(new JwtGeneratorFilter());
//		b.addUrlPatterns("/login");
//		return b;
//	}
	
	@Bean
	PasswordEncoder encoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
