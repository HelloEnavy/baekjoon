import java.util.Scanner;

public class baekjoon11 {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String number = scanner.nextLine();
        String[] numArr = new String[num];
        int sum = 0;

        for(int i=0 ; i<num ; i++) {
            numArr[i] = number.substring(i,i+1);
            sum+=Integer.parseInt(numArr[i]);
        }
        
        System.out.println(sum);
        
    }
}
=======
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char answer = scanner.nextLine().charAt(0);
        int number = (int)answer;

        System.out.println(number);

    }
}
>>>>>>> f7c17b5768a1c777512e3208f3a0816cc92c706c
