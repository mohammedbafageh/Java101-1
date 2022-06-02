/*import java.util.Scanner;

public class Main {

    //قم بالتعديل على الدالة بحيث تمرر لها متغيرين من نوع عدد حقيقي
    public static float add() {
        // قم بجمع المتغيرين و إعادة النتيجة
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // اطلب من المستخدم أن يدخل العدد الأول
        float x = scan.nextFloat();
        System.out.println("Enter Second number");
        // قم بتخزين المتغير الثاني


        //اطبع نتيجة استدعاء دالة الجمع
    }
}
*/
import java.util.Scanner;

public class Main {


    public static float add1(float y,float z) {
        float x =y+z;
        
     return x;   
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first number:  ");
        
        float num1 = scan.nextFloat();
        
        System.out.println("Enter Second number: ");
        
        float num2 = scan.nextFloat();
        
        System.out.println("the summation for two number is: "+add1(num1,num2));    
        
    }
}
