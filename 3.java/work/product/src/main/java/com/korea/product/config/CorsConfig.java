package com.korea.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //스프링부트에 설정파일임을 알려주는 어노테이션
public class CorsConfig implements WebMvcConfigurer {

   @Override
   public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**") //CORS 처리를 적용할 매핑 패턴을 선택
         .allowedOrigins("http://127.0.0.1:3000", "http://localhost:3000") //어떤 도메인에 허가할 것인가.
         .allowedMethods("GET","POST","PUT","DELETE")
         .allowedHeaders("*")
         .allowCredentials(false); //쿠키/인증정보 허용   
   }
}