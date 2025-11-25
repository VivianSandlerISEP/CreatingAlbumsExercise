public class Person {

    //variables
    private String name;
    private String stageName;

    //constructor
    public Person(String name, String stageName) {
        this.name = name;
        this.stageName = stageName;
    }
    //getter_setter for Name
    public String getName (){
        return this.name;
    }
    //getter_setter for stageName
    public String getStageName (){
        return this.stageName;
    }
}
