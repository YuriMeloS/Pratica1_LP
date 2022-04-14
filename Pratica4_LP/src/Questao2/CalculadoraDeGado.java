package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraDeGado extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtQtd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraDeGado frame = new CalculadoraDeGado();
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
	public CalculadoraDeGado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Bovina");
		lblNewLabel.setBounds(159, 29, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor da arroba");
		lblValor.setBounds(21, 76, 98, 20);
		contentPane.add(lblValor);
		
		JLabel lblQtd = new JLabel("Quantidade de Arroba");
		lblQtd.setBounds(21, 147, 134, 14);
		contentPane.add(lblQtd);
		
		txtValor = new JTextField();
		txtValor.setBounds(262, 76, 119, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(262, 144, 119, 20);
		contentPane.add(txtQtd);
		txtQtd.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(txtValor.getText());
				int qtde = Integer.parseInt(txtQtd.getText());
				int calcular = qtde * valor; 
				JOptionPane.showMessageDialog(null, "O valor total é de: "+calcular);
			}
		});
		btnCalcular.setBounds(159, 215, 89, 23);
		contentPane.add(btnCalcular);
	}
}
