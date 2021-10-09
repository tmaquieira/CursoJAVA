package modulo4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

public class PantallaConArray {

	private JFrame frame;
	private JComboBox comboBox;
	private JList listResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConArray window = new PantallaConArray();
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
	public PantallaConArray() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTablasDeMultiplicar = new JLabel("Tablas de multiplicar");
		lblTablasDeMultiplicar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblTablasDeMultiplicar.setBounds(58, 24, 324, 42);
		frame.getContentPane().add(lblTablasDeMultiplicar);
		
		JLabel lblTablaDel = new JLabel("tabla del");
		lblTablaDel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTablaDel.setBounds(170, 105, 84, 20);
		frame.getContentPane().add(lblTablaDel);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		//definir un array de String 
		String strTablas[] = new String[16];
		for(int i =0;i<strTablas.length;i++)
			strTablas[i] = Integer.toString(i);
		
		comboBox.setModel(new DefaultComboBoxModel(strTablas));
		comboBox.setBounds(289, 106, 76, 22);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 165, 150, 150);
		frame.getContentPane().add(scrollPane);
		
		listResult = new JList();
		listResult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		

		scrollPane.setViewportView(listResult);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tabla = comboBox.getSelectedIndex();
				System.out.println("eligio el " + tabla);
				
				String[] values = new String[11];
				for (int i =0;i<11;i++)
					values[i] = tabla + "x" + i + "=" + (i*tabla);
				
						//listResult.add(comp)
				//Este es el codigo recupedo del plug in
				listResult.setModel(new AbstractListModel() {				
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnCalcular.setBounds(274, 219, 101, 29);
		frame.getContentPane().add(btnCalcular);
	}
}
