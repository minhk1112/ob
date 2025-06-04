import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> frontCategories = Arrays.asList("한식", )
        frontGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        frontGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        frontGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        frontGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        frontGate.put("한식", new String[]{"기울어진 뚝배기", ""});

        Map<String, String[]> frontGate = new HashMap<>();
        middleGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        middleGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        middleGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        middleGate.put("한식", new String[]{"기울어진 뚝배기", ""});
        middleGate.put("한식", new String[]{"기울어진 뚝배기", ""});

        String userInput = "";
        while(true){
        System.out.println("==== 식사 메뉴 룰렛 ====");
        System.out.print("정문 또는 중문을 선택해주세요.");
        userInput = scanner.nextLine().trim();
        if (userInput.equalsIgnoreCase("정문") || userInput.equalsIgnoreCase("중문")) {
            break;
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
            String selectedFood = middleGateFoods[random.nextInt(middleGateFoods.length)];
            System.out.println("오늘의 점심은 🍽️ " + selectedFood + "입니다!");
        }else{
            System.out.println("잘못 입력하셨습니다. '정문' 또는 '중문'으로 입력해주세요.");
        }

        scanner.close();
    }
}