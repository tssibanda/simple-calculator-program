/***************************************************************************	
 * 	Description:			Simple 4 function calculator with Graphical User 
 * 							Interface
 * 
 * 	Author:				 	C18727971 Thamsanqa Sibanda
 * 
 * 	Date:				 	30 September 2021
 ***************************************************************************/
package com.app.scal;

// imported libraries
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Font;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	// Class Attributes
		private JTextField numBox;
		private JPanel cPanel;
		private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, beq, bdiv, bmul, badd, bsub, bdot, bdel, bc;
		private GridBagConstraints gbc = new GridBagConstraints();
		
		// Button Settings
		private Color fg = new Color(0xe0edfa);
		private Color color = new Color(0x0A212E);
		private Color equals = new Color(0x0399dd);
		private Color delete = new Color(0xff2d79);
		private Color border = new Color(0x051a26);
		private Font font1 = new Font("SansSerif", Font.BOLD, 20);
		private Font font2 = new Font("SansSerif", Font.PLAIN, 20);
		
		// Constructors
		public Calculator(String title) {
			super(title);
			setBounds(750,300,305,505);// program window size and position
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			java.awt.Container mainContainer = this.getContentPane();
			mainContainer.setLayout(new BorderLayout(60,20));
			
			
			// calculatorPanel
			cPanel = new JPanel();
			cPanel.setLayout(new GridBagLayout());
			cPanel.setBackground(new Color(9,33,48));
			
			
			
			// Create Number box
			numBox = new JTextField("0");
			numBox.setPreferredSize( new Dimension(289, 100));
			numBox.setBackground(fg);
			numBox.setFont(font1);
			numBox.setBorder(new LineBorder(fg));
			numBox.setEditable(false);
			numBox.setHorizontalAlignment(JTextField.RIGHT);

			
			// create buttons
			b0 = new JButton("0");
			btnStyles(b0);
			numButtons(b0, numBox);

			b1 = new JButton("1");
			btnStyles(b1);
			numButtons(b1, numBox);
			
			b2 = new JButton("2");
			btnStyles(b2);
			numButtons(b2, numBox);
			
			b3 = new JButton("3");
			btnStyles(b3);
			numButtons(b3, numBox);
			
			b4 = new JButton("4");
			btnStyles(b4);
			numButtons(b4, numBox);
			
			b5 = new JButton("5");
			btnStyles(b5);
			numButtons(b5, numBox);
			
			b6 = new JButton("6");
			btnStyles(b6);
			numButtons(b6, numBox);
			
			b7 = new JButton("7");
			btnStyles(b7);
			numButtons(b7, numBox);
			
			b8 = new JButton("8");
			btnStyles(b8);
			numButtons(b8, numBox);
			
			b9 = new JButton("9");
			btnStyles(b9);
			numButtons(b9, numBox);
			
			beq = new JButton("=");
			beq.setFocusable(false);
			beq.setForeground(fg);
			beq.setBackground(equals);
			beq.setBorder(new LineBorder(border));
			beq.setFont(font2);
			operate(beq, numBox);
			
			bdiv = new JButton("÷");
			btnStyles(bdiv);
			operate(bdiv, numBox);
			
			bsub = new JButton("-");
			btnStyles(bsub);
			operate(bsub, numBox);
			
			bmul = new JButton("x");
			btnStyles(bmul);
			operate(bmul, numBox);
			
			badd = new JButton("+");
			btnStyles(badd);
			operate(badd, numBox);
			
			bdot = new JButton(".");
			btnStyles(bdot);
			numButtons(bdot, numBox);
			
			bdel = new JButton("DEL");
			bdel.setFocusable(false);
			bdel.setForeground(fg);
			bdel.setBackground(delete);
			bdel.setBorder(new LineBorder(border));
			bdel.setFont(font2);
			operate(bdel, numBox);
			
			
			bc = new JButton("C");
			bc.setFocusable(false);
			bc.setForeground(fg);
			bc.setBackground(delete);
			bc.setBorder(new LineBorder(border));
			bc.setFont(font2);
			operate(bc, numBox);
			
			
			
			// add buttons to panel
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbc.fill = GridBagConstraints.BOTH;
			
			// number box
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.gridwidth = 4;
			gbc.gridheight = 1;
			gbc.insets = new Insets(0,0,0,0); // spacing top, left, bottom, right
			cPanel.add(numBox, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.gridwidth = 2;
			gbc.gridheight = 1;
			cPanel.add(bdel, gbc);
			
			gbc.gridx = 2;
			gbc.gridy = 1;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			cPanel.add(bc, gbc);
			
			gbc.gridx = 3;
			gbc.gridy = 1;
			cPanel.add(bdiv, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 2;
			cPanel.add(b1, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 2;
			cPanel.add(b2, gbc);
			
			gbc.gridx = 2;
			gbc.gridy = 2;
			cPanel.add(b3, gbc);
			
			gbc.gridx = 3;
			gbc.gridy = 2;
			cPanel.add(bmul, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 3;
			cPanel.add(b4, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 3;
			cPanel.add(b5, gbc);
			
			gbc.gridx = 2;
			gbc.gridy = 3;
			cPanel.add(b6, gbc);
			
			gbc.gridx = 3;
			gbc.gridy = 3;
			cPanel.add(badd, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 4;
			cPanel.add(b7, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 4;
			cPanel.add(b8, gbc);
			
			gbc.gridx = 2;
			gbc.gridy = 4;
			cPanel.add(b9, gbc);
			
			gbc.gridx = 3;
			gbc.gridy = 4;
			cPanel.add(bsub, gbc);
			
			gbc.gridx = 3;
			gbc.gridy = 4;
			cPanel.add(bdot, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 5;
			cPanel.add(bdot, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 5;
			cPanel.add(b0, gbc);
			
			gbc.gridx = 2;
			gbc.gridy = 5;
			gbc.gridwidth = 2;
			gbc.gridheight = 1;
			cPanel.add(beq, gbc);
			
			
			// Main Application window Layout
			mainContainer.add(cPanel, BorderLayout.CENTER);
		}
		
		
		// Method to style buttons
		public void btnStyles(JButton btn) {
		
			btn.setFocusable(false);
			btn.setForeground(fg);
			btn.setBackground(color);
			btn.setFocusPainted(false);
			btn.setBorder(new LineBorder(border));
			btn.setFont(font2);
		}// end btnStyles()
		
		
		// action Listener for pressing numbers on calculator
		public void numButtons(JButton btn, JTextField numBox) {
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(numBox.getText().equalsIgnoreCase("0") && e.getSource() != bdot) {
						numBox.setText(btn.getText());
					}else if(numBox.getText().equalsIgnoreCase("0") && e.getSource() == bdot) {
						numBox.setText(numBox.getText() + btn.getText());
					}else {
						numBox.setText(numBox.getText() + btn.getText());
					}
					
				}

	        });
		}// end numButtons()
		
		// action listener for pressing operation buttons on calculator
		public void operate(JButton btn, JTextField numBox) {
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e)  {
					String oldValue;
					switch(btn.getText()) 
					{
						case "DEL":
							String oldNumBox = numBox.getText();
							if(numBox.getText().length()==1) {
								numBox.setText("0");
							}else if(numBox.getText().length()>1) {
								numBox.setText( oldNumBox.substring(0, oldNumBox.length() - 1));
							}
							break;
						case "C":
							numBox.setText("0");
							break;
						case "÷":
							oldValue = numBox.getText();
							numBox.setText(oldValue + " / ");
							break;
						case "x":
							oldValue = numBox.getText();
							numBox.setText(oldValue + " * ");
							break;
						case "+":
							oldValue = numBox.getText();
							numBox.setText(oldValue + " + ");
							break;
						case "-":
							oldValue = numBox.getText();
							numBox.setText(oldValue + " - ");
							break;
						case "=":
							numBox.setText(eval(numBox.getText()));
							break;
						default:
							break;
					}
					
				}
				
			});
			
		}// end operate()
		
		
		// method to perform simple mathematical evaluation of string
		public String eval(String expression) {
			double answer = 0;
			ArrayList<String> exp = new ArrayList<>();
			String[] tmp = expression.split(" ");
			for(int i=0; i<tmp.length;i++) exp.add(tmp[i]);

			while(exp.size() > 1) {
				answer = Double.parseDouble(exp.get(0));
				
				if(exp.size()>3) {
					String expres = exp.get(1);
					switch(expres) {
						case "/":
							answer = Double.parseDouble(exp.get(0)) / Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(0,Double.toString(answer));
							break;
						case "*":
							answer = Double.parseDouble(exp.get(0)) * Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(0,Double.toString(answer));
							break;
						case "-":
							answer = Double.parseDouble(exp.get(0)) - Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(0,Double.toString(answer));
							break;
						case "+":
							answer = Double.parseDouble(exp.get(0)) + Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(0,Double.toString(answer));
							break;
						default:
							break;
					}// end switch statement

				}else if(exp.size() == 3) {
					
					String expres = exp.get(1);
					switch(expres) {
						case "/":
							answer = Double.parseDouble(exp.get(0)) / Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(Double.toString(answer));
							break;
						case "*":
							answer = Double.parseDouble(exp.get(0)) * Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(Double.toString(answer));
							break;
						case "+":
							answer = Double.parseDouble(exp.get(0)) + Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(Double.toString(answer));
							break;
						case "-":
							answer = Double.parseDouble(exp.get(0)) - Double.parseDouble(exp.get(2));
							exp.remove(0);
							exp.remove(0);
							exp.remove(0);
							exp.add(Double.toString(answer));
							break;
						default:
							break;
					}// end switch
				}// end else if()
			}// end while()

			return exp.get(0);
		}// end eval()
		
	}// end Calculator Class
