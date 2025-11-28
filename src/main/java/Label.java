public class Label {
    private String name;

    public Label(String name) {
        this.name = name;
    }

    public String getlabelName() {
        return name;
    }


 /*
 // IMPORTANTE: Para assertEquals funcionar com objetos
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Label label = (Label) obj;
     return name.equals(label.name);
 }

@Override
public int hashCode() {
    return name.hashCode();
}
*/
}
