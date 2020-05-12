package com.slionh.societynews.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/*
 * Create by s lion h on 2020-01-01
 */
@Configuration
@MapperScan(basePackages = {"com.slionh.societynews.mapper.dbTencent"}, sqlSessionFactoryRef = "sqlSessionFactoryDb2")
public class DbTencentConfig {
    @Autowired
    @Qualifier("tencentdb")
    private DataSource dataSourceDb2;


    public DbTencentConfig() {
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryDb2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(this.dataSourceDb2);
        factoryBean.setMapperLocations((new PathMatchingResourcePatternResolver()).getResources("classpath:mapping/tencent/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateDb2() throws Exception {
        return new SqlSessionTemplate(this.sqlSessionFactoryDb2());
    }

}
