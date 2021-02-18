package instagram;

import java.util.Date;

public class Message extends Follower{
    
    private int user_id;
    private Date date;
    
    public Message(){
        
        user_id=(int)Math.random();
        date=new Date();
    }
  
  
    
}
