public class RandomOutTask implements Task {
    int random;
    public RandomOutTask(){
        this.random = (int) (Math.random() * 10);
    }

    @Override
    public void execute() {
        System.out.println(this.random);
    }

    public static void main(String[] args) {
        RandomOutTask randomOutTask = new RandomOutTask();
        randomOutTask.execute();
    }
}
