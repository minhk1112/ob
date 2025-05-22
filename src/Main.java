import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 음식 리스트
        String[] frontGateFoods = {"서브웨이", "기울어진 뚝배기", "롯데리아", "주먹구이", "길동우동"};
        String[] backGateFoods = {"면식당", "청주수육국밥", "믹스", "성진식당", "오로지"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==== 학식 룰렛 ====");
        System.out.println("정문/중문 룰렛을 돌립니다! 아무 키나 입력 후 Enter를 누르세요...");
        scanner.nextLine(); // 사용자 입력 대기

        System.out.println("룰렛을 돌리는 중...⏳⏳");
        Thread.sleep(1000); // 1초 대기

        // 1차 랜덤: 정문(0) 또는 중문(1)
        boolean isFrontGate = random.nextBoolean();

        Thread.sleep(1000); // 1초 대기
        if (isFrontGate) {
            System.out.println("결과: 🎯 정문!\uD83D\uDCA5");
            Thread.sleep(1000);
            System.out.println("정문 음식점 중 하나를 선택합니다...");
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