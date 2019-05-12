class StaticWonders{
    
    //static int x=100;  
    
    public static void main(String[] args){  
    A t1 = new A();
    A t2 = new A();
    
    t1.x++;
    t2.x+=5;
    
    t1.y++;
    t2.y+=5;
    
    System.out.println(t1.x+" "+t2.x); 
    System.out.println(t1.y+" "+t2.y); 

    }
}
 class A{
    int x=100;
    static int y = 100;
    // System.out.println(x);
 }
