package bin.com.bao.ninetytwo;
class InOrderEqual{
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
    if(c>=b && b>=a && equalOk==true) return true;
    if(c>b && b>a && equalOk==false) return true;
    else return false;
  }
}
