public class Primes {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int counter = 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            isPrime[i] = true;
        }
        // if a number is a prime it the number's index in the array will be true
        for (int i = 2; i <= (int) Math.sqrt(n + 1); i++) {
                if (isPrime[i]) {
                    for (int j = 2; j <= n / i; j++) {
                        isPrime[i * j] = false;
                    }
                }
        }
        // counts the numbers of primes in the given range
        for (int i = 0; i < n + 1; i++){
            if (isPrime[i]) counter++;
        }
        // prints the prime numbers in the range and a summarize
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < n + 1; i++){
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
        double average = (counter / (double) n) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int) average + "% are primes)");
    }
}