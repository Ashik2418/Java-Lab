
package com.mycompany.holiday;

public class Holiday {
    private String name;
    private int day;
    private String month;

  
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

  
    public boolean inSameMonth(Holiday other) {
        return this.month.equals(other.month);
    }

    
    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (int i = 0; i < holidays.length; i++) {
            totalDays += holidays[i].day;
        }
        return (double) totalDays / holidays.length;
    }

    public static void main(String[] args) {
        Holiday h1 = new Holiday("New Year", 1, "August");
        Holiday h2 = new Holiday("Bangabandhu", 15, "August");
        Holiday h3 = new Holiday("Seikh Hasina", 5, "January");

        Holiday[] holidays = {h1, h2, h3};
       
        System.out.println("Average Day: " + avgDate(holidays));

        
        System.out.println("Holiday 1 and 2: " + h1.inSameMonth(h2));
        System.out.println("Hodiday 1 and 3 : " + h1.inSameMonth(h3));
    }
}
