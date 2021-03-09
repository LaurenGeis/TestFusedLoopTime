import java.time.*; 


public class App {
    public static void main(String[] args) throws Exception {
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000; // Loop execution number of times 
        final int FACTOR = 1_000_000; // Loop execution number of times 
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        for(x = 0; x < REPEAT; ++x)
            method1();
        for(x = 0; x < REPEAT; ++x)
            method2();

        now = LocalDateTime.now(); 
        endTime = now.getNano();
        System.out.println("Time for loops executed seperatly: " + ((endTime - startTime) / FACTOR) + " Milliseconds");

        now = LocalDateTime.now();
        startTime = now.getNano();
        for(x = 0; x < REPEAT; ++x)
        {
            method1();
            method2();
        }
        now = LocalDateTime.now(); 
        endTime = now.getNano();
        System.out.println("Time for loops executed in a block: " + 
        ((endTime - startTime) / FACTOR) + " Milliseconds");     
        }
    private static void method2() {
    }    
    private static void method1() {
    }
}
