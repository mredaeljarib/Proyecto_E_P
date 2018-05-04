import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONException;

public class operaciones {

	static float moneda = 1000;
	static ArrayList<empresa> propiedad = new ArrayList<empresa>();
	static ArrayList<Float> cantidad = new ArrayList<Float>();
	
	public static void ver() throws JSONException {
		System.out.println("Tienes:");
		for (int i = 0; i < propiedad.size(); i++) {

			System.out.println(propiedad.get(i).getSimbolo());

		}
	}
	
	public static void comprar(ArrayList<empresa> empresas) throws JSONException {
		Scanner sc = new Scanner(System.in);

		System.out.println("control 2");
		System.out.println("Elije la empresa");
		int e = sc.nextInt();
		System.out.println(API_Acciones.precio_empresa(empresas.get(e).getSimbolo()));

		System.out.println("control 3");
		API_Acciones.quota_empresa(empresas.get(e).getSimbolo());
		System.out.println("control 4");
		String l;
		do {

			System.out.println("Deseas comprar S/N");
			l = sc.next();
			if (l.equalsIgnoreCase("S")) {

				System.out.println("Cuantos deseas comprar?");
				float c = sc.nextInt();
				float cos = API_Acciones.precio_empresa(empresas.get(e).getSimbolo());
				if (c * cos > moneda) {
					System.out.println("No puedes comprar");
				} else {
					boolean hay=false;

					for (int i = 0; i < propiedad.size(); i++) {

						if (propiedad.get(i).getSimbolo().equals(empresas.get(e).getSimbolo())) {

							float suma = cantidad.get(i) + c;
							cantidad.set(i, suma);
							hay=true;
						}
						
						

					}
					if((!hay)){
							
							propiedad.add(new empresa());
							propiedad.get(propiedad.size()-1).setSimbolo(empresas.get(e).getSimbolo());
							cantidad.add(c);
							
					}
					moneda = moneda - c * API_Acciones.precio_empresa(empresas.get(e).getSimbolo());
					System.out.println(moneda);
					l = "N";
				}

			}

		} while (l == "S");

	}

}
