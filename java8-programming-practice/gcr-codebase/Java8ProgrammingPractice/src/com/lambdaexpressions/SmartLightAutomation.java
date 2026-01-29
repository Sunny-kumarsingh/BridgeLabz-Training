package com.lambdaexpressions;

public class SmartLightAutomation {
	public static void main(String[] args) {
		
		// Motion detected
		 ILightAction motionTrigger = () -> 
         System.out.println("Lights ON at full brightness after motionTrigger");
         
         // Night time
         ILightAction nightMotionTrigger = () -> 
         System.out.println("Lights ON at full brightness after nightMotionTrigger");
         
         
         //voice command
         ILightAction voiceMotionTrigger = () -> 
         System.out.println("Lights ON at full brightness after voiceMotionTrigger");
         
         motionTrigger.activate();
         nightMotionTrigger.activate();
         voiceMotionTrigger.activate();
         
	}

}
