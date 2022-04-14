import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class text {
    public static void main(String[] args) {
        String strings[] = {"!", "@", "#", "%", "<", ">", "*"};
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 7; i++) {
            int shuijishu = random.nextInt(6);
            System.out.print(strings[shuijishu]);
            stringBuffer.append(strings[shuijishu]);

        }
        System.out.println(stringBuffer);
    }
    }
