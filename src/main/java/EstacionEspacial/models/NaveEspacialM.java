package EstacionEspacial.models;

import javax.swing.Spring;

import EstacionEspacial.interfaces.NaveEspacialImpl;

public class NaveEspacialM  {
	
	
	

	private static int id;
    private static int model;
    private static boolean combustible;
    private static int tamano;
    private static int peso;
    private static String nacionalidad;
    private static boolean enFuncionamiento;
    
    
    
    /**
	 * 
	 */
	public NaveEspacialM() {
	
	}
	
    /**
	 * 
	 */
	public NaveEspacialM(int id, int model, boolean combustible , int tamano , int peso, String nacionalidad, boolean enFuncionamiento ) {

		this.id =  id;
		this.model =  model;
		this.combustible =  combustible;
		this.tamano =  tamano;
		this.peso =  peso;
		this.nacionalidad =  nacionalidad;
		this.enFuncionamiento =  enFuncionamiento;
		
		
	}
    
    
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		NaveEspacialM.id = id;
	}
	public static int getModel() {
		return model;
	}
	public static void setModel(int model) {
		NaveEspacialM.model = model;
	}
	public static boolean isCombustible() {
		return combustible;
	}
	public static void setCombustible(boolean combustible) {
		NaveEspacialM.combustible = combustible;
	}
	public static int getTamano() {
		return tamano;
	}
	public static void setTamano(int tamano) {
		NaveEspacialM.tamano = tamano;
	}
	public static int getPeso() {
		return peso;
	}
	public static void setPeso(int peso) {
		NaveEspacialM.peso = peso;
	}
	public static String getNacionalidad() {
		return nacionalidad;
	}
	public static void setNacionalidad(String nacionalidad) {
		NaveEspacialM.nacionalidad = nacionalidad;
	}
	public static boolean isEnFuncionamiento() {
		return enFuncionamiento;
	}
	public static void setEnFuncionamiento(boolean enFuncionamiento) {
		NaveEspacialM.enFuncionamiento = enFuncionamiento;
	}


    
    

}
