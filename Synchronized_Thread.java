class printtable {
    synchronized public static void table(int n){
        for(int i=0;i<19;i++){
            System.out.println(n*i);
        }
    }
}

class A extends Thread{
    public void run(){
        printtable.table(5);
    }
}

class B extends Thread{
    public void run(){
        printtable.table(3);
    }
}


public class Synchronized_Thread{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();
    }
}
