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

import EstacionEspacial.services.TripuladaServices;

public class VentanaCrearTripulada extends JFrame {
	private JLabel lblModel, lblCombustible, lblTamano, lblPeso, lblNacionalidad, lblCapacidadTripulantes, lbltipoMision,
	lblnumeroTripulantes;
private JTextField txtModel, txtCombustible, txtTamano, txtPeso, txtNacionalidad, txtCapacidadTripulantes,
	txttipoMision, txtnumeroTripulantes;
private JButton boton1;

public VentanaCrearTripulada() {
super("Crear Tripulada");
setLayout(new GridLayout(8, 2));
lblModel = new JLabel("Modelo: ");
txtModel = new JTextField(10);
lblTamano = new JLabel("Tamaño: ");
txtTamano = new JTextField(10);
lblPeso = new JLabel("Peso: ");
txtPeso = new JTextField(10);
lblNacionalidad = new JLabel("Nacionalidad: ");
txtNacionalidad = new JTextField(10);
lblCapacidadTripulantes = new JLabel("CapacidadTripulantes: ");
txtCapacidadTripulantes = new JTextField(10);
lbltipoMision = new JLabel("tipo mision: ");
txttipoMision = new JTextField(10);
lblnumeroTripulantes = new JLabel("numeroTripulantes: ");
txtnumeroTripulantes = new JTextField(10);
boton1 = new JButton("crear Nave");
add(lblModel);
add(txtModel);
add(lblTamano);
add(txtTamano);
add(lblPeso);
add(txtPeso);
add(lblNacionalidad);
add(txtNacionalidad);
add(lblCapacidadTripulantes);
add(txtCapacidadTripulantes);
add(lbltipoMision);
add(txttipoMision);
add(lblnumeroTripulantes);
add(txtnumeroTripulantes);
add(boton1);
ManejadorVentanaCrearTripulada manejador = new ManejadorVentanaCrearTripulada();
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

txtCapacidadTripulantes.addKeyListener(new KeyListener() {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		try {
			int valor = Integer.parseInt(txtCapacidadTripulantes.getText());
		} catch (NumberFormatException e) {
			txtCapacidadTripulantes.setText("");
			return;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtCapacidadTripulantes.getText());
		} catch (NumberFormatException e) {
			txtCapacidadTripulantes.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtCapacidadTripulantes.getText());
		} catch (NumberFormatException e) {
			txtCapacidadTripulantes.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

});

txtnumeroTripulantes.addKeyListener(new KeyListener() {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		try {
			int valor = Integer.parseInt(txtnumeroTripulantes.getText());
		} catch (NumberFormatException e) {
			txtnumeroTripulantes.setText("");
			return;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtnumeroTripulantes.getText());
		} catch (NumberFormatException e) {
			txtnumeroTripulantes.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		try {
			int valor = Integer.parseInt(txtnumeroTripulantes.getText());
		} catch (NumberFormatException e) {
			txtnumeroTripulantes.setText("");
			return;
		}
		// TODO Auto-generated method stub

	}

});

}

public class ManejadorVentanaCrearTripulada implements ActionListener {

@Override
public void actionPerformed(ActionEvent arg0) {
	Object fuente = arg0.getSource();
	System.out.println("hola tripulada");
	if (fuente == boton1) {

		if (txtModel.getText().length() > 0 && txtTamano.getText().length() > 0
				&& txtPeso.getText().length() > 0 && txtNacionalidad.getText().length() > 0
				&& txtCapacidadTripulantes.getText().length() > 0 && txttipoMision.getText().length() > 0
				&& txtnumeroTripulantes.getText().length() > 0) {
			JOptionPane.showMessageDialog(VentanaCrearTripulada.this, String.format("Creando "));
			TripuladaServices TripuladaS = new TripuladaServices();
			//int txtModel, int txtTamano,int  txtPeso, String txtNacionalidad, int txtCapacidadTripulantes, String txttipoMision, int txtnumeroTripulantes
			TripuladaS.Crear(Integer.valueOf(txtModel.getText()), Integer.valueOf(txtTamano.getText()),
					Integer.valueOf(txtPeso.getText()), txtNacionalidad.getText(), Integer.valueOf(txtCapacidadTripulantes.getText()),
					txttipoMision.getText(), Integer.valueOf(txtnumeroTripulantes.getText()));
		} else
			JOptionPane.showMessageDialog(VentanaCrearTripulada.this,
					String.format("por favor rellene todos los campos "));

	}

}

}
}