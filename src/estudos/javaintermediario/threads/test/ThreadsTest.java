package src.estudos.javaintermediario.threads.test;

class ThreadExemplo extends Thread{
    private char c;

    public ThreadExemplo(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunable implements Runnable{
    private char c;

    public ThreadExampleRunable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

// daemon x user
public class ThreadsTest {
    public static void main(String[] args) {
//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

        Thread t1 = new Thread(new ThreadExampleRunable('A'));
        Thread t2 = new Thread(new ThreadExampleRunable('B'));
        Thread t3 = new Thread(new ThreadExampleRunable('C'));
        Thread t4 = new Thread(new ThreadExampleRunable('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
