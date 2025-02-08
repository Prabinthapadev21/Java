import java.util.Scanner;
public class StringConcat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String name = sc.nextLine();
        System.out.println("Enter the second string2:");
        String name2 = sc.nextLine();
        String name3 = name.concat(name2);
        System.out.println("The concatinated string is "+name3);
    }
}
