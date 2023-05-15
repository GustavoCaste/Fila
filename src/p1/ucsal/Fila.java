package p1.ucsal;

public class Fila {
	No inicio;
	No cabeca;
	int tamanho;

	// Inicialização de uma fila vazia
	Fila () {
	cabeca = null;
	inicio = null;
	tamanho = 0;
	}

	public String front() {
		if (cabeca == null) {
		return null;
		}
		return cabeca.info;
		}
	public boolean isEmpty() {
		return inicio == null;
		}
	public void enqueue( String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
		inicio = no;
		if (tamanho == 0) {
		// Lista vazia
		cabeca = no;
		}
		tamanho++;
		}
	public String dequeue() {
		if (isEmpty()) {
		return null;
		}
		String info = cabeca.info;
		if (tamanho == 1) {
		inicio = null;
		cabeca = null;
		} else {
		No local = inicio;
		while (local.proximo != cabeca) {
		local = local.proximo;
		}
		cabeca = local;
		cabeca.proximo = null;
		}
		tamanho--;
		return info;
		}

	public int size() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "Fila [inicio = " + inicio.info + ", cabeca = " + cabeca.info + ", tamanho = " + tamanho + "]";
	}
	
}
  
