import java.util.Scanner;
public class Difference
{
    static String dsp(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length - 4; i++) {
            if(a[i] == 'a' && a[i + 4] == 'b'){
                return "true";
            }
            
        }
        
        return "false";
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		String s = sc.nextLine();
		System.out.println(dsp(sc.nextLine()));
	}
}
