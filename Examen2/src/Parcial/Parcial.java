package Parcial;

public class Parcial {
	
	public static Double[] raiz(int a, int b, int c) throws Exception {
		if (a == 0) {
			throw new Exception("A debe ser mayor a 0, la ecuacion no es cuadratica.");
		} else {
			double discriminante = (b * b) - 4*a*c;
			if (discriminante < 0) {
				throw new Exception("No tiene solución real, el discriminante debe ser mayor a 0.");
			} else {
				double raizsuma = ((-b + discriminante)/2*a);
				double raizresta = ((-b - discriminante)/2*a);
			
				return new Double[] {raizsuma, raizresta};

	}

}}}
