package ProjectIS216;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PT2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PT2 frame = new PT2();
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
	public PT2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(246, 241, 241));
		contentPane.setForeground(new Color(20, 108, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 289, 706, 78);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		Button Giải = new Button("Giải");
		Giải.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String sa = txtA.getText();
					int a = 0, b = 0, c = 0;
					try {
						a = Integer.parseInt(sa);
					}
					catch(Exception ex) {
						String kq = "Nhập sai định dạng!!!"; 
						txtKQ.setText(kq);
						txtA.selectAll();
						txtA.requestFocus();
						return;
					}

					String sb = txtB.getText();
					try {
						b = Integer.parseInt(sb);
					}
					catch(Exception ex) {
						String kq = "Nhập sai định dạng!!!"; 
						txtKQ.setText(kq);
						txtB.selectAll();
						txtB.requestFocus();
						return;
					}
					
					String sc = txtC.getText();
					try {
						c = Integer.parseInt(sc);
					}
					catch(Exception ex) {
						String kq = "Nhập sai định dạng!!!"; 
						txtKQ.setText(kq);
						txtC.selectAll();
						txtC.requestFocus();
						return;
					}
					
					String kq1 = null;

					PT2E engine = new PT2E();

					kq1 = engine.compute();

					txtKQ.setText(kq1);
			}
		});
		Giải.setBackground(new Color(175, 211, 226));
		Giải.setForeground(new Color(20, 108, 148));
		Giải.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(Giải);
		
		Button Xóa = new Button("Xóa");
		Xóa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText(null);
				txtB.setText(null);
				txtC.setText(null);
				txtKQ.setText(null);
			}
		});
		Xóa.setForeground(new Color(20, 108, 148));
		Xóa.setBackground(new Color(175, 211, 226));
		Xóa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(Xóa);
		
		Button Thoát = new Button("Thoát");
		Thoát.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Thoát.setForeground(new Color(20, 108, 148));
		Thoát.setBackground(new Color(175, 211, 226));
		Thoát.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(Thoát);
		
		JLabel lblNewLabel = new JLabel("Giải phương trình bậc 2");
		lblNewLabel.setForeground(new Color(20, 108, 148));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 706, 22);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 42, 706, 237);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Phương trình có dạng:");
		lblNewLabel_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 20, 200, 34);
		panel_1.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.RIGHT);
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(214, 20, 50, 34);
		panel_1.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("x   +");
		lblNewLabel_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(274, 20, 48, 34);
		panel_1.add(lblNewLabel_2);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setBounds(321, 20, 50, 34);
		panel_1.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC.setColumns(10);
		txtC.setBounds(412, 20, 50, 34);
		panel_1.add(txtC);
		
		JLabel lblNewLabel_3 = new JLabel("= 0");
		lblNewLabel_3.setForeground(new Color(20, 108, 148));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(466, 20, 41, 34);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả:");
		lblNewLabel_4.setForeground(new Color(20, 108, 148));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 76, 131, 25);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(151, 76, 545, 151);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtKQ = new JTextField();
		txtKQ.setHorizontalAlignment(SwingConstants.LEFT);
		txtKQ.setForeground(new Color(20, 108, 148));
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKQ.setBounds(10, 10, 525, 131);
		panel_2.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("x +");
		lblNewLabel_5.setForeground(new Color(20, 108, 148));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(379, 20, 30, 34);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("2");
		lblNewLabel_6.setForeground(new Color(20, 108, 148));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(285, 20, 50, 25);
		panel_1.add(lblNewLabel_6);
	}
}
