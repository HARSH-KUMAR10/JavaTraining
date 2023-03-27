package date22032023.clientonlycompilation;


public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(20000);
//		System.out.println("starting the work...");
		long start = System.currentTimeMillis();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		System.out.println("Total time: "+(System.currentTimeMillis()-start));
	}

}
