
public class Main {
	public static void main(String[]args) {
		Perceptron.initializeWeights();
		do {
			Perceptron.resetError();
			for(int x = 0; x < 4; x++) {
				Perceptron.setInputs(Perceptron.testingData[x][0]);
				Perceptron.setTarget(Perceptron.testingData[x][1][0]);
				Perceptron.determineOutput();
				Perceptron.errors[x] = Perceptron.error;
				Perceptron.adjustWeights();
				print1(Perceptron.inputs, Perceptron.weights, Perceptron.output, Perceptron.error);
			}
			
			Perceptron.avg(4);
			print2();
		} while(Perceptron.avgError != 0.00);
	}
	
	public static void print1(int[] inputs, double[] weights, int output, int error) {
		System.out.printf("Inputs:[%d, %d], Weights:[%.2f, %.2f], Output:%d, Error:%d\n", inputs[0], inputs[1], weights[0], weights[1], output, error);
	}
	
	public static void print2() {
		System.out.printf("Avg Error:%.2f\n", Perceptron.avgError);
	}
}
