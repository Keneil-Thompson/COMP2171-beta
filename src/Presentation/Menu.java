package Presentation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

import Business.IDandPasswords;
import Business.SimpleCalendar;
import Business.EmailSender;


public class Menu implements ActionListener{

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	JButton myButton1 = new JButton("View Schedule");
	JButton myButton2 = new JButton("Send Email");
	JButton myButton3 = new JButton("Add Customer");
	JButton myButton4 = new JButton("Add Employee");
	
	public Menu(String userID){
		
		myButton1.setBounds(100,100,200,40);
		myButton1.setFocusable(false);
		myButton1.addActionListener(this);
		
		myButton2.setBounds(100,150,200,40);
		myButton2.setFocusable(false);
		myButton2.addActionListener(this);
		
		myButton3.setBounds(100,200,200,40);
		myButton3.setFocusable(false);
		myButton3.addActionListener(this);

		myButton4.setBounds(100,250,200,40);
		myButton4.setFocusable(false);
		myButton4.addActionListener(this);
		
		welcomeLabel.setBounds(10,10,400,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Welcome, "+userID);
						
		frame.add(welcomeLabel);
		frame.add(myButton1);
		frame.add(myButton2);
		frame.add(myButton3);
		if(userID.equals("Admin")) {
			frame.add(myButton4);			
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		 if(e.getSource()==myButton1) {
		      SwingUtilities.invokeLater(() -> {
		          try
		          {
		        	 frame.dispose();
		             SimpleCalendar frame = new SimpleCalendar();
		             frame.setSize(700, 450);
		             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		             frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		             frame.setResizable(false);
		             frame.setVisible(true);
		          }
		          catch (Exception e1)
		          {
		             e1.printStackTrace();
		          }
		       });
		 }
		 if(e.getSource()==myButton2) {
			SwingUtilities.invokeLater(() -> {
				try
				{
				   frame.dispose();
				   EmailSender frame = new EmailSender();
				   frame.setSize(700, 450);
				   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				   frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
				   frame.setResizable(false);
				   frame.setVisible(true);
				}
				catch (Exception e1)
				{
				   e1.printStackTrace();
				}
			 });
		 }
		 if(e.getSource()==myButton3) {
			SwingUtilities.invokeLater(() -> {
				try
				{
				   frame.dispose();
				   addEmployee frame = new addEmployee();
				   /*frame.setSize(700, 450);
				   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				   frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
				   frame.setResizable(false);
				   frame.setVisible(true);*/
				}
				catch (Exception e1)
				{
				   e1.printStackTrace();
				}
			 });
		 }
		 if(e.getSource()==myButton4) {
			SwingUtilities.invokeLater(() -> {
				try
				{
				   frame.dispose();
				   /*addCustomer frame = new AddCustomer();
				   frame.setSize(700, 450);
				   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				   frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
				   frame.setResizable(false);
				   frame.setVisible(true);*/
				}
				catch (Exception e1)
				{
				   e1.printStackTrace();
				}
			 });
		}
	}
}