
package instagram;

import java.util.Date;


public class Comment_Live extends Live{
    
    private int cm_id;
    private Date cm_date;
    private int user_id;
    private int live_id;
    
    public Comment_Live (){
        
        cm_id=(int)Math.random();
        cm_date=new Date();
        user_id=(int)Math.random();
        live_id=(int)Math.random();
    }
    
}
