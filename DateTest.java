import chronos.DATE;
import java.util.Scanner;
public class DateTest{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter DATE: ");
    DATE inputDate = new DATE(in.next());
    if(inputDate.validate())System.out.println("DATE: " + inputDate);
    System.out.println(inputDate.iDate());
  }
}
