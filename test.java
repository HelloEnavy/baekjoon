import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String star = "*";
        for(int i=0; i<a; i++) {
            System.out.println(star.repeat(i+1));
        }
    }
    
}
