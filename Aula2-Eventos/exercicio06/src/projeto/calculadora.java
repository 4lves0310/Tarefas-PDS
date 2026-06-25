package Ativiades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculaora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNUM1;
	private JTextField textNUM2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculaora frame = new Calculaora();
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
	public Calculaora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 234, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNUM1 = new JTextField();
		textNUM1.setBounds(165, 37, 86, 20);
		contentPane.add(textNUM1);
		textNUM1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N°1:");
		lblNewLabel.setBounds(128, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblRESULTADDO = new JLabel("");
		lblRESULTADDO.setFont(new Font("Arial", Font.BOLD, 18));
		lblRESULTADDO.setBounds(119, 175, 190, 39);
		contentPane.add(lblRESULTADDO);
		
		textNUM2 = new JTextField();
		textNUM2.setBounds(165, 68, 86, 20);
		contentPane.add(textNUM2);
		textNUM2.setColumns(10);
		
		JLabel lblN = new JLabel("N°2:");
		lblN.setBounds(128, 71, 46, 14);
		contentPane.add(lblN);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String num = textNUM1. getText();
				String num2 = textNUM2. getText();
				
				if(textNUM1.getText().isEmpty() || textNUM2.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "ESCREVE ALGUMA COISA AI", "ERRO 66", JOptionPane.ERROR_MESSAGE);
		}
				
				double num1 = Double.parseDouble(num);
				double numdois = Double.parseDouble(num2);
				
				double c = num1+numdois;
				
				String Resultado = String.valueOf(c);
				
				Resultado = String.format("%.2f", c);
				
				lblRESULTADDO.setText(Resultado);
				
					
				
			}
		});
		btnNewButton.setBounds(10, 108, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String num = textNUM1. getText();
				String num2 = textNUM2. getText();
				
				if(textNUM1.getText().isEmpty() || textNUM2.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "ESCREVE ALGUMA COISA AI", "ERRO 66", JOptionPane.ERROR_MESSAGE);
		}
				
				double num1 = Double.parseDouble(num);
				double numdois = Double.parseDouble(num2);
				
				
				double c = num1-numdois;
				
				String Resultado = String.valueOf(c);
				
				Resultado = String.format("%.2f", c);
				
				lblRESULTADDO.setText(Resultado);
			}
		});
		btnSubtrair.setBounds(109, 108, 89, 23);
		contentPane.add(btnSubtrair);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String num = textNUM1. getText();
				String num2 = textNUM2. getText();
				
				if(textNUM1.getText().isEmpty() || textNUM2.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "ESCREVE ALGUMA COISA AI", "ERRO 66", JOptionPane.ERROR_MESSAGE);
		}

				double num1 = Double.parseDouble(num);
				double numdois = Double.parseDouble(num2);
				
				if(numdois == 0) {
					JOptionPane.showMessageDialog(null, "NÃO PODE DIVIDIR POR ZERO ", "ERRO 67", JOptionPane.ERROR_MESSAGE);
				}
					

					double c = num1/numdois;
					
					String Resultado = String.valueOf(c);
					
					Resultado = String.format("%.2f", c);
					
					lblRESULTADDO.setText(Resultado);
				
				
			}
		});
		btnDividir.setBounds(236, 108, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnDividir_1 = new JButton("Multiplicar");
		btnDividir_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String num = textNUM1. getText();
				String num2 = textNUM2. getText();
				
				if(textNUM1.getText().isEmpty() || textNUM2.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "ESCREVE ALGUMA COISA AI", "ERRO 66", JOptionPane.ERROR_MESSAGE);
		}
				
				double num1 = Double.parseDouble(num);
				double numdois = Double.parseDouble(num2);
				
				
				double c = num1*numdois;
				
				String Resultado = String.valueOf(c);
				
				Resultado = String.format("%.2f", c);
				
				lblRESULTADDO.setText(Resultado);
			}
		});
		btnDividir_1.setBounds(335, 108, 89, 23);
		contentPane.add(btnDividir_1);
		
		

	}

}
