package Instagram;

public class User extends Instagram{
    
    private int user_id;
    private String username;
    private String password;
    private String email_add;
    private String fullname;
    private String profile_pic_url;
    private int phone_number;
    private String gender;
    private String birthday;
    private int number_of_followings;
    private int number_of_followers;
    private int number_of_posts;
    private String bio;
    
    public User(){
        
        user_id=(int)Math.random();
        username="newuser";
        password="";
        email_add="";
        fullname="";
        profile_pic_url="generalavatar";
        gender="man";
        birthday="";
        number_of_followings=0;
        number_of_followers=0;
        number_of_posts=0;
        bio="";
    }
    public User(int u_id,String u_n,String p_w,String e_a,String f_n,
           String p_p_u,int p_n,String g,String b,int n_fings,int n_fers,int n_p,String bi){
        
        user_id=u_id;
        username=u_n;
        password=p_w;
        email_add=e_a;
        fullname=f_n;
        profile_pic_url=p_p_u;
        phone_number=p_n;
        gender=g;
        birthday=b;
        number_of_followings=n_fings;
        number_of_followers=n_fers;
        number_of_posts=n_p;
        bio=bi;
            
    }
    public void add_user(String a_u){
        username=a_u;
            
    }
     public void edit_user(String e_u){
         username=e_u;
     }
     public void deactivate_user(){
         username="instagrammer";
         
     }
       public void delete_user(){
         username="usernotfound";
         
     }
       public String get_add_user(){
           return username;
       }
       public String get_edit_user(){
           return username;
       }
       public String get_deactivate_user(){
           return username;
       }
       public String get_delete_user(){
           return username;
       }
     
}
