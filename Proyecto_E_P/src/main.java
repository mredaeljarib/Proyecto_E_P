import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONException;

public class main {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		float moneda = 100;
		operaciones operaciones = null;
		System.out.println(moneda);
		/* empresa[] empresas = new empresa[2500]; */
		Scanner sc = new Scanner(System.in);
		ArrayList<empresa> empresas = new ArrayList<empresa>();

		System.out.println("control 0");
		API_Acciones.lista_empresas(empresas);

		while (true) {
			System.out.println("control 1");
			for (int i = 0; i < empresas.size() / 2; i++) {
				System.out.println(i + " " + empresas.get(i).getSimbolo());
			}
			
			operaciones.comprar(empresas);
			operaciones.ver();
			/*System.out.println("control 2");
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
						moneda = moneda - c * API_Acciones.precio_empresa(empresas.get(e).getSimbolo());
						System.out.println(moneda);
						l = "N";
					}

				}

			} while (l == "S");*/

		}

	}

}
