import java.text.MessageFormat;

public class PrettyPrinting {
    public static void main(String[] args) {
        // => search : placeholder in java 

        // for decimal value : it internally roundup
        float n = 76.4567f;
        System.out.printf("Formated number: %.2f \n", n);

        System.out.printf("Pie: %.3f \n", Math.PI);

        System.out.printf("Hello my name is %s and i am %s \n", "kunal", "cool");

        
        // MessageFormat Placeholders 
        String intro = "Hey {0} you get {1} marks in your exams";
        String msg = MessageFormat.format(intro, "bob", 20);
        System.out.println(msg);
    }

}
