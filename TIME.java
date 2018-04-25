package chronos;
public class TIME{
  public int h;
  public int m;
  public int s;
  // public boolean post;
  // public boolean t24;
  public TIME(int h, int m, int s){ //}, boolean post){
    this.h = h;
    this.m = m;
    this.s = s;
    // this.post = post;
    // this.t24 = false;
  }
  public TIME(int h, int m, int s){
    this.h = h;
    this.m = m;
    this.s = s;
    // this.t24 = true;
  }
  public TIME(String arg){  //}, boolean post, boolean t24){
    String[] args = arg.split(":");
    this.h = Integer.parseInt(args[0]);
    this.m = Integer.parseInt(args[1]);
    this.s = Integer.parseInt(args[2]);
    // this.post = post;
    // this.t24 = t24;
  }
  public String to12(){

  }
  public String to24(){

  }
}
