/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1792;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
/**
 *
 * @author genki_desk
 */
public class MovieTest {
    
    public MovieTest() {
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test public void instantiate(){
        Movie mv = new Movie();
        Movie mv2=new Movie("testTitle");
    }
    @Test public void get(){
        Movie mv = new Movie();
        String title =mv.getTitle();
        LocalDateTime publicDate = mv.getPublicDay();
    }
    @Test public void set(){
        System.out.println("be");
        Movie mv = new Movie();
        mv.setTitle("testTitle");
        LocalDateTime testTime = LocalDateTime.of(2000, 1, 5, 11, 9);
        mv.setPublicDay(testTime);
    }
  /*  @Test public void nullTest(){
        Movie mv =new Movie();
        mv.setPublicDay(null);
        mv.setTitle(null);
    }*/
    @Test public void before(){
        System.out.println("before");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("未来の日付はセットできません");
        Movie mv = new Movie();
        LocalDateTime testTime = LocalDateTime.now();
        testTime=testTime.plusDays(10);
        mv.setPublicDay(testTime);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
}
