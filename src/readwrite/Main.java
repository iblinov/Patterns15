package readwrite;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

//        final int threadCount = 10;
//        final ExecutorService exService = Executors.newFixedThreadPool(threadCount);
//        final ScoreBoard scoreBoard = new ScoreBoard();
//        exService.execute(new ScoreUpdateThread(scoreBoard));
//        exService.execute(new ScoreHealthThread(scoreBoard));
//        exService.shutdown();
     //   try {

                RWDictionary resource = new RWDictionary();
                new ResThread(resource, false).start();
        new ResThread(resource, false).start();
        new ResThread(resource, true).start();

        new ResThread(resource, false).start();
        new ResThread(resource, false).start();
                new ResThread(resource, true).start();
                new ResThread(resource, false).start();
                new ResThread(resource, false).start();

        new ResThread(resource, false).start();
        new ResThread(resource, false).start();
//                TimeUnit.MILLISECONDS.sleep(1000);
//                System.out.println("endpoint  " +resource);

//        }
//        catch (InterruptedException e){}

    }
}