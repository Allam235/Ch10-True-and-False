//Kyle Wang
import doodlepad.*;
//import com.phidget22.*;

public class TrueFalse {
    public static void main(String[] args) {
		Pad pad = new Pad(1000,1000);
		Rectangle rectFalse = new Rectangle(90,90,90,90);
		Rectangle rectTrue = new Rectangle(200,90,90,90);
		rectFalse.setFillColor(200,0,0);
		rectTrue.setFillColor(0,200,0);
		Text lol = new Text("A Call Stack is the different variables that are returned by each recursive call.", 69,69,15);
		lol = new Text("False", 120,130,15);
		lol = new Text("True",230,130,15);
      /*
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		greenButton.setHubPort(4);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(5);*/
		
     
		//pad.clear();
  }
}
