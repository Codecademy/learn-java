import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
   private static JTextField inputBox;

   Calculator(){}
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(200, 200);            
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Calculator calculator = new Calculator();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
       
      inputBox = new JTextField(10);        
      inputBox.setEditable(false);

      JButton button0 = new JButton("0");JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");JButton button3 = new JButton("3");
      JButton button4 = new JButton("4");JButton button5 = new JButton("5");
      JButton button6 = new JButton("6");JButton button7 = new JButton("7");
      JButton button8 = new JButton("8");JButton button9 = new JButton("9");

      JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
      JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("x");
      JButton buttonClear = new JButton("C");JButton buttonDot = new JButton(".");
      JButton buttonEquals = new JButton("=");

      button1.addActionListener(calculator);
      button2.addActionListener(calculator);
      button3.addActionListener(calculator);
      button4.addActionListener(calculator);
      button5.addActionListener(calculator);
      button6.addActionListener(calculator);
      button7.addActionListener(calculator);
      button8.addActionListener(calculator);
      button9.addActionListener(calculator);
      button0.addActionListener(calculator);

      buttonPlus.addActionListener(calculator);buttonMinus.addActionListener(calculator);
      buttonDivide.addActionListener(calculator);buttonMultiply.addActionListener(calculator);
      buttonClear.addActionListener(calculator);buttonDot.addActionListener(calculator);
      buttonEquals.addActionListener(calculator);

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0; gbc.gridy = 0; panel.add(button1, gbc);        
      gbc.gridx = 1; gbc.gridy = 0; panel.add(button2, gbc);
      gbc.gridx = 2; gbc.gridy = 0; panel.add(button3, gbc);
      gbc.gridx = 3; gbc.gridy = 0; panel.add(buttonPlus, gbc);
      gbc.gridx = 0; gbc.gridy = 1; panel.add(button4, gbc);
      gbc.gridx = 1; gbc.gridy = 1; panel.add(button5, gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(button6, gbc);
      gbc.gridx = 3; gbc.gridy = 1; panel.add(buttonMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(button7, gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(button8, gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(button9, gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(buttonDivide, gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(buttonDot, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(button0, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(buttonClear, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(buttonMultiply, gbc);
      gbc.gridwidth = 3;

      gbc.gridx = 0; gbc.gridy = 4; panel.add(inputBox, gbc);        
      gbc.gridx = 3; gbc.gridy = 4; panel.add(buttonEquals, gbc);
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }

   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {                      
         inputBox.setText("");
      }else if (command.charAt(0) == '=') {                    
         inputBox.setText(evaluate(inputBox.getText()));
      }else {                                
         inputBox.setText(inputBox.getText() + command);
      }
   }
 
   public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      else if (operator.equals("-"))
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      else if (operator.equals("/"))
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      else
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
      return operand1 + operator + operand2 + "=" +result;
   }    
} 