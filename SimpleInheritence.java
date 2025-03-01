//use of simple inheritance concept in the program..
class Teacher
{
    void teach()
    {
        System.out.println("teaching subjects");
    }
}
class Student extends Teacher
{
    void listen()
    {
        System.out.println("Listening to teacher");
    }
}
public class SimpleInheritence {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.teach();
        s1.listen();
    }
}
