package EstacionEspacial.front;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import EstacionEspacial.services.LanzaderaServices;
import EstacionEspacial.services.NoTripuladaServices;

public class VentanaCrearNotripulado extends JFrame {
	private JLabel lblModel, lblCombustible, lblTamano, lblPeso, lblstatusATV, lblcoordenadas, lblNacionalidad;
private JTextField txtModel, txtCombustible, txtTamano, txtPeso, txtstatusATV, txtNacionalidad,
	txtcoordenadas;
private JButton boton1;

public VentanaCrearNotripulado() {
super("Crear no tripulado");
setLayout(new GridLayout(7, 2));
lblModel = new JLabel("Modelo: ");
txtModel = new JTextField(10);
lblTamano = new JLabel("Tamaño: ");
txtTamano = new JTextField(10);
lblPeso = new JLabel("Peso: ");
txtPeso = new JTextField(10);
lblstatusATV = new JLabel("statusATV: ");
txtstatusATV = new JTextField(10);
lblNacionalidad = new JLabel("nacionalidad: ");
txtNacionalidad = new JTextField(10);
lblcoordenadas = new JLabel("coordenadas: ");
txtcoordenadas = new JTextField(10);

boton1 = new JButton("crear Nave");
add(lblModel);
add(txtModel);
add(lblTamano);
add(txtTamano);
add(lblPeso);
add(txtPeso);
add(lblstatusATV);
add(txtstatusATV);
add(lblcoordenadas);
add(txtcoordenadas);
add(lblNacionalidad);
add(txtNacionalidad);
add(boton1);
ManejadorVentanaCrearNotripulado manejador = new ManejadorVentanaCrearNotripulado();
txtTamano.addActionListener(manejador);
txtPeso.addActionListener(manejador);
txtstatusATV.addActionListener(manejador);
txtcoordenadas.addActionListener(manejador);
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

txtcoordenadas.addKeyListener(new KeyListener() {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		try {
			int valor = Integer.parseInt(txtcoordenadas.getText());
		} catch (NumberFormatException e) {
			txtcoordenadas.setText("");
			return;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtcoordenadas.getText());
		} catch (NumberFormatException e) {
			txtcoordenadas.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtcoordenadas.getText());
		} catch (NumberFormatException e) {
			txtcoordenadas.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

});



}

private class ManejadorVentanaCrearNotripulado implements ActionListener {

@Override
public void actionPerformed(ActionEvent arg0) {
	Object fuente = arg0.getSource();
	System.out.println("hola");
	if (fuente == boton1) {

		if (txtModel.getText().length() > 0 && txtTamano.getText().length() > 0
				&& txtPeso.getText().length() > 0 && txtstatusATV.getText().length() > 0
				&& txtcoordenadas.getText().length() > 0 && txtNacionalidad.getText().length() > 0 ) {
			JOptionPane.showMessageDialog(VentanaCrearNotripulado.this, String.format("Creando "));
			NoTripuladaServices noTripuladaServices = new NoTripuladaServices();

			noTripuladaServices.Crear(Integer.valueOf(txtModel.getText()), Integer.valueOf(txtTamano.getText()),
					Integer.valueOf(txtPeso.getText()), txtNacionalidad.getText(), txtstatusATV.getText(), Integer.valueOf(txtcoordenadas.getText()));
		} else
			JOptionPane.showMessageDialog(VentanaCrearNotripulado.this,
					String.format("por favor rellene todos los campos "));

	}

}

}
}