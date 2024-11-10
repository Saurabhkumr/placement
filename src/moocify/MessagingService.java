package moocify;

import java.util.ArrayList;

public class MessagingService {
    private String msg;
    public MessagingService(String msg) throws Exception {
        if(msg.length()>280){
            throw new Exception("Length exceed");
        }
        else this.msg=msg;
    }

}
