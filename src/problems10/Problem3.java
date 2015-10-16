package problems10;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import core.EulerpProblem;


//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
public class Problem3 extends EulerpProblem{

	public Problem3() {
		this.setName("Problem3");
	}

	public static void main(String[] args) {
		new Problem3().run();
	}

	public void solve() {
		long number = 600851475143L;
		IntPredicate isPrime = p -> {
			int sqrt = Double.valueOf(Math.sqrt(p)).intValue();
			return IntStream.range(3, sqrt).noneMatch(val->p%val==0);
		};
		int sqrt = Double.valueOf(Math.sqrt(600851475143L)).intValue();
		this.setResult(IntStream.range(3, sqrt/2).filter(val->number%val==0).filter(isPrime).max().getAsInt());
	}
}
