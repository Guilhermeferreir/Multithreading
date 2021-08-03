package multithreads;


public class Synchronized {
    
    static int i = 0;
    
    public static void main(String[] args) {
        
        MyRunnable Runnable = new MyRunnable();
        
        Thread t0 = new Thread(Runnable);
        Thread t1 = new Thread(Runnable);
        Thread t2 = new Thread(Runnable);
        Thread t3 = new Thread(Runnable);
        Thread t4 = new Thread(Runnable);
        Thread t5 = new Thread(Runnable);
        
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
    
    public static class MyRunnable implements Runnable{

        @Override
        //public synchronized  void run()
        public void run() {
         int j;
         
         synchronized(this){
             i++;
             j = i * 2;
         }
         
         double JElevadoA100 = Math.pow(j, 100);
         double sqrt = Math.sqrt(JElevadoA100);
            System.out.println(sqrt);
        }
        
    }
    
}
