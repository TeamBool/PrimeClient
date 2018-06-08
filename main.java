public class main {
    public static void main(String[] args) {
        PrepareService service = new PrepareService();
        Prepare prepare = service.getPreparePort();
        String primes = prepare.primesString(100);
        System.out.println(primes);
        System.out.println(primes.length());
        IntArray array = prepare.primesArray(1000);
        System.out.println(array.getItem().get(0));
    }
}