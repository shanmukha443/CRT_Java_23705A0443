public class Game{
    String title;
    String genre;
    int playcount=0;
    float ratings;
    Game(String title,String genre,float ratings){
        this.ratings=ratings;
        this.title=title;
        this.genre=genre;
    }
    void details(){
        System.out.println("------------G A M E----------");
        System.out.println("Game name:"+title);
        System.out.println("Game genre:"+genre);
        if(genre!="horrer"){
            System.out.println("Family friendly");
        }
        else{
            System.out.println("Not family friendly");
        }
        System.out.println("Number of times played:"+playcount);
        System.out.println("Game name:"+ratings);
        System.out.println("------------G A M E----------");

    }
    void play(){
        System.out.println("<------+-game is running-+---->");
        playcount++;
    }

}