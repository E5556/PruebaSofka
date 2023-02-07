package EstacionEspacial.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;

import EstacionEspacial.interfaces.TripuladaImpl;
import EstacionEspacial.models.NoTripulada;
import EstacionEspacial.models.Tripulada;
import EstacionEspacial.repository.MongoDBConnection;


public class TripuladaServices extends NaveEspacialServices implements TripuladaImpl {

	

	/**
	 * 
	 */
	public TripuladaServices() {
		super();
		// TODO Auto-generated constructor stub
	}
/*
 * 
 */
	public String Crear(int txtModel, int txtTamano,int  txtPeso, String txtNacionalidad, int txtCapacidadTripulantes, String txttipoMision, int txtnumeroTripulantes) {
		// TODO Auto-generated method stub
		 Tripulada tripulada = new Tripulada(0,txtModel , true, txtTamano, txtPeso, txtNacionalidad,true,txtCapacidadTripulantes,  txttipoMision,  txtnumeroTripulantes) ;
		 
	     Document nuevoDocumento = new Document("_id", new ObjectId())
                 .append("modelo", tripulada.getModel())
                 .append("combustible", tripulada.isCombustible())
                 .append("tamano", tripulada.getTamano())
                 .append("peso", tripulada.getPeso())
                 .append("nacionalidad", tripulada.getNacionalidad())
                 .append("enFuncionamiento", tripulada.isEnFuncionamiento())
                 .append("capacidadTripulantes", tripulada.getCapacidadTripulantes())
                 .append("numeroTripulantes", tripulada.getNumeroTripulantes())
                 .append("tipoMision", tripulada.getTipoMision());
	     
	     MongoCollection collection = MongoDBConnection.getCollection();
	     
	     collection.insertOne(nuevoDocumento);
		
		return null;
	}

	public String Eliminar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Actualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String asignarMision(String mision) {
		// TODO Auto-generated method stub
		return null;
	}

	public String abordarTipulacion(String nTripulantes) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
