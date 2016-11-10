import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

/**
 * Created by Administrator on 2016/11/10.
 */
public class DownloadPicture {
    public static String upload(){
        final String strUrl = "http://p1.pstatp.com/large/982/7257199701";
        final String fileName = UUID.randomUUID().toString();
        URL url = null;
        InputStream inputStream = null;
        try {
            url = new URL(strUrl);
            inputStream = url.openStream();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outputStream = null;
        File f = new File("d:\\webimg\\");
        f.mkdirs();
        try {
            outputStream = new FileOutputStream("d:\\webimg\\"+fileName);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while((bytesRead = inputStream.read(buffer,0,8192))!=-1){
            outputStream.write(buffer,0,bytesRead);
         }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "文件存放的地址为:"+"d:\\webimg\\"+fileName;
    }
}
