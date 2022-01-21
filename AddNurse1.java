import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNurse1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	String nurseid,name, quali, age, sal, dept;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNurse1 frame = new AddNurse1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNurse1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add Nurse Details");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(125, 10, 230, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nurse Id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(71, 70, 112, 13);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(205, 69, 96, 19);
		panel.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(71, 99, 83, 18);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 101, 96, 19);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(71, 179, 83, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Qualification");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(72, 137, 85, 24);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(71, 223, 96, 18);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Department Id");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(71, 263, 112, 13);
		panel.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 179, 96, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(205, 142, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 262, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(205, 225, 96, 19);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("Add Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try
					
			       {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             
             Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

             nurseid=textField.getText();

			 name=textField_1.getText();

             quali=textField_2.getText();

             age=textField_3.getText();

		     sal=textField_4.getText();
                                                  
             dept=textField_5.getText();

             PreparedStatement pstmt=ms.prepareStatement("insert into nurse  (nurseidd, namee, qualii, agee, sall, deptt)values(?,?,?,?,?,?)");

             pstmt.setString(1,nurseid);
                                                                  
             pstmt.setString(2,name);

		     pstmt.setString(3,quali);
		     
			 pstmt.setString(4,age);

             pstmt.setString(5,sal);
             
             pstmt.setString(6,dept);

             pstmt.executeUpdate();
               
             JOptionPane.showMessageDialog(null, "Data Inserted Successful");

             pstmt.close();

             ms.close();
                            
                            
                 }
                
                        catch(Exception ex)
             { 
                      	  System.out.println(ex.getMessage()); 
             }
				
				
			}
		});
		btnNewButton.setBounds(62, 351, 101, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
			}
		});
		btnNewButton_1.setBounds(200, 351, 101, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Nurse1.png"));
		lblNewLabel.setBounds(365, 17, 324, 398);
		panel.add(lblNewLabel);
	}

}
