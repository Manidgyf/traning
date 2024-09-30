package com.example.spring_security;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.thymeleaf.standard.expression.AndExpression;

@Configuration
@EnableWebSecurity
public class AppSecurity {
	
//	@Bean
//	protected InMemoryUserDetailsManager configAuth() {
//		List<UserDetails> users = new ArrayList<UserDetails>();
//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		authorities.add(new  SimpleGrantedAuthority("ADMIN"));
//		UserDetails admin = new User("admin", "{noop}admin123", authorities);
//		users.add(admin);
//		List<GrantedAuthority> authorities2 = new ArrayList<GrantedAuthority>();
//		authorities2.add(new SimpleGrantedAuthority("MANAGER"));
//		UserDetails manager = new User("manager", "{noop}manager123", authorities2);
//		users.add(manager);
//		List<GrantedAuthority> authorities3 = new ArrayList<GrantedAuthority>();
//		authorities3.add(new SimpleGrantedAuthority("EMP"));
//		UserDetails emp = new User("emp", "{noop}emp123", authorities3);
//		users.add(emp);
//		
//		return new InMemoryUserDetailsManager(users);
//	}
	@Autowired
	DataSource ds;
//	@Autowired
//	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	UserDetailsManager detailsManager()
	{
		
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(ds);
		users.setUsersByUsernameQuery("select username,password,enabled from user where username=?");
		users.setAuthoritiesByUsernameQuery("select username,authority,enabled from user where username =?");
		return users;
	}

	@SuppressWarnings({ "deprecation", "removal", "removal"})
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(
				auth->auth.requestMatchers("/home").permitAll()
		.requestMatchers("/welcome").authenticated()
		.requestMatchers("/admin").hasAuthority("ADMIN")
		.requestMatchers("/emp").hasAuthority("EMP")
		.requestMatchers("/manager").hasAuthority("MANAGER")
		.requestMatchers("/qa").hasAuthority("QA")
		.requestMatchers("/common").hasAnyAuthority("QA","MANAGER")
		.anyRequest().authenticated())
		.formLogin(fl->fl.defaultSuccessUrl("/welcome",true))
		.logout(logout->logout.logoutUrl("/logout"))
		.exceptionHandling(eh->eh.accessDeniedPage("/ad"));
		
		return http.build();
	}
}

