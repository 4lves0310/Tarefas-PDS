package Ativiades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fomlandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textKILO;
	private JTextField textPRECOkg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fomlandia frame = new fomlandia();
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
	public fomlandia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(209, 231, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quant/Kg:");
		lblNewLabel.setBounds(95, 114, 57, 14);
		contentPane.add(lblNewLabel);
		
		textKILO = new JTextField();
		textKILO.setBounds(144, 108, 121, 20);
		contentPane.add(textKILO);
		textKILO.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Preço/Kg:");
		lblNewLabel_1.setBounds(95, 145, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblResultado.setBounds(316, 127, 95, 90);
		contentPane.add(lblResultado);

		
		textPRECOkg = new JTextField();
		textPRECOkg.setBounds(144, 139, 121, 20);
		contentPane.add(textPRECOkg);
		textPRECOkg.setColumns(10);
		
		JLabel lblFomelndia = new JLabel("FOMELÂNDIA");
		lblFomelndia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblFomelndia.setBounds(144, 11, 111, 28);
		contentPane.add(lblFomelndia);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kilo = textKILO.getText();
				double kilok = Double.parseDouble(kilo);
				
				String preco = textPRECOkg.getText();
				double precop = Double.parseDouble(preco);
				
				double c = kilok * precop;
				
				String Resultado = String.valueOf(c);
				Resultado = String.format("%.2f", c);
				lblResultado.setText(Resultado);
			}
		});
		btnNewButton.setBounds(160, 206, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
