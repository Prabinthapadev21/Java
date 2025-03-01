//using the multilevel inheritence property...
class Grandfather
{
    void display()
    {
        System.out.println("I am the grandfather");
    }
}
class Father extends Grandfather
{
    void show()
    {
        System.out.println("I am the Father");
    }
}
class Son extends Father
{
    void run()
    {
        System.out.println("I am the Son");
    }
}
public class MultilevelInheritence {
    public static void main(String[] args) {
        Son s = new Son();
        s.display();
        s.show();
        s.run();
    }
}
