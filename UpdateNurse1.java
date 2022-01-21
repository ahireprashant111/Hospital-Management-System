import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class UpdateNurse1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	String nurseid,name,quali,age,sal,dept;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateNurse1 frame = new UpdateNurse1();
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
	public UpdateNurse1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nurse Profile Window");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(60, 10, 204, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nurse ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(57, 63, 103, 19);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(186, 63, 96, 19);
		panel.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Nurse details");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(81, 123, 164, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(57, 177, 96, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Qualification");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(60, 222, 95, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(60, 262, 104, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Salary");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(60, 302, 103, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Department Id");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(60, 343, 96, 16);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Update Nurse Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nurseid=textField.getText();
				name=textField_1.getText();
				quali=textField_2.getText();
				age=textField_3.getText();
				sal=textField_4.getText();
				dept=textField_5.getText();
				try
			
				{	
						Class.forName("com.mysql.cj.jdbc.Driver");  
    	    
						Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

						PreparedStatement pstmt=ms.prepareStatement("Update nurse set name=?, quali=?,age=?,sal=? ,dept=? where nurseid= ?");
                           
					
						
						pstmt.setString(1,name);

                        pstmt.setString(2,quali);

						pstmt.setString(3,age);
     
						pstmt.setString(4,sal);
						
						pstmt.setString(5,dept);
						
						pstmt.setString(6,nurseid);
						

						pstmt.executeUpdate();

						JOptionPane.showMessageDialog(null, "Data Updated Successful");

                         ms.commit();  

                         pstmt.close();

                         ms.close();

  }

  catch(Exception ex) {  
	  System.out.println(ex.getMessage()); 
  }
				


				
				
			}
		});
		btnNewButton.setBounds(36, 395, 164, 34);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(186, 177, 96, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(186, 220, 96, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(186, 260, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(186, 300, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(186, 341, 96, 19);
		panel.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
				
			       {
                	    Class.forName("com.mysql.cj.jdbc.Driver");  
                	    
                	    Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

                	    nurseid=textField.getText();
                         			    
                     PreparedStatement pstmt=ms.prepareStatement("Select * from nurse where nurseid=? ");
                 
	                    pstmt.setString(1,nurseid); 
                                                                         
                     ResultSet rs=pstmt.executeQuery();                           
                                                                       
                                                                           
                     if(rs.next())

                     {
                                                                     	 
                                                                              
                    	 textField_1.setText(rs.getString(3));

                    	 textField_2.setText(rs.getString(4));

                    	 textField_3.setText(rs.getString(5));

				        textField_4.setText(rs.getString(6));

				        textField_5.setText(rs.getString(7));   
				       
				        JOptionPane.showMessageDialog(null, "Record found");
				       
				  
				       
				        }
                     else {                          
                     JOptionPane.showMessageDialog(null, "Record Not found");
                      }

                    pstmt.close();

    ms.close();
    
                           
                           
    }
               
  catch(Exception ex){  System.out.println(ex.getMessage()); }

    }
		
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(109, 92, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();

			}	
		});
		btnNewButton_2.setBounds(259, 395, 133, 34);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Nurse2.jpg"));
		lblNewLabel.setBounds(422, 22, 373, 414);
		panel.add(lblNewLabel);
		
	}
}
