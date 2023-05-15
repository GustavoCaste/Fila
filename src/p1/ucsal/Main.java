package p1.ucsal;

public class Main {

	public static void main(String[] args) {
		Fila f = new Fila();
		f.enqueue("Paciente Jorge");
		f.enqueue("b");
		f.enqueue("c");
		System.out.println("Fila:" + f.toString());
		System.out.println("Proximo a ser atendido: " + f.front());
		
		System.out.println("Tamanho: "+f.size());
		System.out.println();
		
		while (!f.isEmpty()) {
			System.out.println(f.dequeue());
		}
		System.out.println("Fila:" + f.toString());
		System.out.println("Proximo a ser atendido: " + f.front());

	}
}
