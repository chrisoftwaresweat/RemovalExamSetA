import java.util.Scanner;
//READ THIS: DON'T MIND THE MAIN METHOD, IF U WANNA REVIEW GO STRAIGHT TO SUB METHODS!
//REMOVE THE COMMENTS IF U WANNA USE THE CODE
public class RemovalSetA {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\nWE HAVE 4 PROBLEMS");
            System.out.print("(1)Right-Shifted Star Pattern\n(2)Decreasing Star Pattern with shift\n(3)Repeated Number Triangle\n(4)Number Series\n(5)Exit\nWhich one dy wanna run?: ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    problemOne(scanner);
                    break;
                case 2:
                    problemTwo(scanner);
                    break;
                case 3:
                    problemThree(scanner);
                    break;
                case 4:
                    problemFour(scanner);
                    break;
                case 5:
                    System.out.println("GOOD LUCK ON YOUR EXAM!");
                    break;
                default :
                    System.out.println("Only choose numbers from 1-5 and 6 to exit");
            }
        }while(choice!=5);
        scanner.close();
    }
    /*
    FOR THE FIRST 3 PROBLEMS REMEMBER THESE PATTERN
    (INITIALIZATION; CONDITION)
    OUTER LOOP: (1; USER INPUT) PRINT NEW LINE
    INNER LOOPS: INCREASING AND DECREASING
    INCREASING: 1; OUTER LOOP
    DECREASING: OUTER LOOP; USER INPUT
    JUST MANIPULATE THESE IF YOU'RE DEALING WITH PATTERNS! OUTER LOOP/S=ROWS, INNER LOOP/S=COLUMNS
    DON'T MEMORIZE SYNTAX; FIND PATTERNS, AND UNDERSTAND IT
     */
    //Problem 1: Right-Shifted Star Pattern
    static void problemOne(Scanner scanner){
        System.out.print("Enter how many rows: ");
        int n= scanner.nextInt();
        //inner loop: it has an INCREASING space, and SQUARE/RECTANGLE patterns. for sq/rec patterns just reuse d outer loop.
        //outer loop
        for (int i=1; i<=n; i++){

            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Problem 2: Decreasing Star Pattern with shift
    static void problemTwo(Scanner scanner){
        System.out.print("Enter how many rows: ");
        int n= scanner.nextInt();
        //outer loop
        for (int i=1; i<=n; i++){
            //the pattern for this is INCREASING space, and DECREASING star
            for (int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for (int k=i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Problem 3: Repeated Number Triangle
    static void problemThree(Scanner scanner){
        int n=9;
        //outer loop
        for (int i=1; i<=n; i++){
            /*
            u only need one increasing numerical pattern
            and print i instead of j so it prints 1 22 33 rather than 1 12 123
            */
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    //Problem 4: Number Series
    static void problemFour(Scanner scanner){
        int n=9;
        int first=1, second=2;
        for (int i=1; i<=n; i++){
            System.out.printf("%d ", first);
            //next = 1*2=2, 2*2=4, 2*4=8
            int next=first*second;
            //oldFirst(1)->newFirst(2), 2->2, 2->4; first becomes the previous second
            first=second;
            //oldSecond(2)->newSecond(2), 2->4, 4->8; second becomes the product
            second=next;
        }
    }
}


