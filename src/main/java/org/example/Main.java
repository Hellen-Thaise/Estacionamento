package org.example;

import connection.ConexaoDAO;

public class Main {
    public static void main(String[] args) {
        ConexaoDAO conexao = new ConexaoDAO();
        conexao.obterConexao();
    }
}