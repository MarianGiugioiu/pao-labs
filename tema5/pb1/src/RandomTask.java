public class RandomTask implements Task{
    String message;
    public RandomTask(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        RandomTask randomTask = new RandomTask("mesaj");
        randomTask.execute();
    }
}
