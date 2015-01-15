
public class Principal {

	public static void main(String[] args) {
		//VARIABLES
		int miDinero=0;
		int dineroQuePierdo=0;
		int intTotal=0;
		int ingresos[]={10,30,5,15,25};
		int gastos[]={-45,-60,-70};
		
		//CODIGO
		
		/*Calculo todos los ingresos*/
		for(int i=0;i<ingresos.length;i++)
		{
			miDinero+=ingresos[i];
		}
		
		/*Calculo todos los gastos*/
		for(int i=0;i<gastos.length;i++)
		{
			dineroQuePierdo+=gastos[i];
		}
		
		
		/*Calculo el total*/
		intTotal=miDinero+dineroQuePierdo;

		//POR PANTALLA
		System.out.println("Subtotal ingresos: "+miDinero);
		System.out.println("Subtotal gastos: "+dineroQuePierdo);
		System.out.println("El total es: "+intTotal);
	}

}
