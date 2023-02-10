import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Жуманын кунун жазыныз: ");
        String weeks = console.nextLine();

        Week kun = Week.valueOf(weeks.toUpperCase());
        switch (kun){
            case ДУЙШОМБУ -> System.out.println(Week.ДУЙШОМБУ);
            case ШЕЙШЕМБИ -> System.out.println(Week.ШЕЙШЕМБИ);
            case ШАРШЕМБИ -> System.out.println(Week.ШАРШЕМБИ);
            case БЕЙШЕМБИ -> System.out.println(Week.БЕЙШЕМБИ);
            case ЖУМА -> System.out.println(Week.ЖУМА);
            case ИШЕМБИ -> System.out.println(Week.ИШЕМБИ);
            case ЖЕКШЕМБИ -> System.out.println(Week.ЖЕКШЕМБИ);
        }

    }
}