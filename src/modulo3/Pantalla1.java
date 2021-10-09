package modulo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Pantalla1 {

	private JFrame frame;
	private JTextField textNota1;
	private JTextField textNota3;
	private JTextField textNota2;
	private JLabel lblResultado;
	private JLabel lblFigura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 window = new Pantalla1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Promedio de Notas");
		lblNewLabel.setBounds(151, 11, 152, 24);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		lblNewLabel_1.setBounds(44, 62, 49, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nota 2");
		lblNewLabel_1_1.setBounds(44, 93, 49, 21);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nota 3");
		lblNewLabel_1_2.setBounds(44, 124, 49, 21);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textNota1 = new JTextField();
		textNota1.setBounds(129, 64, 56, 20);
		frame.getContentPane().add(textNota1);
		textNota1.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(129, 126, 56, 20);
		textNota3.setColumns(10);
		frame.getContentPane().add(textNota3);
		
		textNota2 = new JTextField();
		textNota2.setBounds(129, 95, 56, 20);
		textNota2.setColumns(10);
		frame.getContentPane().add(textNota2);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setBounds(241, 197, 127, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float nota1= Float.parseFloat(textNota1.getText());
				float nota2= Float.parseFloat(textNota2.getText());
				float nota3= Float.parseFloat(textNota3.getText());
				float promedio=(nota1+nota2+nota3)/3;
				lblResultado.setText(Float.toString(promedio));
				if(promedio>=7) {
					lblResultado.setBackground(Color.GREEN);
					lblFigura.setIcon(new ImageIcon(Pantalla1.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
				}else {
					lblResultado.setBackground(Color.RED);
					lblFigura.setIcon(new ImageIcon(Pantalla1.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
				}				
		}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Promedio:");
		lblNewLabel_2.setBounds(241, 63, 62, 20);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.getContentPane().add(lblNewLabel_2);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(241, 93, 71, 21);
		lblResultado.setOpaque(true);
		lblResultado.setBackground(Color.PINK);
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblResultado);
		
		lblFigura = new JLabel("");
		lblFigura.setBounds(323, 80, 88, 47);
		frame.getContentPane().add(lblFigura);
		
	}
}
