package chap04_02_switch;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        int score=0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.");

        Scanner sc=new Scanner(System.in);
        String tmp=sc.nextLine();
        score=Integer.parseInt(tmp);

        switch(score/10){
            case 10: case 9:
                grade='A';
                break;
            case 8:
                grade='B';
                break;
            case 7:
                grade='C';
                break;
            default:
                grade='F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
