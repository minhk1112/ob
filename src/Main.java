import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] frontGateFoods = {"고기", "일식", "한식", "양식", "중식"};
        String[] 고기 = {"주먹구이", "장군집", "", "", ""};
        String[] 일식 = {"다누끼", "길동우동", "", "", ""};
        String[] 한식 = {"기울어진 뚝배기", "왕뚝배기", "롯데리아", "주먹구이", "길동우동"};
        String[] 양식 = {"서브웨이", "피자헛", "롯데리아", "프랭크버거", "피자"};
        String[] 중식 = {"각", "", "", "", ""};
        String[] backGateFoods = {"한식", "분식", "양식", "중식"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userInput = "";
        while(true){
        System.out.println("==== 식사 메뉴 룰렛 ====");
        System.out.print("정문 또는 중문을 선택해주세요.");
        userInput = scanner.nextLine().trim();

        if (userInput.equalsIgnoreCase("정문") || userInput.equalsIgnoreCase("중문")) {
            break; // 올바른 입력이면 반복 종료
        } else {
            System.out.println("⚠️ 잘못 입력하셨습니다. '정문' 또는 '중문'으로 입력해주세요.\n");
        }
    }

        System.out.println("룰렛을 돌리는 중...⏳⏳");
        Thread.sleep(1000); // 1초 대기

        boolean isFrontGate = random.nextBoolean();

        Thread.sleep(500); // 1초 대기
        if (userInput.equalsIgnoreCase("정문")) {
            System.out.println("결과: 🎯 정문 선택됨!\uD83D\uDCA5");
            Thread.sleep(1000);
            System.out.println("정문 음식 중 하나를 선택합니다...");
            Thread.sleep(1000);
            String selectedFood = frontGateFoods[random.nextInt(frontGateFoods.length)];
            System.out.println("오늘의 점심은 🍽️ " + selectedFood + "입니다!");
        } else if(userInput.equalsIgnoreCase("중문")) {
            System.out.println("결과: 🎯 중문!\uD83D\uDCA5");
            Thread.sleep(1000);
            System.out.println("중문 음식점 중 하나를 선택합니다...");
            Thread.sleep(1000);
            String selectedFood = backGateFoods[random.nextInt(backGateFoods.length)];
            System.out.println("오늘의 점심은 🍽️ " + selectedFood + "입니다!");
        }else{
            System.out.println("잘못 입력하셨습니다. '정문' 또는 '중문'으로 입력해주세요.");
        }

        scanner.close();
    }
}