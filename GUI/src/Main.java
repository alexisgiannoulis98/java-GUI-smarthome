import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.Color;
import javax.swing.JLabel;



public abstract class Main implements ActionListener {

	
	static JFrame myFrame;
	static JLabel label;
	JButton start;
			
public static void main(String[] args) {
	
	JButton start = new JButton();
		
		start.setBounds(700,100,100,50);
		start.setText("START");
		start.setFocusable(false);
		start.setHorizontalTextPosition(JButton.CENTER);
		start.setVerticalTextPosition(JButton.CENTER);
		start.addActionListener(e ->myFrame = new MyFrame());
					
	ImageIcon image = new ImageIcon("smarthome.png");
		
		
		label = new JLabel();
		
		label = new JLabel();
		label.setIcon(image);
		label.setBounds(100,-200,1500,1500);
		label.setVisible(false);
		label.setVisible(true);
		
	JFrame frame = new JFrame();
		frame.setTitle("Smart home Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(image.getImage());
		frame.setLayout(null);
		//frame.setResizable(false);
		frame.setSize(1500,1500);
		frame.setVisible(true); 
		frame.add(start);
		frame.add(label);
		
	
		ImageIcon photo = new ImageIcon("pada.jpg");
		frame.setIconImage(photo.getImage());
		frame.getContentPane().setBackground(new Color(123,50,250)); //(0X123456)
		
		frame.pack();
		
	
	}
}

	

