package Test;

public class MyThread {
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        mythread1.start();
        new Thread(()-> System.out.println("lambda")).start();

        MyThread2 mt2 = new MyThread2();
        Thread thread = new Thread(mt2,"ssss");
        thread.start();

    }
}

class Mythread1 extends Thread{
    public void run(){
        System.out.println("My");
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}