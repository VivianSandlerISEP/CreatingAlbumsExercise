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
    public String getName(){return this.name;}  //ou return just name
    public String getStageName(){return this.stageName;}

    //override for readability output
    public String toString() {
        return stageName + " (" + name + ")";
    }
    public String nameToString(){           ???
        return this.name;
    }
    public String stageNameToString(){
        return this.stageName;
    }
}

