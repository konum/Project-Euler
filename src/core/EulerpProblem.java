package core;

public abstract class EulerpProblem {

	private String name;
	private String result;
	
	public void run(){
		  long start = System.nanoTime();
          this.solve();
          long end = System.nanoTime();
          long elapsed = end - start;
          System.out.println(getName() + ": " + getResult() + " (" + String.format("%.5f", (elapsed / 1_000_000.0)) + " ms" + ")");
	}

	protected abstract void solve();
	
	protected String getResult(){
		return this.result;
	}
	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public void setResult(int result) {
		this.result = String.valueOf(result);
	}
	
	public void setResult(long result) {
		this.result = String.valueOf(result);
	}
}
