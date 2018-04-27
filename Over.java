package cricket.base;
import java.util.Scanner;
public class Over{
  public final int LEGAL = 6;
  public int BOWLED;
  public ArrayList<int> runs;
  public ArrayList<double> kilometerPH;
  public ArrayList<double> milePH;
  public int extras;
  public int overNumber;
  public Over(){

  }
  public Over(int ovNo, ArrayList<int> inputRuns, ArrayList<double> inputSpeed, int extras){

  }
  public void convertMPH(ArrayList<double> k, ArrayList<double> m){
    // for(double i : m, double j : k){
    //   double temp = (double)j;
    //   temp /= 1.609344;
    //   i = (double)temp;
    // }

  }
}

// 1 mile = 1.609344 kilometer
