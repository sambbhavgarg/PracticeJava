package bin.q3;
public class CheckEqual extends Q3{
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
    if(c>=b && b>=a && equalOk==true) return true;
    if(c>b && b>a && equalOk==false) return true;
    else return false;
  }
}
