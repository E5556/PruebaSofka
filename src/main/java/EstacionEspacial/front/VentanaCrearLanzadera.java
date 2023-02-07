package EstacionEspacial.front;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import EstacionEspacial.services.LanzaderaServices;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaCrearLanzadera extends JFrame {
	private JLabel lblModel, lblCombustible, lblTamano, lblPeso, lblNacionalidad, lblFuncionamiento, lblCapacidadMaxima,
			lblCarga;
	private JTextField txtModel, txtCombustible, txtTamano, txtPeso, txtNacionalidad, txtFuncionamiento,
			txtCapacidadMaxima, txtCarga;
	private JButton boton1;

	public VentanaCrearLanzadera() {
		super("Crear Lanzadera");
		setLayout(new GridLayout(8, 2));
		lblModel = new JLabel("Modelo: ");
		txtModel = new JTextField(10);
		lblTamano = new JLabel("Tamaño: ");
		txtTamano = new JTextField(10);
		lblPeso = new JLabel("Peso: ");
		txtPeso = new JTextField(10);
		lblNacionalidad = new JLabel("Nacionalidad: ");
		txtNacionalidad = new JTextField(10);
		lblFuncionamiento = new JLabel("Funcionamiento: ");
		txtFuncionamiento = new JTextField(10);
		lblCapacidadMaxima = new JLabel("Capacidad Máxima: ");
		txtCapacidadMaxima = new JTextField(10);
		lblCarga = new JLabel("Carga: ");
		txtCarga = new JTextField(10);
		boton1 = new JButton("crear Nave");
		add(lblModel);
		add(txtModel);
		add(lblTamano);
		add(txtTamano);
		add(lblPeso);
		add(txtPeso);
		add(lblNacionalidad);
		add(txtNacionalidad);
		add(lblFuncionamiento);
		add(txtFuncionamiento);
		add(lblCapacidadMaxima);
		add(txtCapacidadMaxima);
		add(lblCarga);
		add(txtCarga);
		add(boton1);
		ManejadorVentanaCrearLanzadera manejador = new ManejadorVentanaCrearLanzadera();
		txtTamano.addActionListener(manejador);
		txtPeso.addActionListener(manejador);
		txtNacionalidad.addActionListener(manejador);
		txtFuncionamiento.addActionListener(manejador);
		txtCapacidadMaxima.addActionListener(manejador);
		txtCarga.addActionListener(manejador);
		boton1.addActionListener(manejador);

		txtModel.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int valor = Integer.parseInt(txtModel.getText());
				} catch (NumberFormatException e) {
					txtModel.setText("");
					return;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtModel.getText());
				} catch (NumberFormatException e) {
					txtModel.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtModel.getText());
				} catch (NumberFormatException e) {
					txtModel.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

		});

		txtTamano.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int valor = Integer.parseInt(txtTamano.getText());
				} catch (NumberFormatException e) {
					txtTamano.setText("");
					return;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtTamano.getText());
				} catch (NumberFormatException e) {
					txtTamano.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtTamano.getText());
				} catch (NumberFormatException e) {
					txtTamano.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

		});
		txtPeso.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int valor = Integer.parseInt(txtPeso.getText());
				} catch (NumberFormatException e) {
					txtPeso.setText("");
					return;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtPeso.getText());
				} catch (NumberFormatException e) {
					txtPeso.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtPeso.getText());
				} catch (NumberFormatException e) {
					txtPeso.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

		});

		txtCapacidadMaxima.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int valor = Integer.parseInt(txtCapacidadMaxima.getText());
				} catch (NumberFormatException e) {
					txtCapacidadMaxima.setText("");
					return;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtCapacidadMaxima.getText());
				} catch (NumberFormatException e) {
					txtCapacidadMaxima.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtCapacidadMaxima.getText());
				} catch (NumberFormatException e) {
					txtCapacidadMaxima.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

		});

		txtCarga.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int valor = Integer.parseInt(txtCarga.getText());
				} catch (NumberFormatException e) {
					txtCarga.setText("");
					return;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtCarga.getText());
				} catch (NumberFormatException e) {
					txtCarga.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					int valor = Integer.parseInt(txtCarga.getText());
				} catch (NumberFormatException e) {
					txtCarga.setText("");
					return;
				}
				// TODO Auto-generated method stub

			}

		});

	}

	public class ManejadorVentanaCrearLanzadera implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Object fuente = arg0.getSource();
			System.out.println("hola");
			if (fuente == boton1) {

				if (txtModel.getText().length() > 0 && txtTamano.getText().length() > 0
						&& txtPeso.getText().length() > 0 && txtNacionalidad.getText().length() > 0
						&& txtFuncionamiento.getText().length() > 0 && txtCapacidadMaxima.getText().length() > 0
						&& txtCarga.getText().length() > 0) {
					JOptionPane.showMessageDialog(VentanaCrearLanzadera.this, String.format("Creando "));
					LanzaderaServices lanzaderaS = new LanzaderaServices();

					lanzaderaS.Crear(Integer.valueOf(txtModel.getText()), Integer.valueOf(txtTamano.getText()),
							Integer.valueOf(txtPeso.getText()), txtNacionalidad.getText(), txtFuncionamiento.getText(),
							Integer.valueOf(txtCapacidadMaxima.getText()), Integer.valueOf(txtCarga.getText()));
				} else
					JOptionPane.showMessageDialog(VentanaCrearLanzadera.this,
							String.format("por favor rellene todos los campos "));

			}

		}

	}
}
