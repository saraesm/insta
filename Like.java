
package instagram;


public class Like extends Post{
    
    private int post_id;
    private int user_id;
    private int like_count;
    
    public Like(){
        
        post_id=(int)Math.random();
        user_id=(int)Math.random();
        like_count=0;
    }
    
    public void like(boolean flag){
        boolean like=false;
        if(flag==true){
            like_count+=1;
            like=true;
        }
    }
    public int get_like(){
        return like_count;
    }

     public void dislike(boolean flag){
        boolean like=true;
        if(flag==true){
            like_count-=1;
            like=false;
        }
    }
    public int get_dislike(){
        return like_count;
    }
}
