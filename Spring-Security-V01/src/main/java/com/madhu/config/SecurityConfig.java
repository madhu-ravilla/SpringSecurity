package com.madhu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author mravilla
 *
 */
@Configuration
public class SecurityConfig {

	@Bean
	UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("mravilla").password(passwordEncoder().encode("Welcome01")).authorities("read")
				.build();
		userDetailsService.createUser(user);
		return userDetailsService;
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.httpBasic();
//		http.authorizeHttpRequests().anyRequest().authenticated();
//		return http.build();
//
//	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//http.httpBasic(Customizer.withDefaults());
		http.formLogin();
		http.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated());
		return http.build();

	}

	
}
