import java.util.Scanner;

class ReadOnly{
    // name string which is Read-Only
    private String name = "abcdef";

    // getter function to Read the name string
    public String getName(){
        return name;
    }
}
class WriteOnly{
    // surname string which is Write-Only.
    private String surname;

    // Setter function to Write new value to the surname string.
    public void setName(String s){
        surname = s;
    }
}
public class QuestionTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creating an object for ReadOnly class
        ReadOnly obj1 = new ReadOnly();

        //Creating an object for WriteOnly class
        WriteOnly obj2 = new WriteOnly();

        System.out.println("==============================================");
        System.out.println("Showing private String (name) from ReadOnly Class : ");
        System.out.println(obj1.getName());
        System.out.println("==============================================");

        System.out.println("Input surname to SET into WriteOnly Class : ");
        String sn = sc.next();
        obj2.setName(sn);
        System.out.println("Surname set successfully");
        System.out.println("==============================================");
    }
}
