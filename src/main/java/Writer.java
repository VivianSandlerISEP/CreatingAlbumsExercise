//No need to import other classes or create package as project is small

public class Writer {

    private final Person writer;

    public Writer(Person person) {
        this.writer = person;
    }

    public Person getWriter() {
        return writer;
    }
    public String nameToString() {
            return "Writer: " + writer.nameToString();
    }
}
