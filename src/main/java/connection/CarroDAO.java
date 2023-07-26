package connection;
import model.Carro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class CarroDAO {

    ConexaoDAO conexaoDAO;
    List<Carro> carros;

    public CarroDAO(ConexaoDAO conexaoDAO, List<Carro> carros) {
        this.conexaoDAO = conexaoDAO;
        this.carros = carros;
    }

    public CarroDAO(ConexaoDAO conexaoDAO) {
        this.conexaoDAO = conexaoDAO;
    }

    public Carro adicionar(String proprietario, String marca, String placa) throws Exception {

        Carro carro = null;

        Integer id = 0;

        boolean estado = true;
        String usuario = "Meire Lopes";

        try {
            if (conexaoDAO.obterConexao() != null) {
                String sql = "INSERT INTO tb_carros (dono_id, nome_carro, placa_carro)" +
                        " values (?, ?, ?, ?, ?) RETURNING id";

                PreparedStatement statement = conexaoDAO.obterConexao().prepareStatement(sql);
                statement.setString(1, proprietario);
                statement.setString(2, marca);
                statement.setString(3, placa);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {

                    id = resultSet.getInt("id");

                    carro = new Carro();

                    carro.setNomeDono(proprietario);
                    carro.setId(id);
                    carro.setPlaca(placa);

                }

            }
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar carro." + e.getMessage());
            throw new RuntimeException(e);
        }
        return carro;
    }

}
