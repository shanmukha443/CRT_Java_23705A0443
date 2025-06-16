public class Student {
    String name = "sham";
    String roll ="23705A0443";
    String branch ="ece";
    int year =3;
    char section ='d';
    Student( String name, String roll, String branch, int year, char section){
        
        this.name=name;
        this.branch=branch;
        this.year=year;
        this.section=section;
        this.roll=roll;}
    void details(){
        System.out.println("-------S T U D E N T-------");
        System.err.println(name);
        System.err.println(roll);
        System.err.println(branch);
        System.err.println(year);
        System.err.println(section);
         System.out.println("-------S T U D E N T-------");
    }
}








