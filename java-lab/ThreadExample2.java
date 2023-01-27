class PrimeThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class ThreadExample2
{
    public static void main(String[] args) {
        PrimeThread2 t1 = new PrimeThread2();
        t1.start();
    }
}