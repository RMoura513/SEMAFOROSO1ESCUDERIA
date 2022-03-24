package view;


import java.util.concurrent.Semaphore;

import controller.ControllerEscuderia;

public class Main extends Thread {

	public static void main(String[] args) {
		int id = 0;
		int equipe = 0;
		
		Semaphore semaforo = new Semaphore(5);
		ControllerEscuderia controllerescuderia = new ControllerEscuderia(id, equipe, semaforo);
		
		for(int i = 1; i < 3; i++){
			ControllerEscuderia e1 = new ControllerEscuderia(i, 1, semaforo);
			ControllerEscuderia e2 = new ControllerEscuderia(i, 2, semaforo);
			ControllerEscuderia e3 = new ControllerEscuderia(i, 3, semaforo);
			ControllerEscuderia e4 = new ControllerEscuderia(i, 4, semaforo);
			ControllerEscuderia e5 = new ControllerEscuderia(i, 5, semaforo);
			ControllerEscuderia e6 = new ControllerEscuderia(i, 6, semaforo);
			ControllerEscuderia e7 = new ControllerEscuderia(i, 7, semaforo);
			e1.start();
			e2.start();
			e3.start();
			e4.start();
			e5.start();
			e6.start();
			e7.start();
		}
		
		try {
			sleep(4000);
			System.out.println("************************************************************");
			System.out.println("************** R E S U L T A D O   F I N A L *****************");
			System.out.println("************** MENORES TEMPOS DE CADA CARRO ****************");
			System.out.println("************************************************************");
			System.out.println(ControllerEscuderia.resultado());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}