import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> frontCategories = Arrays.asList("한식", "양식", "고깃집", "일식", "중식");
        List<List<String>> frontStores = Arrays.asList(
                Arrays.asList("기울어진 뚝배기", "왕뚝배기", "통닭"),
                Arrays.asList("맘스터치", "롯데리아", "프랭크버거", "피자헛", "서브웨이"),
                Arrays.asList("베이스캠프", "주먹구이", "진원소우", ""),
                Arrays.asList("", "길동우동", ""),
                Arrays.asList("각", "마라탕")
        );

        List<String> backCategories = Arrays.asList("한식", "양식", "중식", "일식");
        List<List<String>> backStores = Arrays.asList(
                Arrays.asList("성진식당", "우암골", "청주수육국밥", "오로지", ""),
                Arrays.asList("믹스", "면식당", "맘스터치", "버거운버거"),
                Arrays.asList("마라퀸", "짬뽕의 맛"),
                Arrays.asList("봉득식당", "한신우동", "")
        );

        String selectedGate;
        List<String> selectedCategories = null;
        List<List<String>> selectedStores = null;

        while (true) {
            System.out.println("==== 학식 룰렛 ====");
            System.out.print("정문 또는 중문을 선택하세요: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("정문")) {
                selectedGate = "정문";
                selectedCategories = frontCategories;
                selectedStores = frontStores;
                break;
            } else if (input.equalsIgnoreCase("중문")) {
                selectedGate = "중문";
                selectedCategories = backCategories;
                selectedStores = backStores;
                break;
            } else {
                System.out.println("⚠️ 잘못 입력하셨습니다. '정문' 또는 '중문'으로 다시 입력해주세요.\n");
            }
        }

        System.out.println("룰렛을 돌리는 중...");
        Thread.sleep(1000);
        System.out.println("🎯 " + selectedGate + " 선택됨!");

        Thread.sleep(1000);
        System.out.println("음식 종류를 무작위로 선택합니다...");
        Thread.sleep(1000);

        int categoryIndex = random.nextInt(selectedCategories.size());
        String selectedCategory = selectedCategories.get(categoryIndex);
        System.out.println("선택된 음식 종류는 " + selectedCategory + "입니다!");

        Thread.sleep(1000);
        System.out.println("해당 음식 종류의 가게 중 하나를 선택합니다...");
        Thread.sleep(1000);

        List<String> storeList = selectedStores.get(categoryIndex);
        String selectedStore = storeList.get(random.nextInt(storeList.size()));
        System.out.println("오늘의 점심은 " + selectedStore + "에서 어떤가요?");

        scanner.close();
    }
}