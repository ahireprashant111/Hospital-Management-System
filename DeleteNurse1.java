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
import javax.swing.JRadioButton;

public class DeleteNurse1 extends JFrame {

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
					DeleteNurse1 frame = new DeleteNurse1();
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
	public DeleteNurse1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDeleteNurseDetails = new JLabel("Delete Nurse Details");
		lblDeleteNurseDetails.setForeground(Color.MAGENTA);
		lblDeleteNurseDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeleteNurseDetails.setBounds(115, 20, 255, 46);
		panel.add(lblDeleteNurseDetails);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nurse Id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(58, 88, 129, 30);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(197, 95, 106, 22);
		panel.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(58, 165, 103, 30);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 172, 106, 22);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Qualification");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(58, 215, 103, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(58, 251, 121, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(58, 296, 112, 29);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Department Id");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(58, 335, 121, 30);
		panel.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 219, 106, 24);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(197, 258, 106, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(197, 302, 106, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(197, 340, 106, 26);
		panel.add(textField_5);
		
		JButton btnDeleteDetails = new JButton("Delete Details");
		btnDeleteDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnDeleteDetails.setBounds(58, 391, 101, 39);
		panel.add(btnDeleteDetails);
		
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

                 	 textField_2.setText(rs.getString(5));

                 	 textField_3.setText(rs.getString(4));

				        textField_4.setText(rs.getString(7));

				        textField_5.setText(rs.getString(6));   
				       
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
		btnNewButton_1.setBounds(144, 128, 106, 24);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
				
			}
		});
		btnNewButton.setBounds(197, 391, 112, 39);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Nurse3.jpg"));
		lblNewLabel.setBounds(399, 20, 386, 410);
		panel.add(lblNewLabel);
	}
}
