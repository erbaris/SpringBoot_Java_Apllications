package com.erbaris.app.configuration.runner;

import com.erbaris.app.FindLands;
import com.erbaris.app.runner.FindLandsAppRunner;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindLandsAppRunnerConfig {
    private final FindLands m_findLands;

    public FindLandsAppRunnerConfig(FindLands findLands) {
        m_findLands = findLands;
    }

    @Bean
    public com.erbaris.app.runner.FindLandsAppRunner createFindLandsRunner()
    {
        return new FindLandsAppRunner(m_findLands);
    }
    @Bean
    public ApplicationRunner run()
    {
        return args -> FindLands.run();
    }
}
