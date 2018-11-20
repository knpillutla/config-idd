package com.threedsoft.config.dto.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.util.dto.WMSRequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ConfigOverrideDTORequest extends WMSRequestDTO{
	String application;
	String profile;
	String module;
	String key;
	String value;
	String isBase;
	String isBusNameOverrideConfig;
	String isBusNameAndLocnOverrideConfig;
	String overrideForBusiness;
	String orderrideForBusinessAndLocn;
}
