package EstacionEspacial.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import EstacionEspacial.repository.MongoDBConnection;


public class RequestNaves  {
    static int peso;
    static String id;


    public static void getNaveById() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;


        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("ID de la nave: ");
        id = ingresoInformacion.nextLine();
        System.out.println("El ID que desa consultar es:" + id + "?");
        System.out.println("1. Si");
        System.out.println("2. No");


        try {
            comprobacion = ingresoInformacion.nextInt();


            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente ID:" + id);
                    MongoCollection collection = MongoDBConnection.getCollection();
                    ObjectId idO = new ObjectId( id	);
                	//Document nave =  collection.find(new Document("_id", idO)).first();

                	/*if (nave != null) {
                	  System.out.println("Nave encontrada: " + nave.toJson());
                	} else {
                	  System.out.println("Nave no encontrada");
                	}*/
                    break;
                case 2:
                    System.out.println("Por favor ingrese el ID nuevamente");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void getNavebyWeight() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;

        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Peso que desea consultar: ");
        peso = ingresoInformacion.nextInt();
        System.out.println("Desea consultar este peso exacto o validar pesos mayores/menores");
        System.out.println("1. Peso exacto");
        System.out.println("2. Peso mayor a");
        System.out.println("3. Peso menor a");


        try {
            comprobacion = ingresoInformacion.nextInt();
            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente peso exacto:" + peso);
                    
                    Document filtro = new Document("peso", peso);
                    MongoCollection collection = MongoDBConnection.getCollection();
                    MongoCursor<Document> cursor = collection.find(new Document("peso", new Document("$eq", peso))).iterator();
                    try {
                        while (cursor.hasNext()) {
                            Document doc = cursor.next();
                            System.out.println("Nave encontrada: " + doc.toJson());
                        }
                    } finally {
                        cursor.close();
                    }
                    

                case 2:
                    System.out.println("Ingrese el peso al cual desa validar que las naves deban tener menor o igual");
;
                    peso = ingresoInformacion.nextInt();
                    System.out.println("las siguientes naves tienen un peso mayor o igual a:" + peso);
                    Bson filter = new Document("peso", new Document("$lt", peso));
                    FindIterable<Document> documents = MongoDBConnection.getCollection().find(filter);
                    for (Document document : documents) {
                        System.out.println(document);
                    }


                    break;
                case 3:
                    System.out.println("Ingrese el peso al cual desa validar que las naves deban tener mayor o igual");
;
                    peso = ingresoInformacion.nextInt();
                    System.out.println("las siguientes naves tienen un peso mayor o igual a:" + peso);
                    Bson filter2 = new Document("peso", new Document("$gt", peso));
                    FindIterable<Document> documents2 = MongoDBConnection.getCollection().find(filter2);
                    for (Document document : documents2) {
                        System.out.println(document);
                    }

                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }
    
    
    public static void getNavebyNacionality() {
        Scanner ingresoInformacion = new Scanner(System.in);


        System.out.println("Por favor ingrese el pais de origen que desa consultar:");
        System.out.println("Nacionalidad:");
        String nacionalidad = ingresoInformacion.next();
        System.out.println("Se realizara la buequeda de navies de nacionalidad :" + nacionalidad);
        
        Document filtro = new Document("nacionalidad", nacionalidad);
        MongoCollection collection = MongoDBConnection.getCollection();
        MongoCursor<Document> cursor = collection.find(new Document("nacionalidad", new Document("$eq", nacionalidad))).iterator();
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println("Nave encontrada: " + doc.toJson());
            }
        } finally {
            cursor.close();
        }
    }


    
    public static void getNavveByKind() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;


        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Tipo de la nave: ");
        System.out.println("1. Nave tripulada");
        System.out.println("2. Nave no tripulada");
        System.out.println("3. Vehiculo lanzadera");

        try {
            comprobacion = ingresoInformacion.nextInt();


            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la verificacion de naves tripuladas");
                    MongoCollection collection = MongoDBConnection.getCollection();
                    MongoCursor<Document> cursor = collection.find(new Document("tipoMision", new Document("$exists", true))).iterator();

                    try {
                        while (cursor.hasNext()) {
                            Document doc = cursor.next();
                            System.out.println("Nave encontrada: " + doc.toJson());
                        }
                    } finally {
                        cursor.close();
                    }
                    break;
                case 2:
                    System.out.println("Se realizara la verificacion de naves no tripuladas");
                    MongoCollection collection1 = MongoDBConnection.getCollection();
                    MongoCursor<Document> cursor1 = collection1.find(new Document("coord", new Document("$exists", true))).iterator();

                    try {
                        while (cursor1.hasNext()) {
                            Document doc = cursor1.next();
                            System.out.println("Nave encontrada: " + doc.toJson());
                        }
                    } finally {
                        cursor1.close();
                    }
                    break;
                case 3:
                    System.out.println("Se realizara la verificacion de vehiculos lanzaderas");                    
                    MongoCollection collection2 = MongoDBConnection.getCollection();
                    MongoCursor<Document> cursor2 = collection2.find(new Document("carga", new Document("$exists", true))).iterator();

                    try {
                        while (cursor2.hasNext()) {
                            Document doc = cursor2.next();
                            System.out.println("Nave encontrada: " + doc.toJson());
                        }
                    } finally {
                        cursor2.close();
                    }
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    
    }
