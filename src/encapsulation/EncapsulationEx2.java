package encapsulation;

// Approach 2 is more encapsulated than Approach One

class N{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationEx2 {
    public static void main(String[] args) {
        N name = new N();
        name.setName("Rohan");
        System.out.println("My name is "+ name.getName());
    }
}
