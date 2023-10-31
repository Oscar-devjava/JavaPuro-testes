package ContaComTitular;

public class TestaContaComTitular {
	public static void main(String[] args) {
		ContaComTitular c = new ContaComTitular(123, 456);
		Titular t1 = new Titular();
		t1.setNome("Oscar");
		t1.setDataNascimento("2007-12-03");
		c.setTitular(t1);
		
		System.out.println(c.getNomeTitular().nome+ " " + t1.getDataNascimento());
		
	}
}
