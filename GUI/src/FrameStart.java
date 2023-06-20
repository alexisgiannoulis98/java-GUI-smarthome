import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameStart extends JFrame implements ActionListener{
	
	JButton start;
	JLabel label;
	
	FrameStart(){
		
		JButton start = new JButton();
		
			start.setBounds(100,100,100,50);
			start.setText("START");
			start.setFocusable(false);
			start.setHorizontalTextPosition(JButton.CENTER);
			start.setVerticalTextPosition(JButton.CENTER);
			start.addActionListener(this);
		
		ImageIcon image = new ImageIcon("smarthome.png");
		
		JLabel label = new JLabel();
		
			label.setText("Welcome Home");
			label.setIcon(image);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setForeground(new Color(0,0,0));
			label.setFont(new Font("MV Boli",Font.PLAIN,40));
			label.setIconTextGap(10);
			label.setHorizontalAlignment(JLabel.CENTER);
		
		JFrame frame = new JFrame();
			frame.setTitle("Smart home Application");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(image.getImage());
			frame.setLayout(null);
			//frame.setResizable(false);
			frame.setSize(2000,2000);
			frame.setVisible(true); 
			frame.add(label);
			frame.add(start);
			
		ImageIcon photo = new ImageIcon("pada.jpg");
			frame.setIconImage(photo.getImage());
			frame.getContentPane().setBackground(new Color(123,50,250)); //(0X123456)
			
			frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
		
			MyFrame frame = new MyFrame();
		
		}
		
	}

	

}
