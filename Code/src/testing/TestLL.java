package testing;

//A simple Java program  
//to illustrate the concept of  
//references  
class Rectangle  
{ 
double length; 
double breadth; 
} 

class TestLL 
{ 
 public static void main(String args[]) 
 { 
   
 // r1 is reference variable which contain  
 // the address of Actual Rectangle Object. 
 Rectangle r1 = new Rectangle(); 
     
 // r2 is another reference variable 
 // r2 is initialized with r1 means: 
 // r1 and r2 both are referring same object  
 // thus it does not create duplicate object  
 // nor does it allocate extra memory.
 
 Rectangle r2 = r1; 
 
 r1.length = 45;
 r2.length = 76;
 
  
 System.out.println("Value of R1's Length : " + r1.length); 
 System.out.println("Value of R2's Length : " + r2.length); 

 } 
}
