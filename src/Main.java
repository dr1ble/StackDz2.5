import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в дэки");
        int n = sc.nextInt();
        Deque d = new Deque(n);

        d.pushFront((int)(Math.random()*100));
        d.pushFront((int)(Math.random()*100));
        d.pushFront((int)(Math.random()*100));
        d.pushFront((int)(Math.random()*100));
        d.pushFront((int)(Math.random()*100));
        System.out.println("Элементы в прямом порядке: ");
        for (int i = 0; i < 20; ++i) {
            int b = d.popBack();
            System.out.println(b);
            d.pushFront(b);
        }
        System.out.println("Элементы в обратном порядке: ");
        for (int i = 0; i < 20; ++i) {
            int s = d.popFront();
            System.out.println(s);
            d.pushBack(s);
        }
    }
}
