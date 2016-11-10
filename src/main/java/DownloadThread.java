/**
 * Created by Administrator on 2016/11/10.
 */
public class DownloadThread implements Runnable {

    public void run() {
        System.out.println("开始下载");
        System.out.println(DownloadPicture.upload());
        System.out.println("下载结束");
        Thread.yield();
    }
}
