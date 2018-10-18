package org.yqj.mongo.demo.simple;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/19
 * Email: qijunyao@xiaohongshu.com
 */
public class SimpleClientDemo {
    public static void main(String[] args) {
//        insertSingle();
//        insertMany();
//        countFind();

    }

    private static void countFind(){
//        MongoCollection<Document> collection = gainCollection("user", "test");
//        System.out.println(collection.countDocuments());

//        Document myDoc = collection.find().first();
//        System.out.println(myDoc.toJson());

//        MongoCursor<Document> cursor = collection.find().iterator();
//        try {
//            while (cursor.hasNext()) {
//                System.out.println(cursor.next().toJson());
//            }
//        } finally {
//            cursor.close();
//        }

//        for (Document cur : collection.find()) {
//            System.out.println(cur.toJson());
//        }

//        Document myDoc = collection.find(Filters.eq("i", 71)).first();
//        System.out.println(myDoc.toJson());
    }

//    private static void insertMany(){
//        List<Document> documentList = Lists.newArrayList();
//        for (int i=0; i<500; i++){
//            documentList.add(new Document("i", i));
//        }
//        gainCollection("user", "test").insertMany(documentList);
//    }
//
//    private static void insertSingle(){
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
//                .append("info", new Document("x", 203).append("y", 102));
//        gainCollection("user", "test").insertOne(doc);
//    }
//
//    private static MongoCollection<Document> gainCollection(String databaseName, String collectionName){
//        MongoClient mongoClient = MongoClients.create();
//        MongoDatabase mongoDatabase = mongoClient.getDatabase("user");
//        return mongoDatabase.getCollection("test");
//    }
}
