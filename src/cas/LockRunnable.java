package cas;

public class LockRunnable implements Runnable {


    @Override
    public void run() {

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " 获取到锁");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 释放锁");
        }
    }


    public static void main(String[] args) throws InterruptedException {


        LockRunnable lockRunnable = new LockRunnable();
        LockRunnable lockRunnable2 = new LockRunnable();

        Thread t1 = new Thread(lockRunnable);
        Thread t2 = new Thread(lockRunnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("执行完毕");
    }


}

