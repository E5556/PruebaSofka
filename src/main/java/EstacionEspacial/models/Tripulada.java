package EstacionEspacial.models;

import javax.swing.Spring;

public class Tripulada  extends NaveEspacialM {
	
	private int capacidadTripulantes;
	private String tipoMision;
	private int numeroTripulantes;
	
	
	/**
	 * 
	 */
	public Tripulada() {
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
	public Tripulada(int id, int model, boolean combustible, int tamano, int peso, String nacionalidad,
			boolean enFuncionamiento, int capacidadTripulantes,  String tipoMision, int numeroTripulantes
			) {
		super(id, model, combustible, tamano, peso, nacionalidad, enFuncionamiento);
		this.capacidadTripulantes =capacidadTripulantes;
		this.tipoMision = tipoMision;
		this.numeroTripulantes = numeroTripulantes;
		// TODO Auto-generated constructor stub
	}
	public int getCapacidadTripulantes() {
		return capacidadTripulantes;
	}
	public void setCapacidadTripulantes(int capacidadTripulantes) {
		this.capacidadTripulantes = capacidadTripulantes;
	}
	public String getTipoMision() {
		return tipoMision;
	}
	public void setTipoMision(String tipoMision) {
		this.tipoMision = tipoMision;
	}
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}
	

}
