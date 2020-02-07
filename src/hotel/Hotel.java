package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hotel {

	private JFrame frame;
	private JTextField resultField;
	
	
	private double firstNum;
	private double secondNum;
	private double result;
	private String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1602, 950);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 139), 10));
		panel.setBounds(47, 73, 535, 807);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 515, 785);
		panel.add(tabbedPane);
		
		//Start of calculator
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		resultField = new JTextField();
		resultField.setHorizontalAlignment(SwingConstants.RIGHT);
		resultField.setFont(new Font("Tahoma", Font.BOLD, 40));
		resultField.setBounds(22, 11, 464, 68);
		panel_3.add(resultField);
		resultField.setColumns(10);
		
		//==================ROW 1============================
		
				JButton btnBackspace = new JButton("\uF0E7");
				btnBackspace.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(resultField.getText().length()>0) {
							String backspace =null;
							
							StringBuilder strB = new StringBuilder(resultField.getText());
							strB.deleteCharAt(resultField.getText().length()-1);
							backspace = strB.toString();
							resultField.setText(backspace);
						}
						
					}
				});
				btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 30));
				btnBackspace.setBounds(22, 90, 100, 100);
				panel_3.add(btnBackspace);
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						resultField.setText(null);
						
					}
				});
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 40));
				btnClear.setBounds(140, 90, 100, 100);
				panel_3.add(btnClear);
				
				JButton btnModulus = new JButton("%");
				btnModulus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum = Double.parseDouble(resultField.getText());
						resultField.setText("");
						operations = "%";
						
					}
				});
				btnModulus.setFont(new Font("Tahoma", Font.BOLD, 30));
				btnModulus.setBounds(268, 90, 100, 100);
				panel_3.add(btnModulus);
				
				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum = Double.parseDouble(resultField.getText());
						resultField.setText("");
						operations = "+";
						
					}
				});
				btnPlus.setFont(new Font("Tahoma", Font.BOLD, 40));
				btnPlus.setBounds(386, 90, 100, 100);
				panel_3.add(btnPlus);
				
				
				//==================ROW 2============================
					
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue = resultField.getText() + btn7.getText();
						resultField.setText(EnterValue);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 40));
				btn7.setBounds(22, 220, 100, 100);
				panel_3.add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterValue = resultField.getText() + btn8.getText();
						resultField.setText(EnterValue);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 40));
				btn8.setBounds(140, 220, 100, 100);
				panel_3.add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterValue = resultField.getText() + btn9.getText();
						resultField.setText(EnterValue);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 40));
				btn9.setBounds(268, 220, 100, 100);
				panel_3.add(btn9);
				
				JButton btnMinus = new JButton("-");
				btnMinus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum = Double.parseDouble(resultField.getText());
						resultField.setText("");
						operations = "-";
						
					}
				});
				btnMinus.setFont(new Font("Tahoma", Font.BOLD, 40));
				btnMinus.setBounds(386, 220, 100, 100);
				panel_3.add(btnMinus);
				
								
								//==================ROW 3============================
									
								JButton btn4 = new JButton("4");
								btn4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String EnterValue = resultField.getText() + btn4.getText();
										resultField.setText(EnterValue);
									}
								});
								btn4.setFont(new Font("Tahoma", Font.BOLD, 40));
								btn4.setBounds(22, 353, 100, 100);
								panel_3.add(btn4);
								
								JButton btn5 = new JButton("5");
								btn5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String EnterValue = resultField.getText() + btn5.getText();
										resultField.setText(EnterValue);
									}
								});
								btn5.setFont(new Font("Tahoma", Font.BOLD, 40));
								btn5.setBounds(140, 353, 100, 100);
								panel_3.add(btn5);
								
								JButton btn6 = new JButton("6");
								btn6.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String EnterValue = resultField.getText() + btn6.getText();
										resultField.setText(EnterValue);
									}
								});
								btn6.setFont(new Font("Tahoma", Font.BOLD, 40));
								btn6.setBounds(268, 353, 100, 100);
								panel_3.add(btn6);
								
								JButton btnMultiply = new JButton("X");
								btnMultiply.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										
										firstNum = Double.parseDouble(resultField.getText());
										resultField.setText("");
										operations = "X";
										
									}
								});
								btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 40));
								btnMultiply.setBounds(386, 353, 100, 100);
								panel_3.add(btnMultiply);
								
												
												//==================ROW 4============================
													
												JButton btn1 = new JButton("1");
												btn1.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														String EnterValue = resultField.getText() + btn1.getText();
														resultField.setText(EnterValue);
													}
												});
												btn1.setFont(new Font("Tahoma", Font.BOLD, 40));
												btn1.setBounds(22, 491, 100, 100);
												panel_3.add(btn1);
												
												JButton btn2 = new JButton("2");
												btn2.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														String EnterValue = resultField.getText() + btn2.getText();
														resultField.setText(EnterValue);
													}
												});
												btn2.setFont(new Font("Tahoma", Font.BOLD, 40));
												btn2.setBounds(140, 491, 100, 100);
												panel_3.add(btn2);
												
												JButton btn3 = new JButton("3");
												btn3.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														String EnterValue = resultField.getText() + btn3.getText();
														resultField.setText(EnterValue);
													}
												});
												btn3.setFont(new Font("Tahoma", Font.BOLD, 40));
												btn3.setBounds(268, 491, 100, 100);
												panel_3.add(btn3);
												
												JButton btnDivide = new JButton("/");
												btnDivide.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														
														firstNum = Double.parseDouble(resultField.getText());
														resultField.setText("");
														operations = "/";
														
													}
												});
												btnDivide.setFont(new Font("Tahoma", Font.BOLD, 40));
												btnDivide.setBounds(386, 491, 100, 100);
												panel_3.add(btnDivide);
												
																
																//==================ROW 5============================
																	
																JButton btn0 = new JButton("0");
																btn0.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		String EnterValue = resultField.getText() + btn0.getText();
																		resultField.setText(EnterValue);
																	}
																});
																btn0.setFont(new Font("Tahoma", Font.BOLD, 40));
																btn0.setBounds(22, 628, 100, 100);
																panel_3.add(btn0);
																
																JButton btnDot = new JButton(".");
																btnDot.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		String EnterValue = resultField.getText() + btnDot.getText();
																		resultField.setText(EnterValue);
																	}
																});
																btnDot.setFont(new Font("Tahoma", Font.BOLD, 40));
																btnDot.setBounds(140, 628, 100, 100);
																panel_3.add(btnDot);
																
																JButton btnPM = new JButton("\u00B1");
																btnPM.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		
																		double plusminus = 	Double.parseDouble(String.valueOf(resultField.getText()));
																		plusminus = plusminus * (-1);
																		resultField.setText(String.valueOf(plusminus));
																		
																	}
																});
																btnPM.setFont(new Font("Tahoma", Font.BOLD, 40));
																btnPM.setBounds(268, 628, 100, 100);
																panel_3.add(btnPM);
																
																JButton btnEqual = new JButton("=");
																btnEqual.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent arg0) {
																		
																		String answer;
																		secondNum = Double.parseDouble(resultField.getText());
																		
																		if(operations=="+") {
																			result = firstNum + secondNum;
																			answer = String.format("%.2f", result);
																			resultField.setText(answer);
																		}else if(operations=="-") {
																			result = firstNum - secondNum;
																			answer = String.format("%.2f", result);
																			resultField.setText(answer);
																		}else if(operations=="X") {
																			result = firstNum * secondNum;
																			answer = String.format("%.2f", result);
																			resultField.setText(answer);
																		}else if(operations=="/") {
																			result = firstNum / secondNum;
																			answer = String.format("%.2f", result);
																			resultField.setText(answer);
																		}else if(operations=="%") {
																			result = firstNum % secondNum;
																			answer = String.format("%.2f", result);
																			resultField.setText(answer);
																		}
																		
																	}
																});
																btnEqual.setFont(new Font("Tahoma", Font.BOLD, 40));
																btnEqual.setBounds(386, 628, 100, 100);
																panel_3.add(btnEqual);
																
																
																
																//End of calculator
																
																
																
																
																//Start of Receipt
																
																JPanel panel_4 = new JPanel();
																tabbedPane.addTab("Receipt", null, panel_4, null);
																panel_4.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 10));
		panel_1.setBounds(592, 166, 941, 355);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 128), 10));
		panel_2.setBounds(592, 525, 941, 355);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(51, 11, 1482, 51);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		mnFile.setForeground(new Color(128, 0, 0));
		mnFile.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnFile.add(mnNew);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Receipt");
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnNew.add(mntmNewMenuItem);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.setForeground(new Color(220, 20, 60));
		mntmReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnNew.add(mntmReset);
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnFile.add(mntmConvert);
		
		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnFile.add(mntmTotal);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.setForeground(new Color(50, 205, 50));
		mntmRefresh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnFile.add(mntmRefresh);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(255, 0, 0));
		mntmExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnFile.add(mntmExit);
		
		JMenu mnConvert = new JMenu("Convert");
		mnConvert.setForeground(new Color(128, 0, 0));
		mnConvert.setFont(new Font("Times New Roman", Font.BOLD, 25));
		menuBar.add(mnConvert);
		
		JMenu mnTotal = new JMenu("Total");
		mnTotal.setForeground(new Color(128, 0, 0));
		mnTotal.setFont(new Font("Times New Roman", Font.BOLD, 25));
		menuBar.add(mnTotal);
		
		JMenu mnReset = new JMenu("Reset");
		mnReset.setForeground(new Color(128, 0, 0));
		mnReset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		menuBar.add(mnReset);
		
		JMenu mnReceipt = new JMenu("Receipt");
		mnReceipt.setForeground(new Color(128, 0, 0));
		mnReceipt.setFont(new Font("Times New Roman", Font.BOLD, 25));
		menuBar.add(mnReceipt);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.setForeground(new Color(255, 0, 0));
		mnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		menuBar.add(mnExit);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setBounds(643, 60, 923, 93);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 75));
	}
}
