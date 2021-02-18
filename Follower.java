package Instagram;

public class Follower extends User {
    
    private int user_id;
    private String username;
    private String fullname;
    private String profile_pic_url;
    private int phone_number;
    private int number_of_followings;
    private int number_of_followers;
    private int number_of_posts;
    private String bio;
    
    public Follower(){
        
        user_id=(int)Math.random()*1000000;
        username="newuser";
        fullname="";
        profile_pic_url="generalavatar";
        number_of_followings=0;
        number_of_followers=0;
        number_of_posts=0;
        bio="";
    }
    public void bio(String b){
        
        bio=b;
 
    }
    public String get_bio(){
        return bio;
    }

}
