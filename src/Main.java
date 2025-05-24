import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 음식 리스트
        String[] frontGateFoods = {"고기", "일식", "한식", "양식", "중식"};
        String[] backGateFoods = {"한식", "분식", "양식", "중식"};
        String[] frontGate고기 = {"주먹구이", "장군집", "", "", ""};
        String[] frontGate일식 = {"다누끼", "길동우동", "", "", ""};
        String[] frontGate한식 = {"기울어진 뚝배기", "왕뚝배기", "롯데리아", "주먹구이", "길동우동"};
        String[] frontGate양식 = {"서브웨이", "피자헛", "롯데리아", "프랭크버거", "피자"};
        String[] frontGate중식 = {"각", "", "", "", ""};
        String[] backGate한식 = {"우암골", "성진식당", "세원식당", "오로지", "청대불고기"};
        String[] backGate분식 = {"수암정", "쇼킹", "요기요기", "", ""};
        String[] backGate양식 = {"믹스", "면식당", "믹스", "성진식당", "오로지"};
        String[] backGate중식 = {"마라퀸", "짬뽕의 맛", "", "", ""};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==== 식사 메뉴 룰렛 ====");
        System.out.println("정문/중문 룰렛을 돌립니다! 아무 키나 입력 후 Enter를 누르세요...");
        scanner.nextLine(); // 사용자 입력 대기

        System.out.println("룰렛을 돌리는 중...⏳⏳");
        Thread.sleep(1000); // 1초 대기

        // 1차 랜덤: 정문(0) 또는 중문(1)
        boolean isFrontGate = random.nextBoolean();

        Thread.sleep(500); // 1초 대기
        if (isFrontGate) {
            System.out.println("결과: 🎯 정문!\uD83D\uDCA5");
            Thread.sleep(1000);
            System.out.println("정문 음식 중 하나를 선택합니다...");
            Thread.sleep(1000);
            String selectedFood = frontGateFoods[random.nextInt(frontGateFoods.length)];
            System.out.println("정문 음식 중 하나를 선택합니다...");
            Thread.sleep(1000);
            String selectedFood = frontGateFoods[random.nextInt(frontGateFoods.length)];
            System.out.println("오늘의 점심은 🍽️ " + selectedFood + "입니다!");
        } else {
            System.out.println("결과: 🎯 중문!\uD83D\uDCA5");
            Thread.sleep(1000);
            System.out.println("중문 음식점 중 하나를 선택합니다...");
            Thread.sleep(1000);
            String selectedFood = backGateFoods[random.nextInt(backGateFoods.length)];
            System.out.println("오늘의 점심은 🍽️ " + selectedFood + "입니다!");
        }

        scanner.close();
    }
}