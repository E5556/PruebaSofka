package EstacionEspacial.front;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaCrear  extends JFrame {

	  private static final long serialVersionUID = 1L;
	  private JButton boton1;
	  private JButton boton2;
	  private JButton boton3;
	  

	  public  VentanaCrear() {
		super("Seleccionar");
	    setLayout(new FlowLayout());
	    boton1 = new JButton("lanzadera");
	    boton2 = new JButton("tripulado");
	    boton3 = new JButton("no tripulado");
	    add(boton1);
	    add(boton2);
	    add(boton3);
	    ManejadorBoton manejador = new ManejadorBoton();
	    boton1.addActionListener(manejador);
	    boton2.addActionListener(manejador);
	    boton3.addActionListener(manejador);
	    
	  }

	  private class ManejadorBoton implements ActionListener {
	

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("hola");
		    Object fuente = arg0.getSource();
		    if (fuente == boton1) {
		    	VentanaCrearLanzadera crearLanzadera = new VentanaCrearLanzadera();
		    	crearLanzadera.setLocationRelativeTo(null);
		    	crearLanzadera.setSize(500, 400);
		    	crearLanzadera.setVisible(true);
		    	
		    	dispose();
		      // Acción para el botón 1
		    } else if (fuente == boton2) {
		    	VentanaCrearTripulada creartripulado = new VentanaCrearTripulada();
		    	creartripulado.setLocationRelativeTo(null);
		    	creartripulado.setSize(500, 400);
		    	creartripulado.setVisible(true);
		    	
		      // Acción para el botón 2
		    } else if (fuente == boton3) {
		    	VentanaCrearNotripulado crearNoTripulado = new VentanaCrearNotripulado();
		    	crearNoTripulado.setLocationRelativeTo(null);
		    	crearNoTripulado.setSize(500, 400);
		    	crearNoTripulado.setVisible(true);
		    	
		      // Acción para el botón 3
		    }
		}
	  }
	}