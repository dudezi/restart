package org.example;

import java.lang.module.FindException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 게시판 앱 ==");
        while (true){
            System.out.print("명령) ");
            String command = sc.nextLine();
            if (command.trim().equals("종료")) {
                break;
            } else if (command.trim().equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                System.out.println("1번 게시물이 등록되었습니다.");
            }
        }

        sc.close();
    }
}