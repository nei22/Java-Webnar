package neyProjectJava;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Investimento {
	public String cpf_c;
	public String nome_c;
	public Float valor_investido_c;
	public Float taxa_c;
	public Integer periodo_c;
	public String ocorrencia_c;
	public Double valor_calculado_c;
	
	public void CalcularInvestimento()
	{
		valor_calculado_c = valor_investido_c * Math.pow(1+taxa_c, periodo_c);
		
	}
	public void GravarInvestimento() 
	{
		try {
		Class.forName ("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
		String usuario = "root";
		String senha = "Tatuagem222";
		String url = "jdbc:mysql://localhost/neyprojetojava/Tables/investimento";
		java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
		String Sql = "insert into"
		+ "investimento(cpf, nome, valor_investido, taxa, periodo, ocorrencia, valor_calculado)"
		+ "values(?,?,?,?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
		// modo de inclusao de objeto  PreparedStatement
		comando.setString(1, cpf_c);
		comando.setString(2, nome_c);
		comando.setFloat(3, valor_investido_c);
		comando.setFloat(4, taxa_c);
		comando.setInt(5, periodo_c);
		comando.setString(6, ocorrencia_c);
		comando.setDouble(7, valor_calculado_c);
		// executando modo inclusao
		comando.execute();
		comando.close();
		conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
