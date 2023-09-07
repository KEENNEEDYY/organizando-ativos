import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList <String> ativos = new ArrayList<>();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = input.nextInt();
    input.nextLine();

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = input.nextLine();
      ativos.add(codigoAtivo);
    }

    //TODO: Ordenar os ativos em ordem alfabética.
    Collections.sort(ativos);
    
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (String ativo : ativos) {
      System.out.println(ativo);
    }
  }
}