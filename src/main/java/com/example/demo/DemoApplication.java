package com.example.demo;

import com.example.demo.beans.ConfigBean;
import com.example.demo.beans.WelcomeProperties;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
@MapperScan("com.example.demo.mapper")
//@ImportResource({"classpath:some-application.xml"})
public class DemoApplication {
	WelcomeProperties wp;
	ConfigBean cb;

	@Autowired
	public DemoApplication(ConfigBean cb) {
		this.cb = cb;
	}

	@Autowired
	void setWelcomeProperties(WelcomeProperties wp) {
		this.wp = wp;
	}

	@RequestMapping("/")
	String index() {
		String welcome = "Hello, Spring Boot!";
		if (cb != null) {
			welcome = cb.getWelcome() + " " + welcome + " " + cb.isGuest() + wp.isGuest();
		}
		return welcome;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
