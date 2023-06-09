package readwrite;
public class ScoreHealthThread extends Thread {
    private ScoreBoard scoreBoard;
    public ScoreHealthThread(ScoreBoard scoreTable) {
        this.scoreBoard = scoreTable;
    }
    @Override
    public void run() {
        for(int i= 0; i< 10; i++) {
            System.out.println("Match Health: "+ scoreBoard.getMatchHealth());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}