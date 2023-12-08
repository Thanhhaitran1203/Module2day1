import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("USD");
        double usd = sc.nextDouble();
        System.out.println("VND" + usd * 23000);
    }
}
