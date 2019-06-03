//package components;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class FocusButton extends JFrame implements ActionListener {
  JButton B; // reference to the button object
  JLabel L; // reference to the label object
  // constructor for FocusButton
  
  FocusButton() {
		L=new JLabel();
		L.setBounds(50,100,250,20);
		B=new JButton("Reset Timer");
		B.setBounds(50,150,95,30);
		B.addActionListener(this);
		
		//JFrame 
		setSize(400,400);
		setVisible(true);
		
		//Button
  }
  
//  FocusButton(String title) {
//    super( title );                     // invoke the JFrame constructor
//    setLayout( new FlowLayout() );      // set the layout manager
//
//    B = new JButton("Start Time!"); // construct a JButton
//    add( B );                // add the button to the JFrame
//    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
//  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
  //Track the time.
  long startTime = System.currentTimeMillis();
  long elapsedTime = System.currentTimeMillis() - startTime;
  long elapsedSeconds = elapsedTime / 1000;
  long secondsDisplay = elapsedSeconds % 60;
  long elapsedMinutes = elapsedSeconds / 60;
  
		L.setText("Elapsed time is "+elapsedMinutes+" : "+secondsDisplay);
	
}
	
  public static void main ( String[] args )
  {
    FocusButton frm = new FocusButton();

    frm.setSize( 150, 75 );     
    frm.setVisible( true );   
  }
}


///* FrameDemo.java requires no other files. */
//public class main extends JFrame implements ActionListener {
//	JLabel I; 
//	JButton b;
//	
//	main(){
//		I=new JLabel();
//		I.setBounds(50,100,250,20);
//		b=new JButton("Reset Timer");
//		b.setBounds(50,150,95,30);
//		b.addActionListener(this);
//		
//		//JFrame 
//		setSize(400,400);
//		setVisible(true);
//		
//		//Button
//		
//	}
// 
//    public static void main(String[] args) {
//    		new main(); 
//    }
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//        //Track the time.
//        long startTime = System.currentTimeMillis();
//        long elapsedTime = System.currentTimeMillis() - startTime;
//        long elapsedSeconds = elapsedTime / 1000;
//        long secondsDisplay = elapsedSeconds % 60;
//        long elapsedMinutes = elapsedSeconds / 60;
//        
//		try {
//			I.setText("Elapsed time is "+elapsedMinutes+" : "+secondsDisplay);
//		}catch(Exception ex) {System.out.println(ex);}
//		}
//		
//	}

