import java.util.Scanner;

class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character;
        int x = 0;

        System.out.print("What character do you want your triangle to be made of? ");
        character = sc.nextLine();
        System.out.print("How tall do you want your triangle? ");
        x = sc.nextInt();
        
        System.out.println("");
        System.out.println("Here's your triangle!");
        System.out.println("");

        for(int i = 0; i < x; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}