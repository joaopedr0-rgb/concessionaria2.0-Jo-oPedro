package Controller;


import java.util.ArrayList;

public class FuncionarioController {
    public class funcionariosModel {
        ArrayList<String> listafuncionarios = new ArrayList<String>();

        public funcionariosModel(String nome, String cargo, String email, int idade) {
          if (nome == null || nome.trim().isEmpty() || cargo == null || cargo.trim().isEmpty() || email == null || email.trim().isEmpty() || idade <= 0) {
              throw new IllegalArgumentException("Todos os campos devem ser preenchidos corretamente.");

              
          }
          listafuncionarios.add("Nome: " + nome + ", Cargo: " + cargo + ", Email: " + email + ", Idade: " + idade);

        }
        public ArrayList<String> getListaFuncionarios() {
            return listafuncionarios;
        }
    }
}
