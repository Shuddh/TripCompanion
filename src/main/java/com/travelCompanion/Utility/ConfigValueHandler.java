package com.travelCompanion.Utility;

import com.travelCompanion.dao.ConfigurationDao;
import com.travelCompanion.vo.Configuration;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ConfigValueHandler {
    private Logger LOGGER = Logger.getLogger(ConfigValueHandler.class);

    @Autowired
    ConfigurationDao configurationDao;

    Map<String, String> configValues = new HashMap<String, String>();

    @PostConstruct
    public void pullAllConfigValues(){
        LOGGER.info("Loading config values into EhCache...");

        List<Configuration> configurations = configurationDao.getConfigValues();
        if(configurations != null) {
            for (Configuration configuration : configurations) {
                configValues.put(configuration.getKey(), configuration.getValue());
                getConfigValue(configuration.getKey());
            }
            LOGGER.info("Successfully loaded config values into EhCache");
        } else {
            LOGGER.error("Failed to load config values into EhCache");
        }
    }

    @Cacheable(value="configValues", key="#key")
    public String getConfigValue(String key) {
        return configValues.get(key);
    }

    @CacheEvict(value = "configValues", allEntries = true)
    public void invalidateConfigValue() {
        pullAllConfigValues();
    }
}
