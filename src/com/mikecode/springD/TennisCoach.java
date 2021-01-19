package com.mikecode.springD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //("thatCoach") 
public class TennisCoach implements Coach {

	private FortuneSevice fortuneService;
	
	@Autowired
	public  TennisCoach(FortuneSevice theFortuneService) {
		fortuneService =  theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand valley";
	}

	@Override
	public String getDailyFortune() {
		
		
		return fortuneService.getFortune();
	}

}
