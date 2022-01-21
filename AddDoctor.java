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
import java.awt.event.ActionEvent;

public class AddDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	String name, quali, speci,gender,avali;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctor frame = new AddDoctor();
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
	public AddDoctor() {
		setTitle("Add Doctor Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Doctor Details");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(220, 35, 348, 58);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(136, 103, 134, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Qualification");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(136, 162, 107, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(136, 220, 107, 36);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Speciality");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(136, 279, 107, 36);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Add Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				 {
		             Class.forName("com.mysql.cj.jdbc.Driver");  
		             
		             Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

		             name=textField.getText();

					 quali=textField_1.getText();

		             gender=textField_2.getText();

		             speci=textField_3.getText();

				     avali=textField_4.getText();
		                                                  
		             

		             PreparedStatement pstmt=ms.prepareStatement("insert into doctor  (name, quali, gender, speci, avali)values(?,?,?,?,?)");

		             pstmt.setString(1,name);
		                                                                  
		             pstmt.setString(2,quali);

				     pstmt.setString(3,gender);
				     
					 pstmt.setString(4,speci);

		             pstmt.setString(5,avali);
		             
		             

		             pstmt.executeUpdate();
		               
		             JOptionPane.showMessageDialog(null, "Data Inserted Successful");

		             pstmt.close();

		             ms.close();
		                            
		                            
		                 }
		                
		                        catch (Exception ex)
		             { 
		                      	  System.out.println(ex.getMessage()); 
		             }
						
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(123, 391, 134, 36);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(280, 103, 143, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(280, 162, 143, 36);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(280, 221, 143, 36);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(280, 280, 143, 36);
		panel.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				   dispose();
			}
			
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(292, 390, 143, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Availability");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(136, 327, 107, 36);
		panel.add(lblNewLabel_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(280, 326, 143, 36);
		panel.add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("Doctor.png"));
		lblNewLabel_2.setBounds(466, 49, 357, 378);
		panel.add(lblNewLabel_2);
	}
}
