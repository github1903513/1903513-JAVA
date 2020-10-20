import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.text.*;

public class lämpötilamuunnin extends JFrame {
	
	double celsius=0.0;
	double fahrenheit=0.0;
	String celsiusText,fahrenheitText;
	//JLabel CelsiusLabel,FahrenheitLabel;
	//JTextField celsiusField,FahrenheitField;
	//JButton convertButton; 
	DecimalFormat twoDigits=new DecimalFormat("0.00000");
	
	JButton convertButton = new JButton("convert");  
	JLabel CelsiusLabel = new JLabel("Celsius");
	JLabel FahrenheitField = new JLabel("");
	JTextField celsiusField= new JTextField("");
	
	public lämpötilamuunnin() {
		super("Celsius Converter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//JFrame frame = new JFrame("Celsius Converter");
		pack();
		getContentPane().setLayout(new GridLayout(2,2));
		setBounds(0,0,250,100);
		//GridLayout  sijoittelija = new GridLayout(2,2);
		//frame.getContentPane().setLayout(sijoittelija);
		
	
	convertButton.addActionListener(new ConverHandler());
	
	getContentPane().add(CelsiusLabel);
	getContentPane().add(celsiusField);
	getContentPane().add(convertButton);
	getContentPane().add(FahrenheitField);
	
	
	}
	
	 private class ConverHandler implements ActionListener 
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			 
			    try
			    {
			    	 celsius = Double.parseDouble(celsiusField.getText().trim());
					 fahrenheit=celsius*9.0/5.0+32;
					 fahrenheitText=twoDigits.format(fahrenheit);
					 FahrenheitField.setText(fahrenheitText);
			    }
			    catch(Exception ex)
			    { 
			    	JOptionPane.showMessageDialog(null, "Please input Celsius and click the convert button!");
			     }
				 
			 
			
			 }
	 }
	 

public static void main(String[] args)
{
	lämpötilamuunnin tc= new lämpötilamuunnin();
	tc.repaint();
	tc.setVisible(true);
}

}