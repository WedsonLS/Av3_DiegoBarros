package entidades;

public class Teste {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setCpfOutCnpj("99999");
		c.setEmail("www.c");
		//c.setEndereço("rua do meio");
		c.setId(111);
		c.setNome("chupacabra");
		
		System.out.println("cpf: "+c.getCpfOutCnpj());
		System.out.println("email: "+c.getEmail());
		System.out.println("id: "+c.getId());
		System.out.print("nome: "+c.getNome());
		c.toString();
		

	}

}
