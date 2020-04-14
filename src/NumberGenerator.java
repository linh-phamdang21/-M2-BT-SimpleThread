public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name){
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10;i++){
            System.out.println(this.name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println(hashCode());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
