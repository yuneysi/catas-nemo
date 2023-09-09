package org.openapitools.configuration;

import com.sii.api.model.EquipmentType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.equipmentTypeConverter")
    Converter<String, EquipmentType> equipmentTypeConverter() {
        return new Converter<String, EquipmentType>() {
            @Override
            public EquipmentType convert(String source) {
                return EquipmentType.fromValue(source);
            }
        };
    }

}
