/**
 * Created by Administrator on 2016/11/10.
 */
public class Test1 {
    public static void main(String[] args){
        Thread downloadThread = new Thread(new DownloadThread());
        Thread currentTimeThread = new Thread(new CurrentTimeThread());
        currentTimeThread.setDaemon(true);
        downloadThread.start();
        currentTimeThread.start();
    }
}
