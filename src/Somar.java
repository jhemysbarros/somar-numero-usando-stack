import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Somar {

	public void push(Stack<Integer> pilha, int valor) {

		String temp = Integer.toString(valor);
		for (int i = 0; i < temp.length(); i++) {
			pilha.push(temp.charAt(i) - '0');
		}
	}

	public void pop(Stack<Integer> pilha) {
		pilha.pop();
	}

	public List<Integer> addValues(Stack<Integer> pilhaA, Stack<Integer> pilhaB) {
		int resto = 0, valor = 0, vaiUm = 0, x = 0, y = 0;

		if (!pilhaA.isEmpty()) {
			x = pilhaA.pop();
		}

		if (!pilhaB.isEmpty()) {
			y = pilhaB.pop();
		}

		resto = x + y + vaiUm;

		valor = resto % 10;
		if (resto > 9) {
			vaiUm = 1;
		} else {
			vaiUm = 0;
		}

		System.out.println("Valor: " + valor + " Vai um: " + vaiUm);

		return Arrays.asList(valor, vaiUm);
	}
}