/*
 * Shega Vala
 * Lab 6 
 *
 */
package lab6project;

import java.util.ArrayList;

/**
 *
 * @author shegavala
 */
public class Lab6Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //****************** PART B ************;
     
        Person aPerson = new Person("Alice", 1000);
        
        System.out.println(aPerson);
        
        Student aStudent = new Student("Shega",800,"CS",4.0);
        
        System.out.println(aStudent);
        
        Professor aProffesor= new Professor ("Brandon",800,"CS",60.000);
        
        System.out.println(aProffesor);
        
        
       
        /*− Person:Alice,1000
        − Student:Keisha,900,CS,3.5
        − Student:Felipe,901,English,3.2
        − Professor:Jamika,300,CS,101000
        − Person:Tala,1001
        − Professor:Julio,400,Math,85000
        − Student:Huan,902,CS,3.6
        − Student:Hank,903,Engineering,3.9 − Student:Mike,904,Math,2.8
        − Professor:Azzari,500,CS,100000
        − Professor:Juan,600,CS,980000*/
   
        //********************* PART C ***********
        ArrayList<Person> list=new ArrayList<Person>();
        
        list.add( new Person("Alice", 1000));
        list.add( new Student("Keisha",900,"CS",3.5));
        list.add( new Student("Felipe",901,"English",3.2));
        list.add( new Professor("Jamika",300,"CS",101000));
        list.add( new Person("Tala",1001));
        list.add( new Professor( "Julio", 400,"Math",85000));
        list.add( new Student ( "Huan",902,"CS",3.6));
        list.add( new Student ( "Hank",903,"Engineering",3.9));
        list.add( new Student ("Mike",904,"Math",2.8));
        list.add( new Professor("Azzari",500,"CS",100000));
        list.add( new Professor("Juan",600,"CS",980000));
    
        
            for(Person p: list){
                    System.out.println(p);
                    
                    
                                      
    }
           //In the main() method, write a loop to call this method with each element of the ArrayList and compare their id to 903.
           //If there is a match, print out the object.// 
            
           for (Person newP:list){
           
           if(matchId(newP,903)){
               
               System.out.println(newP);
           
           }            
    }
           
           Person p = new Student("Keisha", 900, "CS", 3.5);////*****Part E*******
           System.out.println(((Student) p).getGpa());
           
           Person e = new Person("Bob", 900);
                if(e instanceof Student) {
                System.out.println(((Student) e).getGpa()); 
                }
           
             for(Person k :list) {
             if(k instanceof Student){
                double gpa =((Student)k).getGpa();
                if(gpa>3.5){
                    System.out.println(k.getName()+" got the scholarship");
                }
                
             }
             
             }
             for(Person r :list ){
                 if(r instanceof Professor){
                     String department =((Professor)r).getDepartment();
                     if(department=="CS")
                System.out.println(((Professor)r).getName());
                
             }
             }
              
}//Main end      
    
    /**
     *
     * @param p
     * @param id
     * @return
     */
    public static boolean matchId(Person p, int id) {// ******** Part D ******* 
        
        if(id ==p.getId()) { 
            return true;
        }
        else return false;
      
     
}
    
    
}//end Class
              


         
   
        
    
    

