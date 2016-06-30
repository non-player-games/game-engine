package com.npg.engine.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Created by samskim on 6/29/16.
 */
public class MongoDBInstance {

  private static MongoDBInstance mdbSingleton;
  private static MongoClient mongoClient;
  private static MongoDatabase db;


  private static final int port = 27017;
  private static final String dbName = "game-engine";

  // prevent anyone from creating this instance
  private MongoDBInstance(){};

  // return singleton instance
  public static MongoDBInstance getInstance(){
    if (mdbSingleton == null){
      mdbSingleton = new MongoDBInstance();
    }
    return mdbSingleton;
  }

  public MongoDatabase getDb(){
    if (mongoClient == null){
      mongoClient = new MongoClient();

    }
    if (db == null){
      db = mongoClient.getDatabase(dbName);
    }
    return db;
  }


}
