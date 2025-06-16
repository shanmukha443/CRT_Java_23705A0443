public class Main{
    public static void main(String[] args) {
       App app = new App("MyApp", "1.0", "Utility", 1500000, "Great app, Very useful, Highly recommended", "TechCorp");
       app.info();
       app.popularity();
       app.reviews();
       app.getSummary();
}}
