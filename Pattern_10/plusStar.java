public class plusStar {
    static void row(int n,int m, int i){
        if(n<0){
            return;
        }
        if(n==i/2||m==i/2)
        System.out.print("+");
        else System.out.print(" ");
        row(n-1,m,i);
       }
    static void print(int n,int m, int i){
        if(m<=0){
            return;
        }
       row(n,m,i);
       System.out.println();
       print(n, m-1,i);
    }

    public static void main(String[] args) {
        print(12, 12, 12);
    }
}
