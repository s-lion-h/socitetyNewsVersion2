package com.slionh.societynews.Inteceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    public WebConfigurer() {
    }

    @Bean
    public RequestlogInterceptor requestlogInterceptor() {
        return new RequestlogInterceptor();
    }

    @Bean
    public NewsCountInterceptor newsCountInterceptor() {
        return new NewsCountInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.requestlogInterceptor()).addPathPatterns(new String[]{"/"}).addPathPatterns(new String[]{"/classificationNews"}).addPathPatterns(new String[]{"/newsDetail"});
        registry.addInterceptor(this.newsCountInterceptor()).addPathPatterns(new String[]{"/newsDetail"});
    }
}
