public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("NG1");
        NumberGenerator numberGenerator2 = new NumberGenerator("NG2");

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(10);
        thread2.setPriority(1);

        thread1.start();
//        try {
//            thread1.join();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        thread2.start();
    }
}
