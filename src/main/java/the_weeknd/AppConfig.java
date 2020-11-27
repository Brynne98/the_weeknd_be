package the_weeknd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(@ComponentScan({"the_weeknd.dao", "the_weeknd.service"}))
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        dataSource.setUrl("jdbc:mysql://localhost:3306/the_weeknd_lyrics");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        return factoryBean;
    }

    @Bean
    public JpaTransactionManager geJpaTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
        return transactionManager;
    }
}
