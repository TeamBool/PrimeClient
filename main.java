public class main {
    public static void main(String[] args) {
        PrepareService service = new PrepareService();
        Prepare prepare = service.getPreparePort();
        /*String primes = prepare.primesString(500);
        System.out.println(primes);
        System.out.println(primes.length());*/
        IntArray array = prepare.primesArray(100);
        for(int x : array.item){
            System.out.println(x);
        }
        System.out.println(prepare.primesString(2000));
    }
}