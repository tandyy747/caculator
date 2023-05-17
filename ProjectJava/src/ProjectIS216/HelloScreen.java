package ProjectIS216;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class HelloScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HelloScreen frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloScreen frame = new HelloScreen();
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
	public HelloScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(246, 241, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Vẽ đồ thị");
		btnNewButton.setBackground(new Color(175, 211, 226));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PT1 newFrame = new PT1();
			    newFrame.setVisible(true);
			    frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(20, 108, 148));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(202, 305, 334, 61);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("IS216.N21.HTCL - ĐỒ ÁN MÔN HỌC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(20, 108, 148));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(103, 10, 526, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULATOR ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(267, 69, 204, 76);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Phương trình bậc 2");
		btnNewButton_1.setBackground(new Color(175, 211, 226));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PT2 newFrame = new PT2();
			    newFrame.setVisible(true);
			    frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(20, 108, 148));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(201, 231, 335, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Phương trình bậc 1");
		btnNewButton_2.setBackground(new Color(175, 211, 226));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PT1 newFrame = new PT1();
				newFrame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(20, 108, 148));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(201, 158, 335, 61);
		contentPane.add(btnNewButton_2);
	}
}
