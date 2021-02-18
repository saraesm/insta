package Instagram;

import java.util.Date;

public class Post extends User {
    
    private int user_id;
    private int post_id;  
    private Date post_date;
    
   public Post(){
       
       user_id=(int)Math.random();
       post_id=(int)Math.random();
       post_date=new Date();
   }
   
   public void delete_post(){
       post_id=0;
   }
    public void edit(int e){
        post_id=e;
     }
   public int get_delete_post(){
       return post_id;
   } 
   public int get_edit(){
       return post_id;
   }
}
