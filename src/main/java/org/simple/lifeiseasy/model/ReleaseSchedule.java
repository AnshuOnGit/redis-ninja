package org.simple.lifeiseasy.model;


import java.util.List;

import lombok.Data;

@Data
public class ReleaseSchedule {
	private String environment;
	private List<String> fts;
	private List<TierConfiguration> tierConfigurations;
}
