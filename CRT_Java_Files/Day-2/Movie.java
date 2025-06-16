public class Movie{
    String name;
    float rating;
    String duration;
    Movie(String name, float rating, String duration){
        this.name = name;
        this.rating = rating;
        this.duration = duration;
    }
    void details(){
        System.out.println("------------M O V I E----------");
        System.out.println("Movie Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration);
        System.out.println("Is hit:"+Is_hit());
        System.out.println("----------M O V I E-----------");
            }

        public boolean Is_hit(){
                if(rating>9.5f){
                    return true;
                }
                return false;

                }

            }