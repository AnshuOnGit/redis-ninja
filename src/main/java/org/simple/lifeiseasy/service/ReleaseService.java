package org.simple.lifeiseasy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService {
	
	 Logger logger = LoggerFactory.getLogger(ReleaseService.class);
	
	@Async
	public void initiateRedisUpdate() {
		logger.info("initiate called......");
	}

}
