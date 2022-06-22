package inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Comedian c = new Comedian();
        Hero h = new Hero();

        c.Act();
        c.Comedy();
        h.Act();
        h.Stunt();
    }
}
class Actor{
    public void Act(){
        System.out.println("Acting...");
    }
}
class Hero extends Actor{
    public void Stunt(){
        System.out.println("Doing Stunts.....");
    }
}
class Comedian extends  Hero{
    public void Comedy(){
        System.out.println("Doing Comedy....");
    }
}
