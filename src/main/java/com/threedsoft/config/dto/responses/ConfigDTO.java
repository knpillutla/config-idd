package com.threedsoft.config.dto.responses;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ConfigDTO  implements Serializable{
	Long id;
	Long wbcId;
	Long wblcId;
	String application;
	String profile;
	String module;
	String key;
	String value;
	String busOverrideVal;
	String busLocnOverrideVal;
	String userId;
	String comments;
}
