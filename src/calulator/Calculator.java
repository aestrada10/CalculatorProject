package calulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double EnterN1;
	double EnterN2;
	double Result;
	String Operator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Courier New", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(11, 6, 378, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				String fn, sn;
				fn = String.valueOf(EnterN1);
				sn = String.valueOf(EnterN2);
				fn = "";
				sn = "";
			}
		});
		btnCE.setFont(new Font("Courier New", Font.BOLD, 24));
		btnCE.setBounds(111, 76, 88, 72);
		contentPane.add(btnCE);
		
		JButton btnarrow = new JButton("\uF0E7");
		btnarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs = null;
				if(textField.getText().length() > 0) 
				{
					StringBuilder stA = new StringBuilder(textField.getText());
					stA.deleteCharAt(textField.getText().length()-1);
					bs = stA.toString();
					textField.setText(bs);
				}
			}
		});
		btnarrow.setFont(new Font("Wingdings", Font.BOLD, 24));
		btnarrow.setBounds(11, 76, 88, 72);
		contentPane.add(btnarrow);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");			
			}
		});
		btnC.setFont(new Font("Courier New", Font.BOLD, 24));
		btnC.setBounds(209, 76, 88, 72);
		contentPane.add(btnC);
		
		JButton btnsign = new JButton("+/-");
		btnsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double pm = Double.parseDouble(String.valueOf(textField.getText()));
			pm = pm * (-1);
			textField.setText(String.valueOf(pm));
			}
		});

		
		btnsign.setFont(new Font("Courier New", Font.BOLD, 24));
		btnsign.setBounds(306, 76, 88, 72);
		contentPane.add(btnsign);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn8.getText();
				textField.setText(digit);
			}
		});
		btn8.setFont(new Font("Courier New", Font.BOLD, 24));
		btn8.setBounds(111, 160, 88, 72);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn7.getText();
				textField.setText(digit);
			}
		});
		btn7.setFont(new Font("Courier New", Font.BOLD, 24));
		btn7.setBounds(11, 160, 88, 72);
		contentPane.add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn9.getText();
				textField.setText(digit);
			}
		});
		btn9.setFont(new Font("Courier New", Font.BOLD, 24));
		btn9.setBounds(209, 160, 88, 72);
		contentPane.add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnterN1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				Operator = "+";
			}
		});
		
		btnplus.setFont(new Font("Courier New", Font.BOLD, 24));
		btnplus.setBounds(306, 160, 88, 72);
		contentPane.add(btnplus);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn5.getText();
				textField.setText(digit);
			}
		});
		btn5.setFont(new Font("Courier New", Font.BOLD, 24));
		btn5.setBounds(111, 244, 88, 72);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn4.getText();
				textField.setText(digit);
			}
		});
		btn4.setFont(new Font("Courier New", Font.BOLD, 24));
		btn4.setBounds(11, 244, 88, 72);
		contentPane.add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn6.getText();
				textField.setText(digit);
			}
		});
		btn6.setFont(new Font("Courier New", Font.BOLD, 24));
		btn6.setBounds(209, 244, 88, 72);
		contentPane.add(btn6);
		
		JButton btnneg = new JButton("-");
		btnneg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnterN1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				Operator = "-";
			}
		});

		btnneg.setFont(new Font("Courier New", Font.BOLD, 24));
		btnneg.setBounds(306, 244, 88, 72);
		contentPane.add(btnneg);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn2.getText();
				textField.setText(digit);
			}
		});
		btn2.setFont(new Font("Courier New", Font.BOLD, 24));
		btn2.setBounds(111, 328, 88, 72);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn1.getText();
				textField.setText(digit);
			}
		});
		btn1.setFont(new Font("Courier New", Font.BOLD, 24));
		btn1.setBounds(11, 328, 88, 72);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn3.getText();
				textField.setText(digit);
			}
		});
		btn3.setFont(new Font("Courier New", Font.BOLD, 24));
		btn3.setBounds(209, 328, 88, 72);
		contentPane.add(btn3);
		
		JButton btntimes = new JButton("*");
		btntimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnterN1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				Operator = "*";
			}
		});

		btntimes.setFont(new Font("Courier New", Font.BOLD, 24));
		btntimes.setBounds(306, 328, 88, 72);
		contentPane.add(btntimes);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String digit = textField.getText() + btn0.getText();
				textField.setText(digit);
			}
		});
		btn0.setFont(new Font("Courier New", Font.BOLD, 24));
		btn0.setBounds(11, 412, 88, 72);
		contentPane.add(btn0);
		
		JButton btnperiod = new JButton(".");
		btnperiod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) 
				{
					textField.setText(textField.getText()+btnperiod.getText());
				}
			}
		});
		btnperiod.setFont(new Font("Courier New", Font.BOLD, 24));
		btnperiod.setBounds(111, 412, 88, 72);
		contentPane.add(btnperiod);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterN2 = Double.parseDouble(textField.getText());
				if(Operator == "+")
				{
					Result = EnterN1 + EnterN2;
					textField.setText(String.valueOf(Result));
				}
				else if(Operator == "-")
				{
					Result = EnterN1 - EnterN2;
					textField.setText(String.valueOf(Result));
				}
				else if(Operator == "*")
				{
					Result = EnterN1 * EnterN2;
					textField.setText(String.valueOf(Result));
				}
				else if(Operator == "/")
				{
					Result = EnterN1 / EnterN2;
					textField.setText(String.valueOf(Result));
				}
				
			}
		});
		
		btnequals.setFont(new Font("Courier New", Font.BOLD, 24));
		btnequals.setBounds(209, 412, 88, 72);
		contentPane.add(btnequals);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnterN1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				Operator = "/";
			}
		});

		btndivide.setFont(new Font("Courier New", Font.BOLD, 24));
		btndivide.setBounds(306, 412, 88, 72);
		contentPane.add(btndivide);
	}
}
