import java.util.*;

public class Principal {
	public static void main(String[] args) {

		Somar soma = new Somar();
		Scanner entrada = new Scanner(System.in);
		Stack<Integer> pilhaA = new Stack<Integer>();
		Stack<Integer> pilhaB = new Stack<Integer>();
		Stack<Integer> resultado = new Stack<Integer>();
		List<Integer> aux = null;
		int result = 0;
		int sobra = 0;

		System.out.print("Informe o primeiro valor: ");
		int a = entrada.nextInt();
		System.out.print("Informe o segundo valor: ");
		int b = entrada.nextInt();

		soma.push(pilhaA, a);
		soma.push(pilhaB, b);

		System.out.println("\nPilha A: " + pilhaA);
		System.out.println("Pilha B: " + pilhaB + "\n");

		while (!pilhaA.isEmpty() || !pilhaB.isEmpty()) {
			aux = soma.addValues(pilhaA, pilhaB);
			result = aux.get(0) + sobra;
			sobra = aux.get(1);
			resultado.add(result);
		}

		String saida = "";
		if (sobra == 1) {
			saida += 1;
		}

		while (!resultado.isEmpty()) {
			saida += resultado.pop();

		}

		System.out.println("\nResultado: " + saida);
	}
}