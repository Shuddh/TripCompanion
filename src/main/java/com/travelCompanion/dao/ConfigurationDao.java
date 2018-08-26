package com.travelCompanion.dao;

import com.travelCompanion.vo.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ConfigurationDao {
    List<Configuration> getConfigValues();
    List<Configuration> getStaticTexts();
}
