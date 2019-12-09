package projetEuler;

public class Problem10 {

	//Sum of all prime numbers below int N
	public static void main(String[] args) {
		int N = 2000000;
		int sum = 0;
		for (int i = 1; i < N; i++) {
			//System.out.println("Checagem do numero " + i);
			if (isPrime(i)) {
				sum += i;
				//System.out.println("O numero " + i + " eh primo");
			} //else {System.out.println("O numero " + i + " nao eh primo");}
		}
		System.out.println("Soma: " + sum);
	}

	private static boolean isPrime(int i) {
		int divisores = 0;
		if (i % 2 == 0 && i > 2) {
			return false;
		}
		for (int j = 1; j <= i/2 ; j++) {
			if (divisores > 2) {
				return false;
			}
			if (i%j==0) {
				divisores++;
				//System.out.println("O numero " +j+ " eh um divisor de "+i);
			}			
		}
		return divisores == 2;
	}

}
