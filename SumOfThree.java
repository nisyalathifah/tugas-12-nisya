public class SumOfThree {
    public static int inSumOfThree(int n, int a, int b,int c){
        if (n==0){
            return 0;
        } else {
            System.out.print(a+",");
            inSumOfThree(n-1, b, c, a+b+c);
        }
        return 0;
}
public static void main(String[] args) {
    int n =8;
    int a =2;
    int b =2;
    int c =2;
    inSumOfThree(n, a, b, c);

  }
}