
    package instagram;

    import java.util.Date;


    public class Story extends User {

        private int user_id;
        private int story_id;
        private Date story_date;
        private String text;

    public Story(){

       user_id=(int)Math.random();
       story_id=(int)Math.random();
       story_date=new Date();
       text="";
       }

    }
