//package components;
 
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
 
class FocusButton extends JFrame implements WindowListener, ActionListener {
	
  JButton R; // reference to the reset button object
  JButton B; // reference to the button object
  JLabel L; // reference to the label object
 
  // main running function
  public static void main ( String[] args ) {
	    FocusButton frm = new FocusButton("FOCUS");
//	    frm.setSize( 400, 400 );     
//	    frm.setVisible( true );   
	    
		//Reset Elapsed time
//	    frm.timeTrigger();
	    
	  }
  
  // constructor for FocusButton
  public FocusButton(String title) {
	  	
	  	super(title);
	  	
        addWindowListener(this);
		
        //JFrame 
		setSize(400,400);
		setVisible(true);
	  	
	  	//Label
		L=new JLabel();
		L.setText("Time is 0 : 0");
		L.setBounds(50,100,250,20);
		add(L); 
		
		//Start&Stop Button
		B=new JButton( new AbstractAction ("Start Timer") {
			public void actionPerformed( ActionEvent e) {
				// add Action
				
				// determines whether to record time or not with each button press
				if (on == false) {
					on = true; 
					B.setText("End Timer");
				} else {
					on = false; 
					B.setText("Start Timer");
				}
				
				// the action performed: starts/stops the timer
				timeTrigger(); 
				
			}
		});
		B.setBounds(50,250,150,30);
		add(B);
		B.addActionListener(this);
		
		//Reset Button
		R=new JButton( new AbstractAction ("Reset Timer") {
			public void actionPerformed( ActionEvent e) {
				// add Action
				  startTime = 0; 
				  stopTime = 0; 
				  totalElapsedTime = 0; 
				  L.setText(String.valueOf(totalElapsedTime + " milliseconds"));
			}
		}); 
		
		R.setBounds(50,150,150,30); 
		add(R); 
		R.addActionListener(this); 
		
		//timeElapsed

  }
    
  boolean on = false; // used for tracking on/off button
  long startTime; 
  long stopTime; 
  long totalElapsedTime; 
  
//  Track the time.
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

