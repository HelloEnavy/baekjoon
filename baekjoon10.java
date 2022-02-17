import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        int count = 0;

        for(int i=1 ; i<=num ; i++) {
            int num2 = i;
            boolean check = true;
            if(num2<100) {
                count++;
            } else {
                //각 자리 수의 차이를 list에 추가
                while(num2 >= 10){
                    int number = num2%10;
                    num2=num2/10;
                    int number2 = num2%10;
                    list.add(number2-number);
                }
                //list의 값을 비교해서 같은게 아니면 false로 바뀌게 처리
                for(int j=0 ; j<list.size()-1 ; j++) {
                    if(list.get(j)!=list.get(j+1)) {
                        check = false;                                                 
                    }
                }
                //check가 true상태면(다른게 없다면) count 증가
                if(check) {
                    count++;
                }
                list.clear();               
            }
        }
        System.out.println(count);
        scanner.close();
    } 
}
