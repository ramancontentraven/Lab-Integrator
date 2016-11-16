package com.radmethods.contentraven.labintegrator.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;

@SuppressWarnings("serial")
public class CrObjectMapper extends ObjectMapper {
	public CrObjectMapper() {
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
        setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        registerModule(new SimpleModule("DefaultModule"));
	}
}
