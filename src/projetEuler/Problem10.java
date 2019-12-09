package projetEuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem10 {

	// Sum of all prime numbers below int N
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int N = 2000000;
		BigInteger sum = BigInteger.TWO;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int firstPrime = 2; // 2 is the first prime number by definition
		System.out.println("O numero " + firstPrime + " eh primo");
		primes.add(firstPrime); 
		for (int i = firstPrime; i < N; i++) {
			// System.out.println("Checagem do numero " + i);
			if (isPrime(i, primes)) {
				sum = sum.add(BigInteger.valueOf(i));
				primes.add(i);
				 System.out.println("O numero " + i + " eh primo");
			}  //else {System.out.println("O numero " + i + " nao eh primo");}
		}
		System.out.println("Soma: " + sum);	
		long end = System.currentTimeMillis();
		double executionTime = end-start;
		System.out.println("Tempo de execução = " + executionTime);
	}

	private static boolean isPrime(int i, ArrayList<Integer> primeArray) {
		boolean isPrime = true;
		for (int prime : primeArray) {
			if (i % prime == 0) {
				isPrime = false;
				break;
			} 				
		}
		return isPrime;
	}

	

}
