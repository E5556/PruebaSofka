package EstacionEspacial;

import EstacionEspacial.repository.MongoDBConnection;
import EstacionEspacial.services.InventarioNaves;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MongoDBConnection.conectar();
		InventarioNaves.iniciarServicio();
	}

}
