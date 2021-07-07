package org.simple.lifeiseasy.controller;

import java.util.UUID;

import org.simple.lifeiseasy.model.ReleaseSchedule;
import org.simple.lifeiseasy.service.ReleaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReleaseController {
	
	  Logger logger = LoggerFactory.getLogger(ReleaseController.class);
	  
	  @Autowired
	  private ReleaseService releaseService;
	
	  @PostMapping(value = "/release",consumes = {"application/json"},produces = {"application/json"})
	  @ResponseBody
	  public UUID initiateRelease(@RequestBody ReleaseSchedule re) {
		
		releaseService.initiateRedisUpdate();
		  
		logger.info(re.getEnvironment());
		logger.info(re.getFts().toString());
		logger.info(re.getTierConfigurations().toString());
		
		return UUID.randomUUID();  
	  }

}
