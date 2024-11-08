// // Part A

public class code4 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            System.out.println(arr[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}


// Part B

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class code4 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}