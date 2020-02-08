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
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField resultField;
	
	
	private double firstNum;
	private double secondNum;
	private double result;
	private String operations;
	private JTextField txtFriedRice;
	private JTextField txtShawarma;
	private JTextField txtChicken;
	private JTextField txtDrink;
	private JTextField txtCurrencyAmount;

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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 490, 735);
		panel_4.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 10));
		panel_1.setBounds(592, 166, 956, 405);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(new Color(0, 206, 209));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 32, 83, 37);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setForeground(new Color(0, 206, 209));
		lblQty.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQty.setBounds(263, 32, 83, 37);
		panel_1.add(lblQty);
		
		JLabel lblPrice = new JLabel("Price $");
		lblPrice.setForeground(new Color(0, 206, 209));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblPrice.setBounds(379, 32, 110, 37);
		panel_1.add(lblPrice);
		
		JLabel btnFriedRice = new JLabel("Fried RIce");
		btnFriedRice.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnFriedRice.setBounds(33, 91, 128, 37);
		panel_1.add(btnFriedRice);
		
		JLabel btnShawarma = new JLabel("Shawarma");
		btnShawarma.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnShawarma.setBounds(33, 139, 128, 37);
		panel_1.add(btnShawarma);
		
		JLabel btnChicken = new JLabel("Chicken");
		btnChicken.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnChicken.setBounds(33, 187, 128, 37);
		panel_1.add(btnChicken);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtFriedRice.setBounds(236, 95, 110, 37);
		panel_1.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtShawarma = new JTextField();
		txtShawarma.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtShawarma.setColumns(10);
		txtShawarma.setBounds(236, 139, 110, 37);
		panel_1.add(txtShawarma);
		
		JLabel label = new JLabel("5.676");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label.setBounds(397, 91, 128, 37);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("3.987");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_1.setBounds(397, 139, 128, 37);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("11.452");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_2.setBounds(397, 187, 128, 37);
		panel_1.add(label_2);
		
		JComboBox btnDrink = new JComboBox();
		btnDrink.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coka Cola", "7UP", "Pepsi"}));
		btnDrink.setBounds(33, 246, 185, 37);
		panel_1.add(btnDrink);
		
		JLabel label_3 = new JLabel("------");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_3.setBounds(407, 246, 128, 37);
		panel_1.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 165, 0));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(512, 36, 13, 343);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 128));
		separator_3.setBounds(20, 293, 482, 2);
		panel_1.add(separator_3);
		
		JComboBox btnRoom = new JComboBox();
		btnRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "201", "VIP"}));
		btnRoom.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnRoom.setBounds(33, 306, 185, 37);
		panel_1.add(btnRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelivery.setBounds(33, 350, 98, 29);
		panel_1.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTax.setBounds(133, 350, 85, 29);
		panel_1.add(btnTax);
		
		
		
		JButton btnResetFood = new JButton("Reset");
		btnResetFood.setForeground(new Color(165, 42, 42));
		btnResetFood.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnResetFood.setBounds(228, 321, 128, 37);
		panel_1.add(btnResetFood);
		
		txtChicken = new JTextField();
		txtChicken.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtChicken.setColumns(10);
		txtChicken.setBounds(236, 187, 110, 37);
		panel_1.add(txtChicken);
		
		txtDrink = new JTextField();
		txtDrink.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtDrink.setColumns(10);
		txtDrink.setBounds(236, 246, 110, 37);
		panel_1.add(txtDrink);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(new Color(205, 92, 92));
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblCurrencyConverter.setBounds(570, 31, 319, 37);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox txtCountry = new JComboBox();
		txtCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Bangladesh", "India", "China"}));
		txtCountry.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtCountry.setBounds(590, 107, 261, 37);
		panel_1.add(txtCountry);
		
		txtCurrencyAmount = new JTextField();
		txtCurrencyAmount.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtCurrencyAmount.setColumns(10);
		txtCurrencyAmount.setBounds(590, 176, 261, 48);
		panel_1.add(txtCurrencyAmount);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtCurrencyOutput.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtCurrencyOutput.setBounds(585, 247, 266, 48);
		panel_1.add(txtCurrencyOutput);
		
		JButton btnResetConverter = new JButton("Reset");
		btnResetConverter.setForeground(new Color(165, 42, 42));
		btnResetConverter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnResetConverter.setBounds(590, 321, 128, 37);
		panel_1.add(btnResetConverter);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setForeground(new Color(0, 128, 0));
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnConvert.setBounds(723, 321, 128, 37);
		panel_1.add(btnConvert);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 128), 10));
		panel_2.setBounds(592, 582, 956, 298);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel btnTotalCostMeal = new JLabel("Total Cost of Meal");
		btnTotalCostMeal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnTotalCostMeal.setBounds(27, 26, 204, 37);
		panel_2.add(btnTotalCostMeal);
		
		JLabel btnTotalCostDrink = new JLabel("Total Cost of Drink");
		btnTotalCostDrink.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnTotalCostDrink.setBounds(27, 89, 204, 37);
		panel_2.add(btnTotalCostDrink);
		
		JLabel btnDeliveryCost = new JLabel("Cost of Delivery");
		btnDeliveryCost.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnDeliveryCost.setBounds(27, 144, 204, 37);
		panel_2.add(btnDeliveryCost);
		
		JLabel btnRoomCost = new JLabel("Cost of Room");
		btnRoomCost.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnRoomCost.setBounds(27, 204, 204, 37);
		panel_2.add(btnRoomCost);
		
		JLabel txtTotalCostMeal = new JLabel("");
		txtTotalCostMeal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtTotalCostMeal.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtTotalCostMeal.setBounds(265, 26, 223, 37);
		panel_2.add(txtTotalCostMeal);
		
		JLabel txtTotalCostDrink = new JLabel("");
		txtTotalCostDrink.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtTotalCostDrink.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtTotalCostDrink.setBounds(265, 89, 223, 37);
		panel_2.add(txtTotalCostDrink);
		
		
		JLabel txtDeliveryCost = new JLabel("");
		txtDeliveryCost.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtDeliveryCost.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtDeliveryCost.setBounds(265, 144, 223, 37);
		panel_2.add(txtDeliveryCost);
		
		JLabel txtRoomCost = new JLabel("");
		txtRoomCost.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtRoomCost.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtRoomCost.setBounds(265, 204, 223, 37);
		panel_2.add(txtRoomCost);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(new Color(255, 165, 0));
		separator_4.setBounds(513, 25, 13, 248);
		panel_2.add(separator_4);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnTax1.setBounds(548, 45, 59, 37);
		panel_2.add(btnTax1);
		
		JLabel btnSubTotal = new JLabel("Sub Total");
		btnSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSubTotal.setBounds(548, 123, 108, 37);
		panel_2.add(btnSubTotal);
		
		JLabel btnGrandTotal = new JLabel("Grand Total");
		btnGrandTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnGrandTotal.setBounds(547, 204, 133, 37);
		panel_2.add(btnGrandTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtTax.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtTax.setBounds(690, 45, 223, 37);
		panel_2.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtSubTotal.setBounds(690, 123, 223, 37);
		panel_2.add(txtSubTotal);
		
		JLabel txtGrandTotal = new JLabel("");
		txtGrandTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtGrandTotal.setBorder(new LineBorder(new Color(0, 0, 128), 1));
		txtGrandTotal.setBounds(690, 204, 223, 37);
		panel_2.add(txtGrandTotal);
		
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
		
		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mnNew.add(mntmReceipt);
		
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
		lblNewLabel.setBounds(655, 62, 923, 93);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 75));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//================== Meal Section ===========
				double friedRice = Double.parseDouble(txtFriedRice.getText());
				double pFriedRice = 5.676;
				double getFriedRice = (friedRice * pFriedRice);
				
				double shawarma = Double.parseDouble(txtShawarma.getText());
				double pShawarma = 3.987;
				double getShawarma = (shawarma * pShawarma);
				
				double chicken = Double.parseDouble(txtChicken.getText());
				double pChicken = 9.452;
				double getChicken = (chicken * pChicken);
				
				double getAllMeal = getFriedRice + getShawarma + getChicken;
				
				String totalMeal = String.format("%.3f", getAllMeal);
				txtTotalCostMeal.setText(totalMeal);
				

				
				//==============Drink Section ==============
				double drinks = Double.parseDouble(txtDrink.getText());
				double cokaCola = 1.256*drinks;
				double up7 = 0.866*drinks;
				double pepsi = 0.926*drinks;
				
				if(btnDrink.getSelectedItem().equals("Coka Cola")) {
					String pCokaCola = String.format("%.3f", cokaCola);
					txtTotalCostDrink.setText(pCokaCola);
				}
				if(btnDrink.getSelectedItem().equals("7UP")) {
					String pUp7 = String.format("%.3f", up7);
					txtTotalCostDrink.setText(pUp7);
				}
				if(btnDrink.getSelectedItem().equals("Pepsi")) {
					String pPepsi = String.format("%.3f", pepsi);
					txtTotalCostDrink.setText(pPepsi);
				}
				if(btnDrink.getSelectedItem().equals("Choose a drink")) {
					String zero = "0.00";
					txtTotalCostDrink.setText(zero);
				}
				
				
				//========== Delivery ==========
				double cDelivery = 4.50;
				if(btnDelivery.isSelected()) {
					String pDelivery = String.format("%.3f", cDelivery);
					txtDeliveryCost.setText(pDelivery);
				}
				else {
					txtDeliveryCost.setText("0.00");
				}
				
				
				//============ Tax ==============
				double pTotalMeal = Double.parseDouble(txtTotalCostMeal.getText());
				double pTotalDrinks = Double.parseDouble(txtTotalCostMeal.getText());
				double pDelivery = Double.parseDouble(txtDeliveryCost.getText());
				
				double cTotal = (pTotalMeal+pTotalDrinks+pDelivery)/100;
				
				if(btnTax.isSelected()) {
					String xTotal = String.format("%.3f", cTotal);
					txtTax.setText(xTotal);
				}
				else {
					txtTax.setText("Denied to pay tax");
				}
				
				
				//============= Total ===============
				double pTotalTax = Double.parseDouble(txtTax.getText());
				
				String zTaxTotal = String.format("%.3f", pTotalTax);
				txtTax.setText(zTaxTotal);
				
				double subTotal = (pTotalMeal + pTotalDrinks + pDelivery);
				String pSubTotal = String.format("%.3f", subTotal);
				txtSubTotal.setText(pSubTotal);
				
				double grandTotal = (pTotalMeal + pTotalDrinks + pDelivery + pTotalTax);
				String pGrandTotal = String.format("%.3f", grandTotal);
				txtGrandTotal.setText(pGrandTotal);
				
			}
		});
		btnSubmit.setForeground(new Color(0, 128, 0));
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSubmit.setBounds(361, 321, 128, 37);
		panel_1.add(btnSubmit);
	}
}
