package com.springcloud.zuul.springbootzuulgatewayproxystudent;

import com.springcloud.zuul.springbootzuulgatewayproxystudent.filters.ErrorFilter;
import com.springcloud.zuul.springbootzuulgatewayproxystudent.filters.PostFilter;
import com.springcloud.zuul.springbootzuulgatewayproxystudent.filters.PreFilter;
import com.springcloud.zuul.springbootzuulgatewayproxystudent.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringbootZuulgatewayproxyStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZuulgatewayproxyStudentApplication.class, args);
	}

	@Bean
	public PreFilter preFilter(){
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter(){
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter(){
		return  new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter(){
		return new RouteFilter();
	}
}
