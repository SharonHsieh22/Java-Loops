import java.util.Scanner;

class Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character;
        int x = 0;

        System.out.print("What character do you want your bar to be made of? ");
        character = sc.nextLine();
        System.out.print("How long do you want your bar? ");
        x = sc.nextInt();
        System.out.println("");
        
        System.out.println("Here's your bar!");
        System.out.println("");
        for(int i = 0; i < x; i++) System.out.print(character);
    }

}