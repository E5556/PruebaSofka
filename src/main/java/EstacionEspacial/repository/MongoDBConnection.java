package EstacionEspacial.repository;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

	/**
	 * @param mongoClient
	 * @param database
	 */
	public MongoDBConnection() {

	}

	private static MongoClient mongoClient = null;
	private static MongoDatabase database = null;
	private static MongoCollection collection = null;

	public static void conectar() {
		// Crea una conexión a la base de datos
		MongoClient mongoClient = MongoClients
				.create("mongodb+srv://dbUser:232bk28ph860%40%40@cluster0.bbzg4mm.mongodb.net/test");

		// Obtiene una referencia a la base de datos
		MongoDatabase database = mongoClient.getDatabase("test");
		System.out.println(database);

		System.out.println("Conexión exitosa a MongoDB");
		// database.createCollection("NavesEspaciales");
	}

	public static MongoClient getinstance() {
		if (mongoClient == null) {
			mongoClient = MongoClients
					.create("mongodb+srv://dbUser:232bk28ph860%40%40@cluster0.bbzg4mm.mongodb.net/test");
		}
		return mongoClient;
	}

	public static MongoDatabase getDB() {
		if (database == null) {
			MongoDatabase database = mongoClient.getDatabase("test");
		}
		return database;
	}

	public static MongoCollection getCollection() {

		MongoClient mongoClient = MongoClients
				.create("mongodb+srv://dbUser:232bk28ph860%40%40@cluster0.bbzg4mm.mongodb.net/test");

		// Obtiene una referencia a la base de datos
		MongoDatabase database = mongoClient.getDatabase("test");
		System.out.println(database);

		MongoCollection<Document> collection = database.getCollection("NavesEspaciales");

		return collection;
	}
	
	


}
