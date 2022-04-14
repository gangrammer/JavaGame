public class Player {
    private int leveNo;
    private int curScore;
    private long startTime;
    private int clapsedTime;

    public Player(int leveNo, int curScore, long startTime, int clapsedTime) {
        this.leveNo = leveNo;
        this.curScore = curScore;
        this.startTime = startTime;
        this.clapsedTime = clapsedTime;
    }

    public Player() {
    }

    public int getLeveNo() {
        return leveNo;
    }

    public void setLeveNo(int leveNo) {
        this.leveNo = leveNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getClapsedTime() {
        return clapsedTime;
    }

    public void setClapsedTime(int clapsedTime) {
        this.clapsedTime = clapsedTime;
    }

    @Override
    public String toString() {
        return "Player{" +
                "leveNo=" + leveNo +
                ", curScore=" + curScore +
                ", startTime=" + startTime +
                ", clapsedTime=" + clapsedTime +
                '}';
    }
    public void getLevel(){

    }
}
