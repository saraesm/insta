
package instagram;

import java.io.File;
import java.util.Date;


public class Comment extends Post{
   
    private int cm_id;
    private Date cm_date;
    private int user_id;
    private int post_id;
    
    public Comment(){
        
        cm_id=(int)Math.random();
        cm_date=new Date();
        user_id=(int)Math.random();
        post_id=(int)Math.random();
        
       
    }
    int like_cm=0;
    
      public void like(boolean flag){
        boolean like=false;
        if(flag==true){
            like_cm+=1;
            like=true;
        }
    }
    public int get_like(){
        return like_cm;
    }
}
