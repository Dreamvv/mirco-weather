package exercise;

public class Exercise5 {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i =0 ; i < 10 ; i++){
                System.out.println(i);
            }
        });
        thread.start();


        new Thread(()-> System.out.println("xxxxx")).start();
    }
}
