import java.util.*;

class GCD{
  public int gcdOfNum(int n, int m){  
    while(m!=n){
      if(m>n)
        m = m-n;
      else
        n = n-m;
    }
    return n;
  }
}
class Test{
  public static void main(String[] args){
    GCD g= new GCD();
    System.out.println(g.gcdOfNum(56,35));‎
  }
}