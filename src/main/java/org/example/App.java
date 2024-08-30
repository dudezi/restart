package org.example;

import org.example.article.ArticleController;
import org.example.system.SystemController;

import java.util.Scanner;

public class App {
    Scanner sc;
    ArticleController articleController;
    SystemController systemController;

    App () {
        articleController = new ArticleController();
        systemController = new SystemController();
    }

    public void run () {
        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.print("명령) ");
//            String command = Container.getSc().nextLine().trim();
//            Request request = new Request(command);
            Request request = new Request(Container.getSc().nextLine().trim());

            if (request.getActionCode().equals("종료")) {
                systemController.exit();
                break;
            } else if (request.getActionCode().equals("등록")) {
                articleController.write();
            } else if (request.getActionCode().equals("목록")) {
                articleController.list();
            } else if (request.getActionCode().startsWith("삭제")) {
                articleController.delete(request.getIdx());
            } else if (request.getActionCode().startsWith("수정")) {
                articleController.modify(request.getIdx());
            }
        }
    }
}
