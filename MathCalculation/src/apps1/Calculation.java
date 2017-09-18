package apps1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Calculation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnReset;
	private JButton btnCalculate;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation window = new Calculation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Time Complexity");
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPrahlad = new JLabel("- By Prahlad");
		lblPrahlad.setBounds(338, 324, 98, 15);
		frame.getContentPane().add(lblPrahlad);
		
		JLabel lblValueOfN = new JLabel("Value of n : ");
		lblValueOfN.setBounds(143, 15, 105, 25);
		frame.getContentPane().add(lblValueOfN);
		
		textField = new JTextField();
		textField.setBounds(253, 15, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n, a, b, c, d, valueN;
				int operation = 100000000;
				n = Double.parseDouble(textField.getText());
				a = (Math.log(n)/Math.log(2))/operation;
				b = (Math.sqrt(n))/operation;
				valueN = n/operation;
				c = ((n*a));
				d = (n * n)/operation;
				
				// if the value is below 1 then display with green color
				if(a <= 1) {
					textField_1.setForeground(Color.GREEN);
					textField_1.setText(String.format("%.6f", a));
				}
				else {
					textField_1.setForeground(Color.RED);
					textField_1.setText(String.format("%.6f", a));
				}
				
				if(b <= 1) {
					textField_2.setForeground(Color.GREEN);
					textField_2.setText(String.format("%.6f", b));
				}
				else {
					textField_2.setForeground(Color.RED);
					textField_2.setText(String.format("%.6f", b));
				}
				
				if(c <= 1) {
					textField_3.setForeground(Color.GREEN);
					textField_3.setText(String.format("%.6f", c));
				}
				else {
					textField_3.setForeground(Color.RED);
					textField_3.setText(String.format("%.6f", c));
				}
				
				if(valueN <= 1) {
					textField_6.setForeground(Color.GREEN);
					textField_6.setText(String.format("%.6f", valueN));
				}
				else {
					textField_6.setForeground(Color.RED);
					textField_6.setText(String.format("%.6f", valueN));
				}
				
				if(d <= 1) {
					textField_4.setForeground(Color.GREEN);
					textField_4.setText(String.format("%.6f", d));
				}
				else {
					textField_4.setForeground(Color.RED);
					textField_4.setText(String.format("%.6f", d));
				}
			}
		});
		btnCalculate.setBounds(178, 62, 117, 25);
		frame.getContentPane().add(btnCalculate);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 119, 339, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogN = new JLabel("log n :");
		lblLogN.setBounds(22, 12, 70, 15);
		panel.add(lblLogN);
		
		JLabel lblSqrtn = new JLabel("sqrt(n) :");
		lblSqrtn.setBounds(22, 39, 70, 15);
		panel.add(lblSqrtn);
		
		JLabel lblNlogn = new JLabel("nlogn :");
		lblNlogn.setBounds(22, 99, 70, 15);
		panel.add(lblNlogn);
		
		JLabel lblN = new JLabel("n^2 :");
		lblN.setBounds(22, 126, 70, 15);
		panel.add(lblN);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(87, 10, 168, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(87, 37, 168, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(87, 95, 168, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(87, 124, 168, 19);
		panel.add(textField_4);
		
		JLabel lblN_2 = new JLabel("n : ");
		lblN_2.setBounds(22, 66, 63, 15);
		panel.add(lblN_2);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(87, 66, 168, 19);
		panel.add(textField_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 97, 424, 2);
		frame.getContentPane().add(separator);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_6.setText(null);
			}
		});
		btnReset.setBounds(178, 302, 117, 25);
		frame.getContentPane().add(btnReset);
	}
}
