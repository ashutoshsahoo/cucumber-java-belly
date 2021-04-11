package com.ashu.practice.bellycukes;

public class Belly {

    private int cukes;

    public void eatCukes(int cukes) {
    this.cukes=cukes;
    }
    

    public String getSound(int waitingTime) {
    	if(waitingTime ==0) {
    		return "silent";
    	}
    	else if(waitingTime==1 && cukes<=20) {
    		return "silent";
    	}
    	else {
    		return "growl";
    	}
    }
    
}

