package EstacionEspacial.models;

import javax.swing.Spring;

public class NoTripulada extends NaveEspacialM{

	
    private static String statusATV;
    private static int coord;
     
	/**
	 * 
	 */
	public NoTripulada() {
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
	public NoTripulada(int id, int model, boolean combustible, int tamano, int peso, String nacionalidad,
			boolean enFuncionamiento, String statusATV, int coord ) {
		super(id, model, combustible, tamano, peso, nacionalidad, enFuncionamiento);
		this.statusATV = statusATV;
		this.coord = coord;
		
	}

	
	public static String getStatusATV() {
		return statusATV;
	}
	public static void setStatusATV(String statusATV) {
		NoTripulada.statusATV = statusATV;
	}
	public static int getCoord() {
		return coord;
	}
	public static void setCoord(int coord) {
		NoTripulada.coord = coord;
	}

    

}



