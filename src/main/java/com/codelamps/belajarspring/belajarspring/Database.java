package com.codelamps.belajarspring.belajarspring;

import javax.xml.crypto.Data;

// MEMBUAT KELAS UNTUK MEMBUAT SINGLETON
public class Database {

    // MEMBUAT SEBUAH FIELD STATIC PRIVATE
    private static Database database;

    // MEMBUAT LOGIC UNTUK HANYA MEMBUAT SATU OBJEK
    public static Database getData(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

    // MEMBUAT CONSTRUCTOR PRIVATE
    public Database(){

    }
}
