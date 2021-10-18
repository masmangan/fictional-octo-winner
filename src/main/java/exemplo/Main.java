package exemplo;

public class Main {

	public static void main(String[] args) {
		Professor prof1;
		
//		prof1 = new Professor();
//		prof1.setNome("Julio");
//		prof1.setMatricula(1234);
//		prof1.setCargaHoraria(14);
		
		prof1 = new Professor("Julio", 1234, 14);
		float cargaHorariaMensal = prof1.getCargaHorariaMensal();
		System.out.println(cargaHorariaMensal);
	}

}
