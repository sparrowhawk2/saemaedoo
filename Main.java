import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e= new Scanner(System.in);
        int a=e.nextInt();
        int tmp=0,right=0,left=0;
        for(int i=1; i<10000; i++) {
            if(a>tmp && tmp+i>=a) {
                if(i%2==0) {
                    right=i+1-(a-tmp);
                    left=(a-tmp);    
                }
                else {
                    right=(a-tmp);
                    left=i+1-(a-tmp);
                }
                break;
            }
            tmp+=i;
        }
        System.out.print(left+"/"+right);
		
	
	}
}