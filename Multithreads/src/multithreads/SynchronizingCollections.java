package multithreads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SynchronizingCollections {
    
    static List<String> listaRedes = new ArrayList<>();
    static List<String> listaEsportes = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException{
        
        // Sincronizando as listas
        listaRedes = Collections.synchronizedList(listaRedes);
        listaEsportes = Collections.synchronizedList(listaEsportes);
         
        MyRunnable runnable = new MyRunnable();
        
        // Criando e executando as thread
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        
        t0.start();
        t1.start();
        t2.start();
        
        Thread.sleep(1000);
        System.out.println(listaRedes);
        System.out.println(listaEsportes);
             
    }
    
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            
        listaRedes.add("Github - Guilhermeferreir");
        listaRedes.add("Instagram - gui_ferreskt");
        listaRedes.add("Linkedln - Guilherme Ferreira");
            
        listaEsportes.add("Skate");
        listaEsportes.add("Surf");
        listaEsportes.add("Natação");
            
        String name = Thread.currentThread().getName();
        System.out.println(name + " adicionada ");
            
            
        }
        
    }
    
}
