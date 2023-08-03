package gpa.application;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haritha
 */


public class Grade {
    double grade;
    int m2;
    
    public double Convert (double m1)
    {
         m2=(int)m1;
        
        switch (m2)
        {
         case 1:
         grade=4;
         break;
                
         case 2:
         grade = 4;
         break;

         case 3:
         grade = 3.7;    
         break; 
         
         case 4:
         grade = 3.3;     
         break;

         case 5:
         grade = 3.0;        
         break;


         case 6:
         grade = 2.7;      
         break;

         case 7:
         grade = 2.3;       
         break;

         case 8:
         grade = 2.0;         
         break;

         case 9:
         grade = 1.7;        
         break;

         case 10:
         grade = 1.3;        
         break;

         case 11:
         grade = 1.0;         
         break;

         case 12:
         grade = 0;        
         break;

            
        }
        return grade;
    }
    
    public String Printtxt(double n1)
    {
       
        String text =Double.toString(n1);
    return text;
    }
}
