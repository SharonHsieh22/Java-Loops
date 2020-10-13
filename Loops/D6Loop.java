import java.util.Scanner;

class D6Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        int n = 0;
        int t = 0;
        String ans = "y";

        while(ans.equals("y")) {
            t = 0;
            System.out.print("How many D6's do you want to roll? ");
            n = sc.nextInt();
            System.out.println("");
            System.out.print("You rolled: ");
            for(int i = 0; i < n; i++) {
                roll = (int) (Math.random()*6) + 1;
                System.out.print(roll + " ");
                t += roll;
            }
            System.out.println("");
            System.out.println("Total: " + t);
            System.out.println("");
            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");
        }

        System.out.println("Goodbye!");
    }
}