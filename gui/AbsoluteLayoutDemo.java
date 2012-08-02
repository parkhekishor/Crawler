package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class AbsoluteLayoutDemo {
	static JProgressBar j_p_b;
	static JProgressBar j_p_b1;
	AbsoluteLayoutDemo(){
		j_p_b=new JProgressBar();
		 j_p_b1=new JProgressBar();
	}
	AbsoluteLayoutDemo(int i){
		j_p_b.setValue(10*i);
	}
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        JTextField t_P=new JTextField("index");
        JTextField t_d=new JTextField("deff index");
        JTextField t_a=new JTextField("append index");
        JTextField t_c=new JTextField("pin class");
        
        j_p_b.setValue(0);
        j_p_b.setStringPainted(true);
        j_p_b1.setStringPainted(true);
        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");

        pane.add(t_P);
        pane.add(t_d);
        pane.add(t_a);
        pane.add(t_c);
        pane.add(j_p_b);
        pane.add(j_p_b1);
        pane.add(b2);
//        pane.add(b3);

        Insets insets = pane.getInsets();
        Dimension size = t_P.getPreferredSize();
        t_P.setBounds(25 + insets.left, 5 + insets.top,
                     125, size.height);
        System.out.println(t_P.getX()+t_P.getText());
        t_d.setBounds((t_P.getX()+135)+ insets.left, 5 + insets.top,
                125, size.height);
        t_a.setBounds((t_d.getX()+135)+ insets.left, 5 + insets.top,
                125, size.height);
        t_c.setBounds((t_a.getX()+135)+ insets.left, 5 + insets.top,
                125, size.height);
        size = b2.getPreferredSize();
        b2.setBounds((t_c.getX()+135)+ insets.left, 5 + insets.top,
                     size.width, size.height);
        j_p_b.setBounds((100)+ insets.left, 50 + insets.top,
                500, size.height);
        j_p_b1.setBounds((100)+ insets.left, 80 + insets.top,
                500, size.height);
        size = b3.getPreferredSize();
        b3.setBounds((t_c.getX()+10) + insets.left, 5 + insets.top,
                     size.width + 50, size.height + 20);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("AbsoluteLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(675+ insets.left + insets.right,
                      150 + insets.top + insets.bottom);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new AbsoluteLayoutDemo();
                createAndShowGUI();
                
                progress();
                for(int i=0;i<10;i++){
                	new AbsoluteLayoutDemo(i);
                	
                	
                		
                	
                	
                	}
                
            }
        });
        
    }
    
static void progress(){
	
//	try {
//    	for(int i=0;i<10;i++){
//for(int j=0;j<10000000;j++){
//	j_p_b.setValue(10*i);
//	
//	j_p_b.setForeground(Color.magenta);
//}
////	for(int j1=0;j1<50;j1++)
////		for(int j2=0;j2<10000000;j2++)
//	
//        	
//        	
//        }
//        j_p_b.setForeground(Color.GRAY);
//        j_p_b.setValue(100);
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}