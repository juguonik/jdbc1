package db;

//Exceção de integridade referencial, para os casos de deletar info do BD

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
