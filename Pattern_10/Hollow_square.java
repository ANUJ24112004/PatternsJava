public class Hollow_square {
    static void rowhollow(int n,int m,int i){
        if(n<0){
            return;
        }
        if(n==i || n==0 || m==i || m==1){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
        rowhollow(n-1 ,m,i);
    }
    static void print(int n,int m,int i){
        if(m<=0){
            return;
        }
        rowhollow(n,m,i);
        System.out.println();
        print(n, m-1,i);
    }
}
