public class MoreDivFac
{
    int aCountAndb() {
        int a = 64, b = 48;
        int acount = 0, bcount = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                acount++;
            }
            if(b % i == 0) {
                bcount++;
            }
        }
        System.out.println(acount + " " + bcount);
        if(acount > bcount) {
            return acount;
        }
        else if(bcount > acount) {
            return bcount;
        }
        return 404;
    }
    
    // int bCount() {
    //     int b = 48;
    //     int bcount = 0;
    //     for(int i = 1; i <= b; i++) {
    //         if(b % i == 0) {
    //             bcount++;
    //         } 
    //     }
    //     return bcount;
    // } 
    
    // static int ret(){
    //     if(acount > bcount) {
    //         return acount;
    //     }
    //     if(bcount > acount) {
    //         return bcount;
    //     }
    // }
	
	public static void main(String[] args) {
	    
	    Main m = new Main();
	    System.out.println(m.aCountAndb());
	}
}
