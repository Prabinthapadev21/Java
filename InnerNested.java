//We can create class inside the class which is known as nester inner class.
class Outer
{
    String name;
    int id;
    String address;

    //Now cresting a new class name inner inside the class outer
    class Inner
    {
        //creating a method name display which only display the message if data matched..
        public void display()
        {
            if(id ==1 && name=="Prabin" && address=="Gaindakot")
            {
                System.out.println("The user data has been matched");
            }
            else
            {
                System.out.println("The user data has not benn matched");
            }
        }
    }
}
public class InnerNested {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.id=1;
        obj.name="Prabin";
        obj.address="Gaindakot";
        Outer.Inner i = obj.new Inner();
        i.display();
    }
}
