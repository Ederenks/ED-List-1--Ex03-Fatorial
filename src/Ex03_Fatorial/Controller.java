package Ex03_Fatorial;

public class Controller {
	
	public int fatorial(int x) {
		if (x<2) { //condição de parada: casó o numero seja <2, retorna o ultimo termo do fatorial, que seria 1.
			return 1;
		}else {
			return x* fatorial(x-1); //Chamada da função.
		}
	}
}
