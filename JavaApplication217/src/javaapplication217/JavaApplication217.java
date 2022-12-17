
package javaapplication217;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication217 {

    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE); 

//        Person person1 = new Person("John Deen", 33, "022/023");
//        Person person2 = new Person("Ben Joahnsen", 23, "023/673");
//        Person person3 = new Person("Adam Miler", 53, "025/653");
//        
//        List<Person> persons = new ArrayList();
//        persons.add(person1);
//        persons.add(person2);
//        persons.add(person3);
        
        Mongo mongo = new Mongo("localhost", 27017);
        
//        DB db = mongo.getDB("test");
//        
//        mongo.dropDatabase("test");
        
        for(String s : mongo.getDatabaseNames()) {
            System.out.println(s);
        }
        
//        for(String s : db.getCollectionNames()) {
//            System.out.println(s);
//        }
        
//        DBCollection collection = db.getCollection("user");
//        
//        collection.drop();
        
//        BasicDBObject document = null;
//        
//        for (Person person : persons) {
//            
//            document = new BasicDBObject();
//            document.put("name", person.getName());
//            document.put("age", person.getAge());
//            document.put("pid", person.getPid());
//            document.put("createDate", new Date());
//            
//            collection.insert(document);
//        }
        
//        DBObject myDoc = collection.findOne();
//        System.out.println(myDoc);
        
        
//        BasicDBObject query = new BasicDBObject("age", new BasicDBObject("$gt", 30).append("$lte", 40));
        
//        DBCursor cursor = collection.find();
//        
//        try {
//            while(cursor.hasNext()) {
//                System.out.println(cursor.next());
//            }
//        }catch(Exception ex) {
//            System.out.println(ex);
//        }finally {
//            cursor.close();
//        }
        
//        DBObject query = new BasicDBObject("name", "John Deen");
//        
//        DBObject update = new BasicDBObject();
//        update.put("$set", new BasicDBObject("pid", "000/000"));
//        
//        WriteResult result = collection.update(query, update);
        
        
    }
}