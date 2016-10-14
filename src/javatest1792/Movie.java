/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1792;

import java.time.LocalDateTime;

/**
 *
 * @author genki_desk
 */
public class Movie {
private String title="title";
private LocalDateTime publicDay =LocalDateTime.now();

    public void setTitle(String title) {
        if(title == null){
            throw new IllegalArgumentException
                ("nullはセットできません");
        }else{
             this.title = title;
        }
       
    }

    public void setPublicDay(LocalDateTime publicDay) {
        System.out.println("指定"+publicDay);
        System.out.println("現在"+LocalDateTime.now());
        System.out.println();
        if(publicDay == null){
            throw new IllegalArgumentException
                ("nullはセットできません");
        } 
        if(publicDay.isAfter(LocalDateTime.now())){
            throw new IllegalArgumentException("未来の日付はセットできません");
        }
        this.publicDay = publicDay;
        
        
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getPublicDay() {
        return publicDay;
    }

public Movie(){}
public Movie(String title){
    this.title=title;
}

    /**
     * @param args the command line arguments
     */
    
    
}
