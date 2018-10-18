package org.yqj.mongo.demo.simple;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/19
 * Email: qijunyao@xiaohongshu.com
 */
public class PojoClientDemo {
    public static void main(String[] args) {
//        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(com.mongodb.MongoClient.getDefaultCodecRegistry(),
//                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
//
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .codecRegistry(pojoCodecRegistry)
//                .build();
//
//        MongoClient mongoClient = MongoClients.create(settings);
//        MongoDatabase mongoDatabase = mongoClient.getDatabase("user");
//        MongoCollection<Person> personMongoCollection = mongoDatabase.getCollection("people", Person.class);
//
//
//        Person ada = new Person(null,"Ada Byron", 20, new Address("St James Square", "London", "W1"));
//        personMongoCollection.insertOne(ada);
//
//        List<Person> people = Lists.newArrayList(
//                new Person(null, "Charles Babbage", 45, new Address("5 Devonshire Street", "London", "W11")),
//                new Person(null, "Alan Turing", 28, new Address("Bletchley Hall", "Bletchley Park", "MK12")),
//                new Person(null, "Timothy Berners-Lee", 61, new Address("Colehill", "Wimborne", null))
//        );
//
//        personMongoCollection.insertMany(people);
    }
}
