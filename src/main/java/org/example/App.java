package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;
    List<Article> articleList = new ArrayList<>();

    App (Scanner sc) {
        this.sc = sc;
    }

    public void run () {
        int lastId = 1;
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

                Article article = new Article(lastId, subject, content);
                articleList.add(article);

                System.out.printf("%d번 게시물이 등록되었습니다.\n", lastId);
                lastId++;
            } else if (command.trim().equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("----------------------");

                for (int i = articleList.size() - 1; i >= 0; i--){
                    Article article = articleList.get(i);
                    System.out.printf("%d / %s / %s\n", article.getId(), article.getSubject(), article.getContent());
                }
            }
        }
    }
}
