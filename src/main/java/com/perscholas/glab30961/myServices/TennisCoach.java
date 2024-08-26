package com.perscholas.glab30961.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    private FortuneServices fortuneServices;
    public TennisCoach(){}

    @Autowired
    public TennisCoach(FortuneServices theFortuneService){
        fortuneServices = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getFortune();
    }
}
