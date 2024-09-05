package ex_4;
class Counter {
    private static int objectCount = 0;

  
    public Counter() {
    
        objectCount++;
    }

   
    public static void showCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

public class counterss {
    public static void main(String[] args) {
    
        Counter counterr1 = new Counter();
        Counter counterr2 = new Counter();
        Counter counterr3 = new Counter();

   
        Counter.showCount(); 
    }
}
