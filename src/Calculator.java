import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
	private JTextArea textArea = new JTextArea();
	private JPanel buttonPanel = new JPanel();
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button0 = new JButton("0");
	private JButton buttonPlus = new JButton("+");
	private JButton buttonMinus = new JButton("-");
	private JButton buttonMul = new JButton("*");
	private JButton buttonDiv = new JButton("/");
	private JButton buttonDot = new JButton(".");
	private JButton buttonEqual = new JButton("=");
	private JButton buttonClear = new JButton("C");
	private JButton buttonRmv = new JButton("<-");
	private double arg1;
	private double arg2;
	private char opt;
	public Calculator()
	{
		super("AAA Java Calculator");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1));
        setTextArea();
        buttonPanel.setLayout(new GridLayout(4,4));
        buttonPanel.setBackground(Color.blue);
        setButtonFunctions();
        setButtons();
        add(buttonPanel);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }        
         });    
	}
	public void setTextArea()
    {
        textArea.setBackground(Color.black);
        textArea.setCaretColor(Color.red);
        textArea.setForeground(Color.red);
        textArea.setEditable(false);
        textArea.setFont(textArea.getFont().deriveFont(20f));
        add(textArea);
    }
	public void setButtonFunctions()
	{
		button1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button1.getText());
	         }          
	      });
		button2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button2.getText());
	         }          
	      });
		button3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button3.getText());
	         }          
	      });
		button4.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button4.getText());
	         }          
	      });
		button5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button5.getText());
	         }          
	      });
		button6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button6.getText());
	         }          
	      });
		button7.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button7.getText());
	         }          
	      });
		button8.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button8.getText());
	         }          
	      });
		button9.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button9.getText());
	         }          
	      });
		button0.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(button0.getText());
	         }          
	      });
		buttonDot.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.append(buttonDot.getText());
	         }          
	      });
		buttonClear.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.setText("");
	           arg1 = 0;
	           arg2 = 0;
	         }          
	      });
		buttonRmv.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           textArea.setText(textArea.getText().substring(0,textArea.getText().length()-1));
	         }          
	      });
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				arg1 = arg1 + Double.parseDouble(textArea.getText());
				opt = '+';
				textArea.setText("");
			}
		});
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(arg1 == 0)
					arg1 = Double.parseDouble(textArea.getText());
				else
					arg1 = arg1 - Double.parseDouble(textArea.getText());
				opt = '-';
				textArea.setText("");
			}
		});
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(arg1 == 0)
					arg1 = Double.parseDouble(textArea.getText());
				else
					arg1 = arg1 * Double.parseDouble(textArea.getText());
				opt = '*';
				textArea.setText("");
			}
		});
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(arg1 == 0)
					arg1 = Double.parseDouble(textArea.getText());
				else
					arg1 = arg1 / Double.parseDouble(textArea.getText());
				opt = '/';
				textArea.setText("");
			}
		});
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					arg2 = Double.parseDouble(textArea.getText());
					if(opt == '+')
						textArea.setText(String.valueOf(arg1+arg2));
					else if(opt == '-')
						textArea.setText(String.valueOf(arg1-arg2));
					else if(opt == '*')
						textArea.setText(String.valueOf(arg1*arg2));
					else if(opt == '/')
						textArea.setText(String.valueOf(arg1/arg2));
				}
				catch(Exception a)
				{
					textArea.setText("Error");
				}
			}
		});
	}
	public void setButtons()
	{
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(button0);
		buttonPanel.add(buttonPlus);
		buttonPanel.add(buttonMinus);
		buttonPanel.add(buttonMul);
		buttonPanel.add(buttonDiv);
		buttonPanel.add(buttonDot);
		buttonPanel.add(buttonEqual);
		buttonPanel.add(buttonClear);
		buttonPanel.add(buttonRmv);
	}
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
	}
}