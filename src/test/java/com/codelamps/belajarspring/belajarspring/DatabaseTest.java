package com.codelamps.belajarspring.belajarspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

public class DatabaseTest {

    @Test
    void testDatabase(){

        Database database1 = Database.getData();
        Database database2 = Database.getData();
        Database database3 = Database.getData();


        Assertions.assertSame(database1, database2);

        Assertions.assertEquals(database2, database3);
    }
}
