import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("1. In ra hình chữ nhật ");
            System.out.println("2. In ra hình tam giác vuông:top-left; top-right;bottom-left;bottom-right");
            System.out.println("3. In ra hình tam giác cân ");
            System.out.println("4. Exit ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("*");

                        }
                        System.out.println("");
                    }
                case 2:
                    System.out.println("Bạn muốn in ra hình nào :top-left; top-right;bottom-left;bottom-right");
                    String type = scanner.next();
                    if (type.equals("top-left")) {
                        for (int i = 0; i <= 8; i++) {
                            for (int j = 8; j > i; j--) {
                                System.out.print("*");

                            }
                            System.out.println("");

                        }
                    }
                    if (type.equals("top-right")) {
                        for (int i = 0; i <= 8; i++) {
                            for (int j = 8; j < i; j++) {
                                System.out.print("");

                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");

                            }
                            System.out.println("");

                        }
                    }
                    if (type.equals("bottom-left")) {
                        for (int i = 0; i <= 8; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");

                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("bottom-right")) {
                        for (int i = 8; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("");

                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");

                            }
                            System.out.println("");

                        }
                    }
                case 3:
                    int star = 1;
                    for (int i = 1; i < 9; i++) {
                        for (int k = 10 - i; k > 0; k--) {
                            System.out.print(" ");

                        }

                        for (int j = 0; j < star; j++) {
                            System.out.print("*");

                        }
                        star += 2;
                        System.out.println("");

                    }
            }
        }
        while (number != 4);


    }
}
