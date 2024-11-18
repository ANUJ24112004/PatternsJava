public class Xpattern {

    static void row(int n, int m, int i){
        if(n<0){
            return;
        }
        if( n+m==i)
        System.out.print("*");
        if(n==m){
            System.out.print("*");
        }else System.out.print(" ");
        row(n-1, m, i);
    }

    static void print(int m,int n,int i){
      if(m<0){
        return;
      }
      row(n,m,i);
      System.out.println();
      print(m-1, n, i);
    }
    public static void main(String[] args) {
        print(6, 6, 6);
    }
}
