package com.mikecode.springD;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneSevice {

	@Override
	public String getFortune() {
		
		return "Today is Your best day mike Inshaallah";
	}

}
