package problems10;

import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import core.EulerpProblem;


//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.
public class Problem1 extends EulerpProblem {


	public Problem1() {
		this.setName("Problem1");
	}

	public static void main(String[] args) {
		new Problem1().run();
	}

	@Override
	protected void solve() {
		int res = IntStream.range(0, 1000).filter(val -> (val % 3==0 || val % 5==0)).sum();
		this.setResult(res);
	}
}
