public class ThreadPrint {
    private volatile static int val = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (val < 100) {
                synchronized (ThreadPrint.class) {
                    if (val % 2 == 0) {
                        System.out.println("打印偶数： " + val++);
                    }
                }
            }
        });
        thread1.setName("偶数线程");

        Thread thread2 = new Thread(() -> {
            while (val < 100) {
                synchronized (ThreadPrint.class) {
                    if (val % 2 == 1) {
                        System.out.println("打印奇数： " + val++);
                    }
                }
            }
        });
        thread2.setName("奇数");
        thread2.start();
        thread1.start();
    }
}
