//import java.util.Scanner;
public class AppMicroondas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		microondas micro;
		micro = new microondas();
		micro.abrirPorta();
		micro.ligar();
		micro.fecharPorta();
		//micro.fecharPorta();
		System.out.println(micro.imprimir());

	}

}
