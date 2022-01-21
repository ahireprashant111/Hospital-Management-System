import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setTitle("Doctor Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDoctorDetails = new JLabel("Doctor details");
		lblDoctorDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctorDetails.setForeground(Color.MAGENTA);
		lblDoctorDetails.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblDoctorDetails.setBackground(Color.CYAN);
		lblDoctorDetails.setBounds(46, 25, 234, 33);
		panel.add(lblDoctorDetails);
		
		JButton btnNewButton_1 = new JButton("Update Doctor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateDoctor a=new UpdateDoctor();
				a.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(86, 184, 142, 52);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Add Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDoctor a=new AddDoctor();
				a.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(86, 99, 142, 52);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Delete Doctor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteDoctor a=new DeleteDoctor();
				a.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(86, 289, 142, 52);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(255, 0, 51));
		btnNewButton_3.setBounds(97, 371, 113, 33);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Doctor5.png"));
		lblNewLabel.setBounds(310, 25, 537, 389);
		panel.add(lblNewLabel);
	}
}
