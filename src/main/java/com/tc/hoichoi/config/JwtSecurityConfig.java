package com.tc.hoichoi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//import com.tc.hoichoi.filter.JwtRequestFilter;



//@Configuration
//@EnableWebSecurity
//public class JwtSecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	private UserDetailsService bigBangUserDetailsService;
	
//	@Autowired
//	private JwtRequestFilter jwtRequestFilter;
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(bigBangUserDetailsService);
//	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.csrf().disable()
//				.authorizeRequests().antMatchers("/authorization/authenticate",
//						"/warm/auth",
//						"/user/createUser",
//						"/",
//	                    "/v2/api-docs",           // swagger
//	                    "/webjars/**",            // swagger-ui webjars
//	                    "/swagger-resources/**",  // swagger-ui resources
//	                    "/configuration/**",      // swagger configuration
//	                    "/*.html",
//	                    "/favicon.ico",
//	                    "/**/*.html",
//	                    "/**/*.css",
//	                    "/**/*.js"
//						).permitAll().
//						anyRequest().authenticated().and().
//						exceptionHandling().and().sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//		
////		httpSecurity.authorizeRequests().antMatchers("/swagger-ui").permitAll();
//		
//		
//		
//
//	}
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/**");
//		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//	}
//	
//
//
//}
