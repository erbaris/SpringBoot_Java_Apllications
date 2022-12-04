package com.erbaris.app.configuration;

import com.erbaris.app.FindLands;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FindLandsConfig {
    @Bean
    @Scope("prototype")
    public FindLands createFindLands()
    {
        return new FindLands();
    }
}
