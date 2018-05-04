import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class API_Acciones {

	public static void lista_empresas( ArrayList<empresa> empresas/*empresa empresas[]/*,int posicion*/) throws JSONException{
		
		String JSON="";
		
		String url="https://ws-api.iextrading.com/1.0/ref-data/symbols?filter=symbol,isEnabled";
		
		JSON=API.request_empresas(url/*,2500*/)/*+']'*/;
		
		System.out.println(JSON);
		
		JSONArray empresas1 = new JSONArray(JSON);
		for (int i = 0; i < empresas1.length(); i++)
		{
		
			/*empresas[i]=new empresa();*/
			
			JSONObject empresa1 = empresas1.getJSONObject(i);
			
			/*if(empresa1.getBoolean("isEnabled")) {	
			empresas[i].setSimbolo(empresa.getString("symbol"));
			}*/
			if(empresa1.getBoolean("isEnabled")) {	
			empresas.add(i,new empresa());
			empresas.get(i).setSimbolo(empresa1.getString("symbol"));
			}
			else {
				empresas.add(i,new empresa());
				empresas.get(i).setSimbolo("nada");
			}
			/*empresas.add(new empresa());
			empresas.get(empresas.size()).setSimbolo(empresa1.getString("symbol"));
			/*empresas[i].setSimbolo(empresa.getString("symbol"));
			/*empresas[i].setNombre(empresa.getString("name"));
			empresas[i].setFecha(empresa.getString("date"));
			empresas[i].setHabilitado(empresa.getBoolean("isEnabled"));
			empresas[i].setTipo(empresa.getString("symbol"));
			empresas[i].setIexID(empresa.getString("type"));
			

			System.out.println(empresas[i].getSimbolo()+empresas[i].getNombre()+empresas[i].getFecha()+empresas[i].getHabilitado()+empresas[i].getTipo()+empresas[i].getIexID());
			*/
			
			
			/*System.out.println(API.request("https://api.iextrading.com/1.0/stock/"+empresas[i].getSimbolo()+"/quote",2000));
			System.out.println(API.request("https://api.iextrading.com/1.0/stock/"+empresas[i].getSimbolo()+"/price",2000));
			*/
			/*if(i==posicion) {return empresas[posicion].getSimbolo();
			}*/
		}
		
		/*return empresas[posicion].getSimbolo();*/
		
	}
	public static float precio_empresa(String simbolo) throws JSONException{
		
		String JSON="";
		String JSON2="";
		String url="https://api.iextrading.com/1.0/stock/"+simbolo+"/price";
		
		JSON=API.request(url);
		
		System.out.println(JSON);
		/*for(int i=0;i<JSON.length();i++) {
			if(JSON.charAt(i)=='.') {
				JSON2=JSON2+',';
			}else {
				JSON2=JSON2+JSON.charAt(i);
			}
			
			
		}
		;*/
		float numero=Float.parseFloat(JSON);
		return numero;
		
		
		
	}
	public static void quota_empresa(String simbolo) throws JSONException{
		
		String JSON="";
		
		String url="https://api.iextrading.com/1.0/stock/"+simbolo+"/quote";
		
		JSON=API.request(url);
		
		System.out.println(JSON);
		
		/*JSONObject json = new JSONObject(JSON);
		System.out.println(json.getString("companyName"));
		System.out.println(json.getString("sector"));
		System.out.println(json.getString("open"));
		System.out.println(json.getString("close"));
		System.out.println(json.getString("high"));
		System.out.println(json.getString("low"));*/
		
		
		
	}

}
