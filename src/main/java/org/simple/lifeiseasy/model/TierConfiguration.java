package org.simple.lifeiseasy.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TierConfiguration {
	private String tier;@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssZ", timezone="Europe/Berlin")
	private Timestamp timestamp;
}
