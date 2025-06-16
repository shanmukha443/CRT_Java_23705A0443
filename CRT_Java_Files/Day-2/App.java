public class App {
    
    String name;
    String version;
    String category;
    int downloads;
    String[] reviews;
    String developer;

    public App(String name, String version, String category, int downloads, String reviews, String developer) {
        this.name = name;
        this.version = version;
        this.category = category;
        this.downloads = downloads;
        this.reviews = reviews.split(","); 
        this.developer = developer;
    }
    public void info() {
        System.out.println("App Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Category: " + category);
        System.out.println("Downloads: " + downloads);
        System.out.println("Reviews: " + reviews);
        System.out.println("Developer: " + developer);
    }

    public void popularity() {
        if (downloads > 1000000) {
            System.out.println(name + " is a popular app.");
        } else {
            System.out.println(name + " is not a popular app.");
        }
    }

    public void reviews(){
        System.out.println("Reviews for " + name + ":");
        for (String review : reviews) {
            System.out.println("- " + review.trim());
        }
    }

    public void getSummary() {
        System.out.println("App Summary:");
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Category: " + category);
        System.out.println("Downloads: " + downloads);
        System.out.println("Developer: " + developer);
    }
} 