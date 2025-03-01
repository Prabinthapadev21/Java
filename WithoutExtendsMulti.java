class GrandMother
{
    void display()
    {
        System.out.println("I am the Grandmother");
    }
}
class Mother
{
    GrandMother g = new GrandMother();
   void show()
   {
       System.out.println("I am the mother");
   }
}
class Daughter
{
    Mother m = new Mother();
    void run()
    {
        System.out.println("I am the Daughter");
    }

}
public class WithoutExtendsMulti {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.run();
        d.m.g.display();
        d.m.show();
    }
}
