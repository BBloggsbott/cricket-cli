package chronos;
public class DATE{
  public int d;
  public int m;
  public int y;
  public DATE(int d, int m, int y){
    this.d = d;
    this.m = m;
    this.y = y;
  }
  public DATE(String arg){
    String[] args = arg.split("-");
    this.d = Integer.parseInt(args[0]);
    this.m = Integer.parseInt(args[1]);
    this.y = Integer.parseInt(args[2]);
  }
  public boolean leapCheck(){
    if(((this.y % 4 == 0) && (this.y % 100 != 0)) || (this.y % 400 == 0)){
      return true;
    }
    return false;
  }
  public boolean validate(){
    if((this.m == 1 || this.m == 3 || this.m == 5 || this.m == 7 || this.m == 8 || this.m == 10 || this.m == 12) && (this.d >= 1 && this.d <= 31)){
      return true;
    }
    else if((this.m == 4 || this.m == 6 || this.m == 9 || this.m == 11) && (this.d >= 1 && this.d <=30)){
      return true;
    }
    else if((this.m == 2) && (this.d >= 1 && this.d <= 28)){
      return true;
    }
    else if(leapCheck() && (this.d >= 1 && this.d <=29)){
      return true;
    }
    else{
      return false;
    }
  }
  public String toString(){
    return new String(this.d + days() + " " + month() + " " + this.y);
  }
  public String iDate(){
    return new String(this.m + "-" + this.d + "-" + this.y);
  }
  public String lDate(){
    return new String(this.d + "-" + this.m + "-" + this.y);
  }
  public String days(){
    if(this.d / 10 != 1){
      switch(this.d % 10){
        case 1: return new String("st");
        case 2: return new String("nd");
        case 3: return new String("rd");
        default:  return new String("th");
      }
    }
    return new String("th");
  }
  public String month(){
    switch(this.m){
      case 1: return new String("January");
      case 2: return new String("February");
      case 3: return new String("March");
      case 4: return new String("April");
      case 5: return new String("May");
      case 6: return new String("June");
      case 7: return new String("July");
      case 8: return new String("August");
      case 9: return new String("September");
      case 10: return new String("October");
      case 11: return new String("November");
      case 12: return new String("December");
    }
    return new String("");
  }
}
