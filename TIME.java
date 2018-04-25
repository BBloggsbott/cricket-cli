package chronos;
public class TIME{
  public int h;
  public int m;
  public int s;
  public TIME(int h, int m, int s){
    this.h = h;
    this.m = m;
    this.s = s;
  }
  public TIME(String arg){
    String[] args = arg.split(":");
    this.h = Integer.parseInt(args[0]);
    this.m = Integer.parseInt(args[1]);
    this.s = Integer.parseInt(args[2]);
  }
  public String to12(){

  }
}
