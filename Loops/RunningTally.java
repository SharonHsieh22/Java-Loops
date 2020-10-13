import java.util.Scanner;

class RunningTally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int t = 0;

        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        while(n >= 0) {
            System.out.print("Add: ");
            n = sc.nextInt();
            if(n > 0) {
              t += n;   
            }
        }
        
        System.out.println("");
        System.out.println("Total: " + t);
        
    }
}
