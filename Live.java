package Instagram;

import java.util.Date;

public class Live extends User{
    
    private int user_id;
    private int live_id;
    private Date live_date;
    
    public Live(){
       
       user_id=(int)Math.random();
       live_id=(int)Math.random();
       live_date=new Date();
   }
    
}
