// Create a class OnlineExam with a static method startTimer that starts a countdown
// timer for an online exam. Use a static block to initialize default timer settings (e.g., exam
// duration, interval between updates).
public class OnlineExam {
    public static int durationMinutes;
    public static int intervalSeconds;

    static {
        durationMinutes = 1;
        intervalSeconds = 60;
    }

    public static void startTimer() {
        long endTime = System.currentTimeMillis() + (durationMinutes*60_000L);
        
        try {
            while(System.currentTimeMillis() < endTime) {
                long remaining = endTime - System.currentTimeMillis();

                long mins = (remaining / 60_000L);
                long secs = (remaining % 60_000L) / 1000;
                System.out.printf("Time Remaining: %02d:%02d\n", mins, secs);

                Thread.sleep(1000L);
            }
            System.out.println("Time's Up. Exam Ended!!!");
        }catch(InterruptedException e) {
            System.out.println("Timer Interrupted!!!");
        }
    }

    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam();

        exam.startTimer();
    }
}