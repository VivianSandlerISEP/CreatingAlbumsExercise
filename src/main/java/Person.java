public class Person {

    //variables
    private String name;
    private String stageName;

    //constructor
    public Person(String name, String stageName) {
        this.name = name;
        this.stageName = stageName;
    }

    // Getter methods
    public String getName(){
        return this.name;
    }

    public String getStageName(){
        return this.stageName;
    }
}

