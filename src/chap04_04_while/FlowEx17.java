package chap04_04_while;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){

        int input=0 , answer=0;

        answer=(int)(Math.random() *100 )+1;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("1과 100사이의 정수를 입력하세요!");
            input=sc.nextInt();

            if(input>answer){
                System.out.print("더 작은 수로 다시 시도해보세요!");
            }else if(input<answer){
                System.out.print("더 큰 수로 다시 시도해보세요!");
            }
        }while(input!=answer);

        System.out.println("정답입니다!");
    }
}
