import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContaDao {
	private Connection connection;
	
	public ContaDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserirConta(Conta conta) {
		try {
			String sql = "Insert into conta (numero_conta, titular_conta, saldo_conta) values (?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, conta.getNumeroConta());
			stmt.setString(2, conta.getTitularConta());
			stmt.setDouble(3, conta.getSaldoConta());
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro");
		}
	}
	
}
