import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Next shout!");
        System.out.println("I wanna make a more complex program");
        System.out.println("You are doing it wrong");

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you like apples?");
        String likesApples = sc.nextLine();
        System.out.println(likesApples);

    }

}