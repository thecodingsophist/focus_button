//package components;
 
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
 
class FocusButton extends JFrame implements WindowListener, ActionListener {
	
  JButton B; // reference to the button object
  JLabel L; // reference to the label object
 
  boolean on = false; // used for tracking on/off button

  // constructor for FocusButton
  public static void main ( String[] args ) {
	    FocusButton frm = new FocusButton("FOCUS");
//	    frm.setSize( 400, 400 );     
//	    frm.setVisible( true );   
	    
		//Reset Elapsed time
	    frm.timeTrigger();
	    
	  }
  
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
		
		//Button
		B=new JButton("Reset Timer");
		B.setBounds(50,150,150,30);
		add(B);
		B.addActionListener(this);
		
		//timeElapsed

  }
  
  long startTime; 
//  Track the time.
  public void timeTrigger() {
	  long time = System.currentTimeMillis();
	  System.out.println("time = " + time);
	  
	  startTime = time; 
	  long currentTime = System.currentTimeMillis();
	  long elapsedTime = currentTime - startTime; 
	  //set the amount of time elapsed
	  L.setText(String.valueOf(elapsedTime + " milliseconds"));

	  
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
  
public void actionPerformed(java.awt.event.ActionEvent e) {
  
	// the action performed: starts/stops the timer
	timeTrigger(); 
	  
}


public void windowOpened(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowClosing(WindowEvent e) {}
  
}

