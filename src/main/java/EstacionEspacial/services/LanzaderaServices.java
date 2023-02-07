package EstacionEspacial.services;

import javax.swing.Spring;
import org.bson.Document;

import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import EstacionEspacial.interfaces.LanzaderaImpl;
import EstacionEspacial.models.Lanzadera;
import EstacionEspacial.repository.MongoDBConnection;

public class LanzaderaServices extends NaveEspacialServices implements LanzaderaImpl {

	/**
	 * 
	 */
	public LanzaderaServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String Crear(
	           int txtModel,
		    	int txtTamano,
		    	int txtPeso,
		    	String txtNacionalidad,
		    	String txtFuncionamiento,
		    	int txtCapacidadMaxima,
		    	int txtCarga
			) {
		

		Lanzadera lanzadera = new Lanzadera(0,txtModel , true, txtTamano, txtPeso, txtNacionalidad,true, txtCapacidadMaxima,  txtCarga ) ;
		
	     Document nuevoDocumento = new Document("_id", new ObjectId())
                 .append("modelo", lanzadera.getModel())
                 .append("combustible", lanzadera.isCombustible())
                 .append("tamano", lanzadera.getTamano())
                 .append("peso", lanzadera.getPeso())
                 .append("nacionalidad", lanzadera.getNacionalidad())
                 .append("enFuncionamiento", lanzadera.isEnFuncionamiento())
                 .append("capacidadMaxima", lanzadera.getCapacidadMaxima())
                 .append("carga", lanzadera.getCarga());
		
	//     MongoClient mongoClient = MongoDBConnection.getinstance();
	  //   MongoDatabase database = MongoDBConnection.getDB();
	     MongoCollection collection = MongoDBConnection.getCollection();
	     
	     collection.insertOne(nuevoDocumento);
		// TODO Auto-generated method stub
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

	public String cargar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String descargar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String calcularEspacio() {
		// TODO Auto-generated method stub
		return null;
	}

}
