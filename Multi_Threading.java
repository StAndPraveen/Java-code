import java.util.*;

class fibo extends Thread {
    public void run(){
        int n=1;
        for(int i=1;i<=20;i++){
            n = n * i;
            System.out.println("---------"+n);
        }
         n=1;
        for(int i=1;i<=20;i++){
            n = n * i;
            System.out.println("---------"+n);
        }
        
    }
}
class table extends Thread {
    public void run(){
        int n = 453135;
        for(int i=0;i<20;i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}

public class Multi_Threading {
    public static void main(String args[]){

        fibo f = new fibo();
        table t = new table();
        int k = f.getPriority();
        f.run();
        System.out.println(k);
        t.run();
    }
}
