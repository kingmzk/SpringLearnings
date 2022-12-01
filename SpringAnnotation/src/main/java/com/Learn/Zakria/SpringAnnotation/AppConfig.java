package com.Learn.Zakria.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Learn.Zakria.SpringAnnotation")
public class AppConfig
{
	//let us fing  alternative for this

//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor()
//	{
//		return new Snapdragon();
//	}
}
