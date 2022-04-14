public class Level {
    private int leveNO;
    private int strLength;
    private int strTime;
    private int timeLimit=10;
    private  int perScore;

    public Level(int leveNO, int strLength, int strTime, int timeLimit, int perScore) {
        this.leveNO = leveNO;
        this.strLength = strLength;
        this.strTime = strTime;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    public Level() {
    }

    public int getLeveNO() {
        return leveNO;
    }

    public void setLeveNO(int leveNO) {
        this.leveNO = leveNO;
    }

    public int getStrLength() {
        return strLength;
    }

    public void setStrLength(int strLength) {
        this.strLength = strLength;
    }

    public int getStrTime() {
        return strTime;
    }

    public void setStrTime(int strTime) {
        this.strTime = strTime;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }

    @Override
    public String toString() {
        return "Level{" +
                "leveNO=" + leveNO +
                ", strLength=" + strLength +
                ", strTime=" + strTime +
                ", timeLimit=" + timeLimit +
                ", perScore=" + perScore +
                '}';
    }
}
