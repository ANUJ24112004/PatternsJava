public class Inverse_triangle {
    static void row(int n){
        if(n<=0){
            return;
        }
        System.out.print("* ");
        row(n-1);
       }

       static void print(int n,int m){
            if(m<=0){
                return;
            }
            row(n);
           System.out.println();
           print(n-1, m-1);
        }
        public static void main(String[] args) {
            print(5, 6);
        }
}
