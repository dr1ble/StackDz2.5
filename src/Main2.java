import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Deque d = new Deque();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слов для проверки на палиндром: ");
        boolean flag = false;
        try {
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++)
                d.pushFront(str.charAt(i));
            for(int j = 0; j < str.length()/2; j++){
                if(d.popBack() == d.popFront()) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag == false)
                System.out.println("Не палиндром");
            else
                System.out.println("Палиндром");
        }
        catch (Exception e) {;
        }
    }
}
