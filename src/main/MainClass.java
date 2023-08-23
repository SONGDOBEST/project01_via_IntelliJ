package main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {  //psvm 하면 자동완성됨
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run){

            System.out.println("메뉴선택");
            System.out.println("1. 학생등록 2. 학생상세조회 3. 학생목록조회 4. 정보수정 5. 정보삭제 0. 종료");
            System.out.println("입력: ");
            int menu = sc.nextInt();

            if(menu == 1){
                System.out.println("=========학생등록 메뉴=========");
            }else if(menu == 2){
                System.out.println("=========학생상세조회 메뉴=========");
            }else if(menu == 3){
                System.out.println("=========학생목록조회 메뉴=========");
            }else if(menu == 4){
                System.out.println("=========학생정보수정 메뉴=========");
            }else if(menu == 5){
                System.out.println("=========학생정보삭제 메뉴=========");
            }else if(menu == 0){
                run = false;
            }else{
                System.out.println("잘못된 입력입니다!");
                System.out.println("종료하실래요? (1. 종료/ 2. 계속하기)");
                int end = sc.nextInt();
                if(end == 1){
                    run = false;
                }else if(end == 2){

                }else{
                    System.out.println("잘못된 입력입니다!");
                }
            }
        }
        System.out.println("프로그램을 종료합니다!");

    }





}
