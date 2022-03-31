package Questão1;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ValidaCPF extends JPanel {
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Create the panel.
	 */
	public ValidaCPF() {
		setLayout(null);
		
		JButton validaCPF = new JButton("Conferir CPF");
		validaCPF.setBackground(SystemColor.textHighlight);
		validaCPF.setForeground(Color.BLACK);
		validaCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF = txtCPF.getText();
				if(ValidacaoCPF.isCPF(CPF)==true) {
					JOptionPane.showMessageDialog(null, "CPF Válido: " + CPF);
				}
				else
					JOptionPane.showMessageDialog(null, "CPF Inválido");
				
			}
		});
		validaCPF.setBounds(144, 228, 178, 23);
		add(validaCPF);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(56, 81, 73, 23);
		add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(158, 84, 139, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(56, 155, 46, 14);
		add(lblNewLabel_1);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(158, 154, 139, 20);
		add(txtCPF);
		txtCPF.setColumns(10);

	}
}
