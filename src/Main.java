import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"한식", "양식", "고기", "치킨", "중식"};

        System.out.println("음식 룰렛을 돌릴 준비가 되셨나요?");

        System.out.println("룰렛을 돌리시겠습니까? (엔터를 누르세요)");
        scanner.nextLine();

        int selectedIndex = random.nextInt(options.length);
        String result = options[selectedIndex];

        System.out.println("룰렛을 돌리는 중...");
        try {
            Thread.sleep(1000); // 1초간 딜레이 (룰렛 도는 느낌)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("결과는... 🥁🥁🥁");
        try {
            Thread.sleep(1000); // 또 딜레이
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🎯 " + result + " 당첨!");

        scanner.close();
    }
}