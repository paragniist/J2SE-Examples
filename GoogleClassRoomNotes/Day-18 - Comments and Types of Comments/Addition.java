//Addition.java
/**
This class is used for adding given numbers
*/

public class Addition {
 /*
    public static void add() {
         int a = 10;
         int b = 20;
         int c = a + b;
         System.out.println(c);
    }
  */ 
    public static void add(int a, int b) {
         int c = a + b;
         //System.out.println(c); 
         System.out.println("The addition result " + c); 
    }

    public static void main(String[] args){
			add();
       add(10, 20);
    }
}