package bin.com.bao.ninetytwo;
class MakeBricks{
  public boolean makeBricks(int SMALL, int BIG, int GOAL){
    final int LEAST = GOAL-(BIG*5);
    if(LEAST>SMALL) return false;
    else return true;
  }
}
