package Interface;

public class PrincipalComputador {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		Home home = new Home();
		
		System.out.println("Computador GAMER: ");
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		System.out.println("Computador HOME: ");
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
	}
}
