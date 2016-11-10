import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/11/10.
 */
public class CurrentTimeThread implements Runnable {

    public void run() {
        long startTime = System.currentTimeMillis();
        while (true) {
            long currentTime = System.currentTimeMillis();
            System.out.println("下载用时为："+(currentTime - startTime)+"毫秒");
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
