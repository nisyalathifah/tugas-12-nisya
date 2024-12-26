import java.util.Scanner;
public class Palindrom {

    public static boolean onPalindrom(String str, int start, int end){
        if (start>=end) {
            System.out.println( str+ " merupakan palindrom");
            return true;
        }
        if (str.charAt(start)!=str.charAt(end)){
            return onPalindrom(str, start+1, end-1);
            
        }
        System.out.println( str+ " bukan palindrom");
        return false;
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String str = data.next();
        onPalindrom(str, 0, str.length()-1);

        data.close();
    
    } 
}