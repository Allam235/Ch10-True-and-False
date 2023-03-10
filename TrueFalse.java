//Kyle Wang
import doodlepad.*;
package gettingstarted;
//import com.phidget22.*;

public class TrueFalse {
    public static void main(String[] args) {
		Pad pad = new Pad(1000,1000);
		Rectangle rectFalse = new Rectangle(90,90,90,90);
		Rectangle rectTrue = new Rectangle(200,90,90,90);
		rectFalse.setFillColor(200,0,0);
		rectTrue.setFillColor(0,200,0);
		Phidgetq trivia = new Phidgetq();
		trivia.check(false,"A Call Stack is the different variables that are returned by each recursive call.");
		trivia.check(false,"Merge Sort is fastest when the numbers are already sorted.");
		trivia.check(true, "A base case is when the method no longer calls itself.");
		trivia.check(false,"Recursion is always better than or as good as a loop.");
		Text tru = new Text("False", 120,130,15);
		Text fals = new Text("True",230,130,15);
		
      
  }//main
}//TrueFalse
