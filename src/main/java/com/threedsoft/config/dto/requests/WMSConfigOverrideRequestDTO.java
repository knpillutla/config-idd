package com.threedsoft.config.dto.requests;

import java.util.List;

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
public class WMSConfigOverrideRequestDTO extends WMSRequestDTO{
	String busName;
	Integer locnNbr;
	String userId;
	List<ConfigOverrideDTORequest> configOverrideList;
}
