import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PrepareService service = new PrepareService();
        Prepare prepare = service.getPreparePort();
        userInterface(prepare);
    }

    public static int getN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of primes: ");
        int n = scanner.nextInt();
        return n;
    }

    public static void userInterface(Prepare prep){
        int choice = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your choices:");
            System.out.println("1: n primes as string");
            System.out.println("2: n primes as int-array");
            System.out.println("3: n primes as vector");
            System.out.println("4: end");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println(getString(prep));
                    break;
                case 2:
                    IntArray array = getArray(prep);
                    for(int x : array.item){
                        System.out.println(x);
                    }
                    break;
                case 3:
                    Vector vec = getVector(prep);
                    //TODO do somnething ?!? maybe other data struct
                    break;
                case 4:
                    break;
                    default:
                        continue;
            }
        } while(choice != 4);
    }

    public static String getString(Prepare prep){
        return prep.primesString(getN());
    }

    public static IntArray getArray(Prepare prep){
        return prep.primesArray(getN());
    }

    public static Vector getVector(Prepare prep){
        return prep.newWorker(getN());
    }
}