import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;// imports input tech
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class MyFrame extends JFrame implements ActionListener, MouseListener{
	
	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton submit;
			
	JLabel label;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JLabel label8;
	JLabel label9;
	JLabel label10;
			
	JTextField textField;
	JPasswordField passtxt;
		
MyFrame(){
	
					
		ImageIcon icon = new ImageIcon("lampa1.jpg");
		ImageIcon icon1 = new ImageIcon("lampthras.PNG");
		
		ImageIcon icon2 = new ImageIcon("8ermastra.jpg");
		ImageIcon icon3 = new ImageIcon("8ermastraan.PNG");
		
		ImageIcon icon4 = new ImageIcon("coffeeoff.PNG");
		ImageIcon icon5 = new ImageIcon("coffeeon.PNG");
		
		ImageIcon icon6 = new ImageIcon("aircondition off.jfif");
		ImageIcon icon7 = new ImageIcon("aircondition on.jfif");
		
		ImageIcon icon8 = new ImageIcon("kleistopara8uro.PNG");
		ImageIcon icon9 = new ImageIcon("anoixtopara8uro.PNG");
		
		ImageIcon icon10 = new ImageIcon("anoixthporta.jfif");
		ImageIcon icon11 = new ImageIcon("kleisthporta.gif");
		
		ImageIcon icon12 = new ImageIcon("skoupa.jfif");
		ImageIcon icon13 = new ImageIcon("skoupaon.jfif");
		
		ImageIcon icon14 = new ImageIcon("alarmon.PNG");
		ImageIcon icon15 = new ImageIcon("alarmoff.PNG");
		
		ImageIcon icon16 = new ImageIcon("washer-dryeron.PNG");
		ImageIcon icon17 = new ImageIcon("washer-dryeroff.PNG");
		
		ImageIcon icon18 = new ImageIcon("cameraon.PNG");
		ImageIcon icon19 = new ImageIcon("cameraoff.PNG");
		
		ImageIcon icon20 = new ImageIcon("fournoson.PNG");
		ImageIcon icon21 = new ImageIcon("fournosoff.PNG");
		
				
		label = new JLabel();//lampa
		label.setIcon(icon1);
		label.setBounds(50,100,170,250);
		label.setVisible(false);
		
		label1 = new JLabel();//8ermastra
		label1.setIcon(icon3);
		label1.setBounds(50,400,170,250);
		label1.setVisible(false);
		
		label2 = new JLabel();//coffee
		label2.setIcon(icon5);
		label2.setBounds(50,700,170,250);
		label2.setVisible(false);
		
		label3 = new JLabel();//aircondition
		label3.setIcon(icon7);
		label3.setBounds(550,100,300,250);
		label3.setVisible(false);
		
		label4 = new JLabel();//para8ura
		label4.setIcon(icon8);
		label4.setBounds(550,400,170,250);
		label4.setVisible(false);
		
		label5 = new JLabel();//portes
		label5.setIcon(icon11);
		label5.setBounds(550,700,170,250);
		label5.setVisible(false);
		
		label6 = new JLabel();//skoupa
		label6.setIcon(icon13);
		label6.setBounds(1050,100,170,250);
		label6.setVisible(false);
		
		label7 = new JLabel();//sunagermos on
		label7.setIcon(icon14);
		label7.setBounds(1050,400,170,250);
		label7.setVisible(false);
		
		label8 = new JLabel();//washer/dryer on
		label8.setIcon(icon16);
		label8.setBounds(1050,700,170,250);
		label8.setVisible(false);
		
		label9 = new JLabel();//camera on
		label9.setIcon(icon18);
		label9.setBounds(1550,400,170,250);
		label9.setVisible(false);
		
		label10 = new JLabel();//fournos on
		label10.setIcon(icon20);
		label10.setBounds(1550,100,170,250);
		label10.setVisible(false);
					
		button = new JButton();
		button.setBounds(50,100,170,250);//button size //koumpi fwtwn
		button.addActionListener(this);
		button.setText("Lights");//button text
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setVisible(false);
		
		button1 = new JButton();
		button1.setBounds(50,400,170,250);//button size //koumpi 8ERMASTRA
		button1.addActionListener(this);
		button1.setText("Space Heater");//button text
		button1.setFocusable(false);
		button1.setIcon(icon2);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setVisible(false);
		
		button2 = new JButton();
		button2.setBounds(50,700,170,250);//button size //koumpi KAFETIERA
		button2.addActionListener(this);
		button2.setText("Coffee Maker");//button text
		button2.setFocusable(false);
		button2.setIcon(icon4);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setVisible(false);
		
		button3 = new JButton();
		button3.setBounds(550,100,170,250);//button size //koumpi Air-condition
		button3.addActionListener(this);
		button3.setText("Air-condition");//button text
		button3.setFocusable(false);
		button3.setIcon(icon6);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button3.setVisible(false);
		
		button4 = new JButton();
		button4.setBounds(550,400,170,250);//button size //koumpi para8urwn
		button4.addActionListener(this);
		button4.setText("Windows");//button text
		button4.setFocusable(false);
		button4.setIcon(icon9);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		button4.setVisible(false);
		
		button5 = new JButton();
		button5.setBounds(550,700,170,250);//button size //koumpi Portas
		button5.addActionListener(this);
		button5.setText("Door");//button text
		button5.setFocusable(false);
		button5.setIcon(icon10);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.BOTTOM);
		button5.setVisible(false);
		
		button6 = new JButton();
		button6.setBounds(1050,100,170,250);//button size //koumpi e-skoupas
		button6.addActionListener(this);
		button6.setText("Vacuum Cleaner");//button text
		button6.setFocusable(false);
		button6.setIcon(icon12);
		button6.setHorizontalTextPosition(JButton.CENTER);
		button6.setVerticalTextPosition(JButton.BOTTOM);
		button6.setVisible(false);
		
		button7 = new JButton();
		button7.setBounds(1050,400,170,250);//button size //koumpi sunagermou
		button7.addActionListener(this);
		button7.setText("Alarm");//button text
		button7.setFocusable(false);
		button7.setIcon(icon15);
		button7.setHorizontalTextPosition(JButton.CENTER);
		button7.setVerticalTextPosition(JButton.BOTTOM);
		button7.setVisible(false);
		
		button8 = new JButton();
		button8.setBounds(1050,700,170,250);//button size //koumpi plhnturio / stegnwthrio
		button8.addActionListener(this);
		button8.setText("Washer/dryer");//button text
		button8.setFocusable(false);
		button8.setIcon(icon17);
		button8.setHorizontalTextPosition(JButton.CENTER);
		button8.setVerticalTextPosition(JButton.BOTTOM);
		button8.setVisible(false);
		
		button9 = new JButton();
		button9.setBounds(1550,400,170,250);//button size //koumpi cameras
		button9.addActionListener(this);
		button9.setText("Camera");//button text
		button9.setFocusable(false);
		button9.setIcon(icon19);
		button9.setHorizontalTextPosition(JButton.CENTER);
		button9.setVerticalTextPosition(JButton.BOTTOM);
		button9.setVisible(false);
		
		button10 = new JButton();
		button10.setBounds(1550,100,170,250);//button size //koumpi fournou
		button10.addActionListener(this);
		button10.setText("Oven");//button text
		button10.setFocusable(false);
		button10.setIcon(icon21);
		button10.setHorizontalTextPosition(JButton.CENTER);
		button10.setVerticalTextPosition(JButton.BOTTOM);
		button10.setVisible(false);
		
		submit = new JButton();
		submit.setBounds(1000,500,100,50);//button size 
		submit.addActionListener(this);
		submit.setText("submit");//button text
		submit.setFocusable(false);
		submit.setHorizontalTextPosition(JButton.CENTER);
		submit.setVerticalTextPosition(JButton.BOTTOM);
						
		this.add(button);
		this.add(label);
		
		this.add(button1);
		this.add(label1);
		
		this.add(button2);
		this.add(label2);
		
		this.add(button3);
		this.add(label3);
		
		this.add(button4);
		this.add(label4);
		
		this.add(button5);
		this.add(label5);
		
		this.add(button6);
		this.add(label6);
		
		this.add(button7);
		this.add(label7);
		
		this.add(button8);
		this.add(label8);
		
		this.add(button9);
		this.add(label9);
		
		this.add(button10);
		this.add(label10);
		
		this.add(submit);
										
		ImageIcon image = new ImageIcon("pada.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0X123456)); //(0X123456)
		
		this.setTitle("Smart home Application");                  //Frame creation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setResizable(true);
		this.setSize(2000,1000);
		this.setVisible(true);
				
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setText("Username");
		textField.setVisible(true);
		
		passtxt = new JPasswordField();
		passtxt.setPreferredSize(new Dimension(250,40));
		passtxt.setText("Password");
		passtxt.setVisible(true);
		
		this.add(textField);
		this.add(passtxt);
		this.pack();
		
		label.addMouseListener(this);
		label1.addMouseListener(this);
		label2.addMouseListener(this);
		label3.addMouseListener(this);
		label4.addMouseListener(this);
		label5.addMouseListener(this);
		label6.addMouseListener(this);	
		label7.addMouseListener(this);
		label8.addMouseListener(this);
		label9.addMouseListener(this);
		label10.addMouseListener(this);
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==submit) {
			 this.setLayout(null);
			 System.out.println("You are logged in\n");
			 System.out.println("Welcome " + textField.getText());
			 passtxt.setVisible(false);
			 textField.setVisible(false);
			 submit.setVisible(false);
			 button.setVisible(true);
			 button1.setVisible(true);
			 button2.setVisible(true);
			 button3.setVisible(true);
			 button4.setVisible(true);
			 button5.setVisible(true);
			 button6.setVisible(true);
			 button7.setVisible(true);
			 button8.setVisible(true);
			 button9.setVisible(true);
			 button10.setVisible(true);
		 
		 }
		
		    if(e.getSource()==button) {
		    			   	    	
		    	System.out.println("\nIn which room would you like to turn the lights on?\n"
				 		+ "choose (1) for Bedroom\n" + "choose (2) for Kitchen\n" + "choose (3) for Livingroom\n" 
						+ "choose (4) for Every room\n");
				 
				 Scanner input = new Scanner(System.in);
				 String userInput = "";
				 userInput = input.nextLine();
				 
				 int x =Integer.parseInt(userInput);
			  	
				 switch(x) 
				 { 
				  case 1:
					  System.out.println("The Bedroom lights are on");
					  break;
				 
				  case 2:
					  System.out.println("The Kitchen lights are on");
					  break;
				  
				  case 3:
					  System.out.println("The Livingroom lights are on");
					  break;
				  
				  case 4:
					  System.out.println("All the lights are on");
					  break;
					  
				 }label.setVisible(true); button.setVisible(false);
		
		  } else if(e.getSource()==button1){
										
				System.out.println("Do you want to set the temperature? (yes/no)");
				
				Scanner input = new Scanner(System.in);
				String userInput = "";
				userInput = input.nextLine();
					
				if(userInput.equalsIgnoreCase("yes")) {
					
						System.out.println("Okay, choose your preferred temperature");
													
						int Temp = input.nextInt();
							if(Temp<27) {
								button1.setVisible(true);
								label1.setVisible(false);
								System.out.println("Maybe it is not cold enough outside to turn the space heater on. "
													+ "Try the airconition.");
							}else if(Temp>27 && Temp<40) {
								System.out.println("The space Heater is on");
								System.out.println("You set Temperature at: " + Temp + " degrees celsius");
								label1.setVisible(true);
								button1.setVisible(false);
							}else if(Temp>40) {
								button1.setVisible(true);
								label1.setVisible(false);
								System.out.println("The Temperature is too high. Choose again.(Push the button one more time)");
							}
												
					}else if(userInput.equalsIgnoreCase("no")) {
						System.out.println("The space Heater is on");
						label1.setVisible(true);
						System.out.println("Default Temperature is 27 degrees celsius");
						button1.setVisible(false);
					
					}
					
		  
		} else if(e.getSource()==button2){
			System.out.println("The Coffee maker is on");
			label2.setVisible(true);
			button2.setVisible(false);
						
				Scanner input = new Scanner(System.in);
								
				String userInput = "";
				
				System.out.println("Do you want to set the timer? (yes/no)");
				
				userInput = input.nextLine();
					
				if(userInput.equalsIgnoreCase("yes")) {
						System.out.println("Okay, in how many minutes would you like your coffee to be ready?");
						int Time = input.nextInt();
						System.out.println("Your coffee will be ready in " + Time + " minutes.");
						
						
					}else if(userInput.equalsIgnoreCase("no")) {
						System.out.println("Okay, your coffee will be ready as soon as possible.");
						
					}
									
					
		}else if(e.getSource()==button3){
			
			System.out.println("Do you want to set the temperature? (yes/no)");

			Scanner input = new Scanner(System.in);
			String userInput = "";
			userInput = input.nextLine();

			if(userInput.equalsIgnoreCase("yes")) {
				System.out.println("Okay, choose your preferred temperature");
						
				int Temp = input.nextInt();
					if(Temp>27) {
						System.out.println("Maybe it is not hot enough outside to turn the air-condition on. "
								+ "Try the space heater.");
					}else if(Temp<27 && Temp>16 || Temp == 27 || Temp == 16) {
						System.out.println("The Air-condition is on");
						System.out.println("You set Temperature at: " + Temp + " degrees celsius");
						label3.setVisible(true);
						button3.setVisible(false);
				
					}else if(Temp<16) {
						System.out.println("The Temperature is too low. Choose again.(Push the button one more time)");
					}
					
					
			}else if(userInput.equalsIgnoreCase("no")) {
				System.out.println("The Air-condition is on");
				label3.setVisible(true);
				System.out.println("Default Temperature is 20 degrees celsius");
				button3.setVisible(false);
					}
		}else if(e.getSource()==button4) {
			 System.out.println("\nIn which room would you like to lock the windows?\n"
			 		+ "choose (1) for Bedroom\n" + "choose (2) for Kitchen\n" + "choose (3) for Livingroom\n" 
					+ "choose (4) for Every room\n");
			 
			 Scanner input = new Scanner(System.in);
			 String userInput = "";
			 userInput = input.nextLine();
			 
			 int x =Integer.parseInt(userInput);
		  	
			 switch(x) 
			 { 
			  case 1:
				  System.out.println("The Bedroom windows are locked");
				  break;
			 
			  case 2:
				  System.out.println("The Kitchen windows are locked");
				  break;
			  
			  case 3:
				  System.out.println("The Livingroom windows are locked");
				  break;
			  
			  case 4:
				  System.out.println("All the windows are locked");
				  break;
				  
			 }label4.setVisible(true); button4.setVisible(false);
			 
		 }else if(e.getSource()==button5) {
			  	
			 System.out.println("\nWhich Door would you like to lock?\n"
				 		+ "choose (1) for Main Door\n" + "choose (2) for Garage Door\n" + "choose (3) for Rooftop Door\n" 
						+ "choose (4) for Every door\n");
				 
				 Scanner input = new Scanner(System.in);
				 String userInput = "";
				 userInput = input.nextLine();
				 
				int x =Integer.parseInt(userInput);
			  	
				 switch(x) 
				 { 
				  case 1:
					  System.out.println("The Main Door is locked");
					  break;
					  			
				  case 2:
					  System.out.println("The Garage Door is locked");
					  break;
					  
				  case 3:
					  System.out.println("The Rooftop Door is locked");
					  break;
					  
				  case 4:
					  System.out.println("All the doors are locked");
					  break;
					  
			  }label5.setVisible(true);button5.setVisible(false);
			  
		 }else if(e.getSource()==button6) {
			  	
			 System.out.println("\nWhich Room would you like to clean?\n"
				 		+ "choose (1) for Livingroom\n" + "choose (2) for Bedroom\n" + "choose (3) for Kitchen\n" 
						+ "choose (4) for Bathroom\n" + "choose (5) for the Whole House\n");
				 
				 Scanner input = new Scanner(System.in);
				 String userInput = "";
				 userInput = input.nextLine();
				 
				int x =Integer.parseInt(userInput);
			  	
				 switch(x) 
				 { 
				  case 1:
					  System.out.println("The Vacuum cleaner is on.");
					  System.out.println("The Livingroom is being cleaned");
					  break;
					  			
				  case 2:
					  System.out.println("The Vacuum cleaner is on.");
					  System.out.println("The Bedroom is being cleaned");
					  break;
					  
				  case 3:
					  System.out.println("The Vacuum cleaner is on.");
					  System.out.println("The Kitchen is being cleaned");
					  break;
					  
				  case 4:
					  System.out.println("The Vacuum cleaner is on.");
					  System.out.println("The Bathroom is being cleaned");
					  break;
				  case 5:
					  System.out.println("The Vacuum cleaner is on.");
					  System.out.println("The Whole House is being cleaned");
					  break;	  
					  
			  }label6.setVisible(true);button6.setVisible(false);
			   
		 }else if(e.getSource()==button7) {
	   	    	
			         System.out.println("\nIn which room would you like to turn the alarm on?\n"
					 + "choose (1) for Bedroom\n" + "choose (2) for Kitchen\n" + "choose (3) for Livingroom\n" 
					 + "choose (4) for security lock down\n");

			         Scanner input = new Scanner(System.in);
			         String userInput = "";
			         userInput = input.nextLine();

			         int x = Integer.parseInt(userInput);

			         switch(x) 
			         	{ 
			         	case 1:
			         			System.out.println("The Bedroom alarm is on");
			         			System.out.println("The Bedroom windows are locked");
				         		label4.setVisible(true);
				         		button4.setVisible(false);
			         				break;

			         	case 2:
			         			System.out.println("The Kitchen alarm is on");
			         			System.out.println("The Kitchen windows are locked");
				         		label4.setVisible(true);
				         		button4.setVisible(false);
			         				break;

			         	case 3:
			         			System.out.println("The Livingroom alarm is on");
			         			System.out.println("The Livingroom windows are locked");
				         		label4.setVisible(true);
				         		button4.setVisible(false);
			         				break;

			         	case 4:
			         			System.out.println("Security Lock Down initiated!!! All the doors and windows are locked");
			         			button4.setVisible(false);button5.setVisible(false);label4.setVisible(true);label5.setVisible(true);	
			         			break;

			         	}label7.setVisible(true);button7.setVisible(false);
			         	
		 }else if(e.getSource()==button8) {
	   	    	
			 System.out.println("The washer is on\n");
		         System.out.println("\n What programm would you like to use?\n"
				 + "choose (1) for Cotton quick\n" + "choose (2) for Synthetic\n" + "choose (3) for Quick 30\n" 
				 + "choose (4) for Multicolour\n"
				 + "choose (5) for Wool\n");

		         Scanner input = new Scanner(System.in);
		         String userInput = "";
		         userInput = input.nextLine();

		         int x = Integer.parseInt(userInput);
		        

		         switch(x) 
		         	{ 
		         	case 1:
		         			System.out.println("The Cotton clothes are being washed");
		         			
		         				break;

		         	case 2:
		         			System.out.println("The Synthetic clothes are being washed");
		         				break;

		         	case 3:
		         			System.out.println("The colthes will be ready in 30 minutes");
		         				break;

		         	case 4:
		         			System.out.println("The Multicolour clothes are being washed");
		         				break;
		         	case 5:
	         			System.out.println("The Wool clothes are being washed");
	         					break;
		         		}		         		         
		         System.out.println("Do you want to dry the closthes as well? (yes/no)\n");
		         
		            userInput = input.nextLine();
		         
					if(userInput.equalsIgnoreCase("yes")) {
						System.out.println("Okay, the clothes will be dried as well\n");
						
																			
					}else if(userInput.equalsIgnoreCase("no")) {
						System.out.println("Okay!!!\n");
						
						}label8.setVisible(true);button8.setVisible(false);
		         	
		         	
		 }else if(e.getSource()==button9) {
			 
			 System.out.println("\nYou turned the camera on\n");
	   	    	
	         System.out.println("What to you want to do?\n"
			 + "choose (1) Livestream\n" + "choose (2) for Security footage\n");

	         Scanner input = new Scanner(System.in);
	         String userInput = "";
	         userInput = input.nextLine();

	         int x = Integer.parseInt(userInput);
	            

	         switch(x) 
	         	{ 
	         	case 1:
	         			System.out.println("\nFrom which room would you like to see live footage?\n"
	         					+  "choose (1) for Bedroom\n" + "choose (2) for Kitchen\n" + "choose (3) for Livingroom \n"
	         					+  "choose (4) for Rooftop\n" + "choose (5) for Garage\n");
	         			
	         			userInput = input.nextLine();

	         			int x1 = Integer.parseInt(userInput);
	         			
	         			switch(x1)
	         			{
	         			case 1:
	         				System.out.println("Live Footage from the Bedroom");
	         				break;
	         			case 2:
	         				System.out.println("Live Footage from the Kitchen");
	         				break;
	         			case 3:
	         				System.out.println("Live Footage from the Livingroom");
	         				break;
	         			case 4:
	         				System.out.println("Live Footage from the Rooftop");
	         				break;
	         			case 5:
	         				System.out.println("Live Footage from the Garage");
	         				break;
	         			}
	         						
	         					
	         				break;

	         	case 2:
	         		System.out.println("\nFrom which room would you like to see secutity footage?\n"
         					+  "choose (1) for Bedroom\n" + "choose (2) for Kitchen\n" + "choose (3) for Livingroom \n"
         					+  "choose (4) for Rooftop\n" + "choose (5) for Garage\n");
	         		
	         		userInput = input.nextLine();

         			int x2 = Integer.parseInt(userInput);
         			
         			switch(x2)
         			{
         			case 1:
         				System.out.println("Security footage from the Bedroom");
         				break;
         			case 2:
         				System.out.println("Security footage from the Kitchen");
         				break;
         			case 3:
         				System.out.println("Security footage from the Livingroom");
         				break;
         			case 4:
         				System.out.println("Security footage from the Rooftop");
         				break;
         			case 5:
         				System.out.println("Security footage from the Garage");
         				break;
         			}
	         		
	         				break;

	         	
	         	}label9.setVisible(true);button9.setVisible(false);
		 }else if(e.getSource()==button10) {
	   	    	
			 System.out.println("The Oven is on\n");
		         System.out.println("What programm would you like to use?\n"
				 + "choose (1) for Upper and Lower heating elements\n" + "choose (2) for Fan with lower heat\n" 
		         + "choose (3) for Fan Oven\n" 
				 + "choose (4) for Full Grill\n"
				 + "choose (5) for Part Grill\n"
				 + "choose (6) for Grill and Fan\n"
				 + "choose (7) for Grill and lower heat\n"
				 + "choose (8) for Defrost\n"
				 + "choose (9) for Plate warming\n");

		         Scanner input = new Scanner(System.in);
		         String userInput = "";
		         userInput = input.nextLine();

		         int x = Integer.parseInt(userInput);
		        

		         switch(x) 
		         	{ 
		         	case 1:
		         			System.out.println("Upper and Lower heating elements initiated");
		         			
		         				break;

		         	case 2:
		         			System.out.println("Fan with lower heat initiated");
		         				break;

		         	case 3:
		         			System.out.println("Fan Oven initiated");
		         				break;

		         	case 4:
		         			System.out.println("Full Grill initiated");
		         				break;
		         	case 5:
	         			System.out.println("Part Grill initiated");
	         					break;
		         	case 6:
	         			System.out.println("Grill and Fan initiated");
	         					break;
		         	case 7:
	         			System.out.println("Grill and lower heat initiated");
	         					break;
		         	case 8:
	         			System.out.println("Defrost initiated");
	         					break;
		         	case 9:
	         			System.out.println("Plate warming");
	         					break;

	         					
		         	}		         		         
		         System.out.println("Do you want to set a specific time for the food to be ready? (yes/no)\n");
		         
		            userInput = input.nextLine();
		         
					if(userInput.equalsIgnoreCase("yes")) {
						System.out.println("Set the timer in minutes.");
						int Time = input.nextInt();
						System.out.println("Your food will be ready in " + Time + " minutes.");
											
																			
					}else if(userInput.equalsIgnoreCase("no")) {
						System.out.println("Okay, it will be ready as soon as possible\n");
						
						}label10.setVisible(true);button10.setVisible(false);
		         	
		         	}
		
		 }




	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == label) {
		label.setVisible(false);
		System.out.println("You turned the lights off.");
		button.setVisible(true);
		}
		
		else if(e.getSource() == label1) {
			label1.setVisible(false);
			System.out.println("You turned the space Heater off.");
			button1.setVisible(true);
		}
		else if(e.getSource() == label2) {
			label2.setVisible(false);
			System.out.println("You turned the coffee maker off.");
			button2.setVisible(true);
		}
		else if(e.getSource() == label3) {
			label3.setVisible(false);
			System.out.println("You turned the air-condition off.");
			button3.setVisible(true);
		}
		else if(e.getSource() == label4) {
			label4.setVisible(false);
			System.out.println("You unlocked the window.");
			button4.setVisible(true);
		}
		else if(e.getSource() == label5) {
			label5.setVisible(false);
			System.out.println("You unlocked the door.");
			button5.setVisible(true);
		}
		else if(e.getSource() == label6) {
			label6.setVisible(false);
			System.out.println("You turned the vacuum cleaner off.");
			button6.setVisible(true);
	    }
		else if(e.getSource() == label7) {
			label7.setVisible(false);
			System.out.println("You turned the alarm off.");
			button7.setVisible(true);
		    }
		else if(e.getSource() == label8) {
			label8.setVisible(false);
			System.out.println("You turned the washer off.");
			button8.setVisible(true);
		    }
		else if(e.getSource() == label9) {
			label9.setVisible(false);
			System.out.println("You turned the camera off.");
			button9.setVisible(true);
			}
		else if(e.getSource() == label10) {
			label10.setVisible(false);
			System.out.println("You turned the oven off.");
			button10.setVisible(true);
			}
	
	    
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	
}






				
			
			
			
	
	


	


