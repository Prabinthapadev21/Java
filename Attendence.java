public class Attendence {
    public static void main(String[] args)
    {
        boolean IsHwCompleted = false;
        boolean IsPermission = true;
        //If the hw is completed the student can attend class or he/she should have the permission
        if(IsPermission || IsHwCompleted)
        {
            System.out.println("Student can attend the class");

        }
        else
        {
            System.out.println("Student cannot attend the class");
        }
    }
}
