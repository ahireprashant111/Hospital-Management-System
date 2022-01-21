import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTree;

public class UpdateDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
String name,gender,quali,avali,speci;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDoctor frame = new UpdateDoctor();
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
	public UpdateDoctor() {
		setTitle("Update Doctor Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUpdateDoctorDetails = new JLabel("Update Doctor Details");
		lblUpdateDoctorDetails.setForeground(Color.BLUE);
		lblUpdateDoctorDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUpdateDoctorDetails.setBounds(245, 10, 348, 58);
		panel.add(lblUpdateDoctorDetails);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(148, 79, 134, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Qualification");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(148, 182, 107, 35);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(148, 241, 107, 36);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Speciality");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(148, 297, 107, 36);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Update Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				quali=textField_1.getText();
				gender=textField_2.getText();
				speci=textField_3.getText();
				avali=textField_4.getText();
				
				try
			
				{	
						Class.forName("com.mysql.cj.jdbc.Driver");  
    	    
						Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

						PreparedStatement pstmt=ms.prepareStatement("Update doctor set quali=?, gender=?,speci=?,avali=?  where name= ?");
                           
						
						
						pstmt.setString(1,quali);

                        pstmt.setString(2,gender);

						pstmt.setString(3,speci);
     
						pstmt.setString(4,avali);
						
						 pstmt.setString(5,name); 
						
						

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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(160, 393, 134, 36);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(318, 79, 143, 36);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(318, 182, 143, 36);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(318, 242, 143, 36);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(318, 298, 143, 36);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Availability");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(148, 343, 107, 36);
		panel.add(lblNewLabel_1_3_1);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(318, 390, 143, 39);
		panel.add(btnNewButton_1);
		
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(318, 344, 143, 36);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Doctor1.png"));
		lblNewLabel.setBounds(515, 23, 319, 394);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Get Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try
				
			       {
                	    Class.forName("com.mysql.cj.jdbc.Driver");  
                	    
                	    Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

                	    name=textField.getText();
                         			    
                     PreparedStatement pstmt=ms.prepareStatement("Select * from doctor where name=? ");
                 
	                    pstmt.setString(1,name); 
                                                                         
                     ResultSet rs=pstmt.executeQuery();                           
                                                                       
                                                                           
                     if(rs.next())

                     {
                                                                     	 
                                                                              
                    	 textField_1.setText(rs.getString(3));

                    	 textField_2.setText(rs.getString(4));

                    	 textField_3.setText(rs.getString(5));

				        textField_4.setText(rs.getString(6));

				         
				       
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
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(229, 125, 119, 35);
		panel.add(btnNewButton_2);
	}
}
