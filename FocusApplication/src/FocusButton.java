//package components;
 
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
 
class FocusButton extends JFrame implements WindowListener, ActionListener {
	
  JButton R; // reference to the reset button object
  JButton B; // reference to the button object
  JLabel L; // reference to the milliseconds label object 
  JLabel mL; // reference to the minutes label object
 
  // main running function
  public static void main ( String[] args ) {
	    FocusButton frm = new FocusButton("FOCUS");
	  }
  
  // constructor for FocusButton
  public FocusButton(String title) {
	  	
	  	// defines the title of the pop up window
	  	super(title);
	  	
	  	// adds a listener for the window
        addWindowListener(this);
		
        //JFrame, size and visibility defined
		setSize(400,400);
		setVisible(true);
	  	
	  	//Label, sets the beginning text to 0:0, with size, added to frame
		L=new JLabel();
		L.setText("Time is 0 : 0");
		L.setBounds(50,100,250,20);
		add(L); 
		
		//Minute Label, sets the beginning minute text to 0:0, with size, added to frame
		mL=new JLabel(); 
		mL.setText("Time is 0 minutes and 0 secs");
		mL.setBounds(50,150, 250, 20);
		add(mL); 

		
		//Start and Stop Button, with methods/actions added
		B=new JButton( new AbstractAction ("Start Timer") {
			
			public void actionPerformed( ActionEvent e) {
				
				// determines whether to record time or not with each button press
				if (on == false) {
					on = true; 
					// changes the timer to 'end timer' if timer is triggered and the clause is on
					B.setText("End Timer");
				} else {
					on = false; 
					// changes the timer to 'start timer' if timer is triggered and the clause is off
					B.setText("Start Timer");
				}
				
				// the action performed: starts/stops the timer
				timeTrigger(); 
				
			}
		});
		// sets the size of the button
		B.setBounds(50,250,150,30);
		// adds the button to the JFrame
		add(B);
		// adds the action listener
		B.addActionListener(this);
		
		//Reset Button, with methods and actions added
		R=new JButton( new AbstractAction ("Reset Timer") {
			public void actionPerformed( ActionEvent e) {
				// add Action
				  startTime = 0; 
				  stopTime = 0; 
				  totalElapsedTime = 0; 
				  L.setText(String.valueOf(totalElapsedTime + " milliseconds"));
				  totalElapsedMin = 0; 
				  totalElapsedSec = 0; 
				  mL.setText(String.valueOf(totalElapsedMin) + " minutes");
				  mL.setText(String.valueOf(totalElapsedSec) + " secs");
			}
		}); 
		//sets the size of the reset button
		R.setBounds(50,150,150,30); 
		//adds the reset button to the JFrame
		add(R); 
		//adds the action listener
		R.addActionListener(this); 
		
  }
    
  boolean on = false; // used for tracking on/off button
  long startTime; 
  long stopTime; 
  long totalElapsedTime; 
  long totalElapsedMin;
  long totalElapsedSec; 
  
//  Track the time, changes the label that outputs the elapsed time
  public void timeTrigger() {
	  
	  long time = System.currentTimeMillis();
	  
	  if (on) {
		  startTime = time; 
		  System.out.println("startTime = " + startTime);
	  } else {
		  stopTime = System.currentTimeMillis();	 	
		  System.out.println("stopTime = " + stopTime);

	    //set the amount of time elapsed	  
		  long elapsedTime = stopTime - startTime; 
		  System.out.println("elapsedTime = " + elapsedTime);
		  
		//add up all the elapsed time
		  totalElapsedTime += elapsedTime;
		  L.setText(String.valueOf(totalElapsedTime + " milliseconds"));
		  
		  long elapsedSeconds = totalElapsedTime / 1000;
		  totalElapsedSec = elapsedSeconds % 60;
		  totalElapsedMin = elapsedSeconds / 60;
		  
		  mL.setText(String.valueOf(totalElapsedMin) + " minutes " + String.valueOf(totalElapsedSec) + " secs");

	  }
	  
//	  long time = System.currentTimeMillis();
//	  on = true; 
//	  if (on) {
//		  System.out.println("time = " + time);
//		  long elapsedTime = System.currentTimeMillis() - time;
//		  L.setText(String.valueOf(elapsedTime));
//		  on = false; 
//		  }
//	  } else {
//		  
//	  }
////	  System.out.println(System.currentTimeMillis()); 
//	  long elapsedTime = System.currentTimeMillis() - startTime;
//	  System.out.println(System.currentTimeMillis()); 
//	  System.out.println("elapsed time = " + elapsedTime);
//	  long elapsedSeconds = elapsedTime / 1000;
//	  long secondsDisplay = elapsedSeconds % 60;
//	  long elapsedMinutes = elapsedSeconds / 60;	
//	  
//	  L.setText("Elapsed time is "+ elapsedMinutes +" : "+secondsDisplay);

  }
  
//public void actionPerformed(java.awt.event.ActionEvent e) {
//  
//	// determines whether to record time or not with each button press
//	if (on == false) {
//		on = true; 
//	} else {
//		on = false; 
//	}
//	
//	// the action performed: starts/stops the timer
//	timeTrigger(); 
//	  
//}


public void windowOpened(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowClosing(WindowEvent e) {}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
  
}

