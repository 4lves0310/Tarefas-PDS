package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTempFairenheit;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversao frame = new Conversao();
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
	public Conversao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversão");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 101, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Temperatura em Fairenheit:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 71, 152, 26);
		contentPane.add(lblNewLabel_1);
		
		textTempFairenheit = new JTextField();
		textTempFairenheit.setBounds(150, 74, 86, 20);
		contentPane.add(textTempFairenheit);
		textTempFairenheit.setColumns(10);
		
		JButton btnconversaobotao = new JButton("Converter");
		btnconversaobotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textTempFairenheit.getText();
				double tempD = Double.parseDouble(temp);
				double C = (tempD - 32 ) * 5.0/9.0;
				String TempResultado = String.valueOf(C);
				TempResultado = String.format("%.2f", C);
				lblResultado.setText(TempResultado);
			}
		});
		btnconversaobotao.setBounds(150, 147, 101, 23);
		contentPane.add(btnconversaobotao);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblResultado.setBounds(164, 195, 62, 26);
		contentPane.add(lblResultado);
	}
}
