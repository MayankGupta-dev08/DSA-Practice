import java.util.*;
public class c18_pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        inp.close();

        int mx = Math.max(a, Math.max(b, c));
        boolean flag;
        
        if(mx==a){
            flag = ((a*a)==(b*b + c*c));
        }
        else if(mx==b){
            flag = ((b*b)==(a*a + c*c));
        }
        else{
            flag = ((c*c)==(b*b + a*a));
        }

        System.out.println(flag);
    }
}
