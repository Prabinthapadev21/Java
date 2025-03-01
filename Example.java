//Without using extends keyword we can simply access the base class by creating its object into the derived class..
class Trainer
{
    void display()
    {
        System.out.println("You should strictly follow my rules");
    }
}
class Workout
{
    Trainer t = new Trainer();
    void show()
    {
        System.out.println("Ok Trainer!");
    }
}
public class Example {
    public static void main(String[] args) {
        Workout w = new Workout();
        w.show();
        w.t.display();
    }
}