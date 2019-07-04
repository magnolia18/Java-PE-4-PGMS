package com.stackroute.pe4code;

import org.junit.*;

import static org.junit.Assert.*;

public class CountTotalOccurancesTest {
    CountTotalOccurances countoccurances;

    @Before
    public void setup(){

        countoccurances = new CountTotalOccurances();
    }

    @After
    public void teardown(){

        countoccurances = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){


    }

    @AfterClass
    public static void teardownAfterClass(){


    }

    @Test
    public void  givenStringandCharShouldOccurencesNumber (){

        //Arrange

        //Act
        int result =  countoccurances.countoccurences("My name is Neelanshi and not available now",'n');

        int expected = 5;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givennullShouldreturnError (){

        //Arrange

        //Act
        int result =  countoccurances.countoccurences(null,'n');

        int expected = 0;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givennumberShouldreturnNUmber (){

        //Arrange

        //Act
        int result =  countoccurances.countoccurences("1",'1');

        int expected = 1;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givenNumbercharShouldreturnError (){

        //Arrange

        //Act
        int result =  countoccurances.countoccurences("My name is neelanshi",'1');

        int expected = 0;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givenNUmberSTringShouldreturnError (){

        //Arrange

        //Act
        int result =  countoccurances.countoccurences("My name is1 neel11ans11hi",'1');

        int expected = 5;

        //Assert
        assertEquals(expected,result);

    }

}