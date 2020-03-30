public class CounterOutTask implements Task{
    static int k = 0;

    @Override
    public void execute() {
        k++;
        System.out.println(k);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            CounterOutTask counterOutTask = new CounterOutTask();
            counterOutTask.execute();
        }
    }
}
