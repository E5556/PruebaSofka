package EstacionEspacial.services;

import java.awt.FlowLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import EstacionEspacial.front.VentanaCrear;

public class InventarioNaves {

	public static void iniciarServicio() {

		System.out.println("inventario de naves");
		
		
		Scanner seleccionOpciones = new Scanner(System.in);
		boolean out = false;
		int opcion;

		while (!out) {
			System.out.println("Por favor seleccione una de las siguientes opciones:");
			System.out.println("1. Ingreso datos naves");
			System.out.println("2. consulta por peso naves");
			System.out.println("3. consultar por origen de pais de las  naves");
			System.out.println("4. consultar por tipo de naves");
			System.out.println("5. Salir");

			try {
				opcion = seleccionOpciones.nextInt();

				switch (opcion) {
				case 1:
					crearNave();
					break;
				case 2:
					RequestNaves.getNavebyWeight();	
					break;
				case 3:
					RequestNaves.getNavebyNacionality();
					break;
				case 4:
					RequestNaves.getNavveByKind();
					break;
				case 5:
					out = true;
					break;
				default:
					System.out.println("Por favor ingrese una opcion valida.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor ingrese una opcion valida.");
				seleccionOpciones.next();
			}
		}

	}

	public static void crearNave() {
		VentanaCrear crearNaveFront = new VentanaCrear();
		crearNaveFront.setLocationRelativeTo(null);
		crearNaveFront.setSize(300, 150);
		crearNaveFront.setVisible(true);
	}

}
