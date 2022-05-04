package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class FrameTiempo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTiempo frame = new FrameTiempo();
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
	public FrameTiempo() {
		setTitle("Tiempo Participante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 221);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hora:");
		lblNewLabel.setBounds(10, 11, 36, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Minutos:");
		lblNewLabel_1.setBounds(10, 43, 44, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Segundos:");
		lblNewLabel_1_1.setBounds(10, 75, 54, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Centesimas:");
		lblNewLabel_1_2.setBounds(10, 107, 44, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(154, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		JSpinner spinnerhora = new JSpinner();
		spinnerhora.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerhora.setBounds(63, 14, 44, 20);
		contentPane.add(spinnerhora);
		
		JSpinner spinnerminutos = new JSpinner();
		spinnerminutos.setModel(new SpinnerNumberModel(0, 0, 60, 1));
		spinnerminutos.setBounds(64, 46, 44, 20);
		contentPane.add(spinnerminutos);
		
		JSpinner spinnersegundos = new JSpinner();
		spinnersegundos.setModel(new SpinnerNumberModel(0, 0, 60, 1));
		spinnersegundos.setBounds(63, 78, 44, 20);
		contentPane.add(spinnersegundos);
		
		JSpinner spinnercentesimas = new JSpinner();
		spinnercentesimas.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnercentesimas.setBounds(63, 112, 44, 20);
		contentPane.add(spinnercentesimas);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(20, 148, 89, 23);
		contentPane.add(btnCancelar);
	}
}
