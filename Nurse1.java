
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

public class Nurse1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nurse1 frame = new Nurse1();
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
	public Nurse1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nurse details");
		lblNewLabel.setBounds(46, 36, 209, 45);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBackground(Color.CYAN);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Update Nurse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateNurse1 a=new UpdateNurse1();
				a.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(87, 191, 142, 52);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Add Nurse ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNurse1 a=new AddNurse1();
				a.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(87, 112, 142, 52);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Delete Nurse");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteNurse1 a=new DeleteNurse1();
				a.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(87, 273, 142, 52);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();

			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(new Color(255, 0, 51));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(92, 369, 113, 33);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("Nurse.png"));
		
		lblNewLabel_1.setBounds(281, 36, 572, 392);
		panel.add(lblNewLabel_1);
	}

}
