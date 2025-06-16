 public class Teacher{// Class definition for Teacher
        String name;
        String sub;
        int age;
        String gen;
        String edu;
        
    Teacher(String name,int age,String gen,String edu,String sub){
    // Constructor to initialize teacher details
        this.name=name;
        this.gen=gen;
        this.sub=sub;
        this.age=age;
        this.edu=edu;
        }
     void details(){// Method to display teacher details
            System.out.println("-------T E A C H E R-------");
            System.out.println(name);
            System.out.println(age);
            System.out.println(gen);
            System.out.println(edu);
            System.out.println(sub);
            System.out.println("-------T E A C H E R-------");


        }
}

