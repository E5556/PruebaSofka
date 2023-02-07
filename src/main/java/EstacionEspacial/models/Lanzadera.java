package EstacionEspacial.models;

import javax.swing.Spring;

public class Lanzadera extends NaveEspacialM{
	
    private static int capacidadMaxima;
    private static int carga;
    
    
	/**
	 * 
	 */
	public Lanzadera() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param model
	 * @param combustible
	 * @param tamano
	 * @param peso
	 * @param nacionalidad
	 * @param enFuncionamiento
	 */
	public Lanzadera(int id, int model, boolean combustible, int tamano, int peso, String nacionalidad,
			boolean enFuncionamiento, int capacidadMaxima, int carga  ) {
		super(id, model, combustible, tamano, peso, nacionalidad, enFuncionamiento);
		this.capacidadMaxima = capacidadMaxima;
		this.carga = carga;
		
	}
	public static int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public static void setCapacidadMaxima(int capacidadMaxima) {
		Lanzadera.capacidadMaxima = capacidadMaxima;
	}
	public static int getCarga() {
		return carga;
	}
	public static void setCarga(int carga) {
		Lanzadera.carga = carga;
	}  
}
