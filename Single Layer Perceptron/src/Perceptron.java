
public class Perceptron {
	public static final int[][][] testingData = {{{0, 0}, {0}}, {{0, 1}, {1}}, {{1, 0}, {1}}, {{1, 1}, {1}}};
	
	static final double LEARNING_RATE = 0.2;
	
	static int[] inputs = new int[2];
	static double[] weights = new double[2];
	
	static int error = 0;
	static int target = 0;
	static int output = 0;
	static double avgError = 0.00;
	static int[] errors = new int[4];
	
	public static void initializeWeights() {
		for(int x = 0; x < weights.length; x++) {
			weights[x] = Math.random();
		}
	}
	
	public static void setInputs(int[] inputs1) {
		inputs = inputs1;
		
	}
	
	public static void setTarget(int x) {
		target = x;
	}
	
	public static void determineOutput() {
		double out = 0.00;
		for(int x = 0; x < inputs.length; x++) {
			out += inputs[x] * weights[x];
		}
		
		output = (int)Math.round(out);
		determineError();
	}
	
	public static void determineError() {
		error = target - output;
		avgError += Math.abs(error);
	}
	
	public static void avg(int iterations) {
		avgError /= iterations;
		
	}
	
	public static void adjustWeights() {
		for(int x = 0; x < weights.length; x++) {
		
			weights[x] += inputs[x] * error * LEARNING_RATE;
		}
		
	}
	
	public static void resetError() {
		avgError = 0;
	}
}
