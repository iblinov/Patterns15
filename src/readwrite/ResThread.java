package readwrite;
import java.util.Random;
public class ResThread extends Thread {
    private RWDictionary resource;
    private boolean writeStatus;
    public ResThread ( RWDictionary rs, boolean status) {
        //super(name);
        resource = rs;
        writeStatus = status;
    }
    public void run() {

            if (writeStatus) {
               // resource.put("something" +new Random().nextInt(200), new Random().nextInt(20));
                resource.put("stuff_1", new Random().nextInt(20));
            } else {
               // resource.allKeys();
                resource.allKeys();
            }

    }
}