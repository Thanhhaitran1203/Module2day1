import java.util.Scanner;
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int num = sc.nextInt();
        String result;
        String x = "";
        String y = "";
        String z = "";
        int a = (num % 100) % 10;
        int b = (num % 100) / 10;
        int c = num / 100;
        switch (c) {
            case 1:
                x = "One hundred ";
                break;
            case 2:
                x = "Two hundred ";
                break;
            case 3:
                x = "Three hundred ";
                break;
            case 4:
                x = "Four hundred ";
                break;
            case 5:
                x = "Five hundred ";
                break;
            case 6:
                x = "Six hundred ";
                break;
            case 7:
                x = "Seven hundred ";
                break;
            case 8:
                x = "Eight hundred ";
                break;
            case 9:
                x = "Nine hundred ";
                break;
        }
        switch (b) {
            case 0:
                y = "";
                break;
            case 2:
                y = "twenty ";
                break;
            case 3:
                y = "thirty ";
                break;
            case 4:
                y = "Fourty ";
                break;
            case 5:
                y = "Fivety ";
                break;
            case 6:
                y = "Sixty ";
                break;
            case 7:
                y = "Seventy ";
                break;
            case 8:
                y = "Eightty ";
                break;
            case 9:
                y = "Ninety ";
                break;
        }
        switch (a) {
            case 1:
                z = "one ";
                break;
            case 2:
                z = "two ";
                break;
            case 3:
                z = "three ";
                break;
            case 4:
                z = "four ";
                break;
            case 5:
                z = "five ";
                break;
            case 6:
                z = "six ";
                break;
            case 7:
                z = "seven ";
                break;
            case 8:
                z = "eight ";
                break;
            case 9:
                z = "nine ";
                break;
        }
        if (b == 1) {
            switch (a) {
                case 0:
                    y = "ten ";
                    break;
                case 1:
                    y = "eleven ";
                    break;
                case 2:
                    y = "twelve ";
                    break;
                case 3:
                    y = "thirteen ";
                    break;
                case 4:
                    y = "fourteen ";
                    break;
                case 5:
                    y = "fiveteen ";
                    break;
                case 6:
                    y = "sixteen ";
                    break;
                case 7:
                    y = "seventeen ";
                    break;
                case 8:
                    y = "eightteen ";
                    break;
                case 9:
                    y = "nineteen ";
                    break;
            }

        }
        if (num == 0) {
            result = "Zero";
        }else if (num > 0 && num < 10) {
            result = z;
        } else if (num >= 10 && num < 20){
            result = y;
        } else if (num >= 20 && num < 100) {
            result = y + z;
        } else if (num >= 100 && num < 1000) {
            result = x + y + z;
        }else {
            result = "Số to quá không đọc nổi";
        }
        System.out.println(result);
    }
}
