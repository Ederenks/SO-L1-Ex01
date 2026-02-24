package SO_L1_Ex1;

public class Controller {
	public void aplicar(int [] x) {
		int i;
		double tempoInicial= System.nanoTime();
		for (i=0;i<(x.length);i++) {
			x[i] = 0;
		}
		double tempoFinal= System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial / Math.pow(10, 9);

		System.out.println("Vetor ==> "+tempoTotal+"s");

	}
}
