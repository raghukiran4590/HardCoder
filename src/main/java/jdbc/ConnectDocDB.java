package jdbc;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

public class ConnectDocDB {
    public static void main(String[] args) {
// Connection parameters
        String username = "SrcTopology";
        String password = "8ZY%23REBX3";
        String host = "adocdb-psehub-01prd51.cnvldoeqeeyl.us-east-1.docdb.amazonaws.com";
        int port = 27017;
        String database = "admin";

// Build the connection string with TLS enabled
        String connectionString = String.format(
                "mongodb://%s:%s@%s:%d/%s?ssl=true&replicaSet=rs0&readPreference=secondaryPreferred&retryWrites=false",
                username, password, host, port, database);

        try {
            //SSL Trust Store
            System.setProperty("javax.net.ssl.trustStore", "/Users/AF35861/Downloads/certificates/keystore.jks");
            System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

// Create a MongoDB client
            MongoClientURI uri = new MongoClientURI(connectionString);
            MongoClient mongoClient = new MongoClient(uri);

// Access a database
            MongoDatabase db = mongoClient.getDatabase(database);
            System.out.println("Successfully connected to DocumentDB!");

//List Collections
            MongoIterable<String> collectionNames = db.listCollectionNames();
            System.out.println(collectionNames);

// Find documents
            ListCollectionsIterable<Document> documents = db.listCollections();
            for (Document d : documents) {
                System.out.println(d.toJson());
            }

// Close the connection
            mongoClient.close();

        } catch (Exception e) {
            System.err.println("Error connecting to DocumentDB: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
