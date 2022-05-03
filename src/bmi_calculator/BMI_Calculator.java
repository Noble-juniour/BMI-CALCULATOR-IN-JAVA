/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi_calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author clarekevin
 */
public class BMI_Calculator extends javax.swing.JFrame implements Serializable {
    public static void userinteface() 
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        
        JLabel label1 = new JLabel("Height in Metres:");
        label1.setBounds(20, 20, 100, 40);
        f.add(label1);
        
        JLabel label2 = new JLabel("Weight in pounds:");
        label2.setBounds(20, 60, 100, 40);
        f.add(label2);
        
        JLabel label3 = new JLabel("BMI Calculator:");
        label3.setBounds(20, 90, 100, 40);
        f.add(label3);
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        f.add(txtHeight);
        
        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        f.add(txtWeight);
        
        JButton btn = new JButton("CALCULATE BMI");
        btn.setBounds(20, 130, 300, 40);
       // f.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             double Weight = Double.parseDouble(txtWeight.getText());
             double Height = Double.parseDouble(txtHeight.getText());
             
             double bmi = Weight / Math.pow(Height, 2) * 703;
             
             label3.setText("Result :" + bmi);
             
            }
        });
        f.add(btn);
        f.setSize(400 , 300);
        f.setLayout(null);
        f.setVisible(true);
             
    }
    public  static void main (String args[])
    {
        userinteface();
    }
   
}
