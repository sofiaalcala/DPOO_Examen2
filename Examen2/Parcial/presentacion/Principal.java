package presentacion;

import logica.Raiz;

public class Principal {
	public static void main(String[] args) throws Exception {
		Raiz r = new Raiz();
		int a = 3;
		int b = 1;
		int c = -2;
		long t1;
		long t2;
		
		t1 = System.currentTimeMillis();
		Raiz.raiz(a, b, c);
		t2 = System.currentTimeMillis();
		System.out.println("El teimpo de ejecucion es: ");
		System.out.println(t2-t1);
		
	
		
	}

}
