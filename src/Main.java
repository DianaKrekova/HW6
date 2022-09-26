import ru.mirea.krekova6.MyString;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'1','a','b','3','i'};
        MyString str = new MyString(arr);
        str.printer();
        System.out.println("Кол-во символов: " + str.count());
        str.odd();
        str.invert();
    }
}