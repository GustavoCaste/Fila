package p1.ucsal;

public class No {
	String info;
	No proximo;
	public No(String info) {
		this.info = info;
		
	}
	public No() {
		super();
	}
	@Override
	public String toString() {
		return "No [info=" + info + ", proximo=" + proximo + "]";
	}
	
	
	
}
