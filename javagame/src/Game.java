import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                '}';
    }

    public void gameStart(Player player, Level level) {
        System.out.println("****欢迎进入游戏*********");

        System.out.println("等级从0开始  积分等于4等级升级  最高等级为5及");
        System.out.println("限制时间从10秒 按等级依次增10秒");
        System.out.println("输入y游戏开始  输入n 结束游戏");
        Scanner SC = new Scanner(System.in);
        String zl = SC.next();
        if (zl.equals("y")) {
            System.out.println("游戏开始");
            gameRules(player, level);
        } else {
            System.out.println("退出游戏");
        }

    }

    public void gameRules(Player player, Level level) {
        long startTime=0;
        String strings[] = {"!", "@", "#", "%", "<", ">", "*"};
        Random random = new Random();
        /* StringBuffer stringBuffer = new StringBuffer();*/
        while (player.getLeveNo() < 6) {
            StringBuffer stringBuffer = new StringBuffer();
            int no = player.getLeveNo() + 2;
            for (int i = 0; i < no; i++) {
                int shuijishu = random.nextInt(6);
                System.out.print(strings[shuijishu]);
                stringBuffer.append(strings[shuijishu]);
            }
            System.out.println("请输入");

            if (player.getStartTime() == 0) {
                startTime = System.currentTimeMillis();
                player.setStartTime(startTime);
            }
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            long endTime = System.currentTimeMillis();
            long useTime = endTime - startTime;
            player.setClapsedTime((int) useTime / 1000);
            String s = stringBuffer.toString();
            if (player.getClapsedTime() < level.getTimeLimit()) {
                if (next.equals(s)) {
                    player.setCurScore(player.getCurScore() + 2);
                    System.out.println("输入正确  "   + "  你当前的积分  " + player.getCurScore() +
                            "  你的等级  " + player.getLeveNo() + "  已经使用的时间  " + player.getClapsedTime());
                    if (player.getCurScore() == 4) {
                        player.setLeveNo(player.getLeveNo() + 1);
                        player.setCurScore(0);
                        player.setStartTime(0);
                        player.setClapsedTime(0);
                        level.setLeveNO(level.getLeveNO() + 1);
                        level.setTimeLimit(level.getTimeLimit() + 10);
                    }
                } else {
                    System.out.println("输入有错误  退出游戏");
                    return;
                }
            } else {
                System.out.println("时间超过" + level.getTimeLimit() + "游戏退出");
                return;
            }
        }

    }
}


