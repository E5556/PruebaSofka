package EstacionEspacial.services;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;

import EstacionEspacial.interfaces.NoTripuladaImpl;
import EstacionEspacial.models.Lanzadera;
import EstacionEspacial.models.NoTripulada;
import EstacionEspacial.repository.MongoDBConnection;

public class NoTripuladaServices extends NaveEspacialServices implements NoTripuladaImpl {

	/**
	 * 
	 */
	public NoTripuladaServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String Crear(int txtModel,int txtTamano,
			int txtPeso,String txtNacionalidad, String txtstatusATV, int txtcoordenadas) {
		
        NoTripulada noTripulada = new NoTripulada(0,txtModel , true, txtTamano, txtPeso, txtNacionalidad,true, txtstatusATV,  txtcoordenadas ) ;
		
	     Document nuevoDocumento = new Document("_id", new ObjectId())
                 .append("modelo", noTripulada.getModel())
                 .append("combustible", noTripulada.isCombustible())
                 .append("tamano", noTripulada.getTamano())
                 .append("peso", noTripulada.getPeso())
                 .append("nacionalidad", noTripulada.getNacionalidad())
                 .append("enFuncionamiento", noTripulada.isEnFuncionamiento())
                 .append("statusATV", noTripulada.getStatusATV())
                 .append("coord", noTripulada.getCoord());
		
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

	public double ObtenerCoordenadas() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String consultarEstadoATV() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
