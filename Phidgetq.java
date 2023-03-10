//Rithvik Allamaneni
/*
Questions:  
A Call Stack is the different variables that are returned by each recursive call. (False)   
Merge Sort is fastest when the numbers are already sorted. (False)   
A base case is when the method no longer calls itself. (True)   
Recursion is always better than or as good as a loop. (False)  
*/

package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class phidgetq {
    //Handle Exceptions 
    public void check(boolean ans){

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        System.out.println("If your answer is true, press the green button, if it is false, press the red button/nIf you got it correct, green will light up, if wrong, red will light up");
		
		while(true){
			if(ans == true){
				if(greenButton.getState() == true){
					for(int i = 0; i<5; i++){
						greenLED.setState(true);
						Thread.sleep(150);
						greenLED.setState(false);
						Thread.sleep(150);
					}
					greenLED.setState(true);
					Thread.sleep(1000);
				}
				else if (redButton.getState() == true){
					redLED.setState(true);
					Thread.sleep(1500);
				}
			}
			if(ans == false){
				if(redButton.getState() == true){
					for(int i = 0; i<5; i++){
						greenLED.setState(true);
						Thread.sleep(150);
						greenLED.setState(false);
						Thread.sleep(150);
					}
					greenLED.setState(true);
					Thread.sleep(1000);
				}
				else if (greenButton.getState() == true){
					redLED.setState(true);
					Thread.sleep(1500);
				}
			}
			greenLED.setState(false);
			redLED.setState(false);
			
			
			
		}
		  
   }
}


    
