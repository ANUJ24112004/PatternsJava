public class SquarePattern {
    static void row(int n){
        if(n<=0){
            return;
        }
        System.out.print("* ");
        row(n-1);
       }

    static void rowspace(int i){
        if(i<=0){
            return;
        }
        System.out.print(" ");
        rowspace(i-1);
       }
    static void print(int n, int m){
        if(m<=0){
            return;
        }
        rowspace(i);
        row(n);
       System.out.println();
       print(n, m-1,i-1);
    }
    // public static void main(String[] args) {
        
    // }
   
}
