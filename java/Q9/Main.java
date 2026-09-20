import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class LeitorCsv {

  public static Veiculo[] ler(String caminhoArquivo) {
    int qtdLinhas = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
      br.readLine();
      while (br.readLine() != null) {
        qtdLinhas++;
      }
    } catch (Exception e) {
    }

    Veiculo[] veiculosArray = new Veiculo[qtdLinhas];

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
      br.readLine();
      String linha;
      int i = 0;
      while ((linha = br.readLine()) != null) {
        veiculosArray[i++] = Veiculo.parseVeiculo(linha);
      }
    } catch (Exception e) {
    }

    return veiculosArray;
  }
}

class Data {

  private int ano;
  private int mes;
  private int dia;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public static Data parseData(String d) {
    String[] dataS = d.split("-");
    return new Data(Integer.parseInt(dataS[2]), Integer.parseInt(dataS[1]), Integer.parseInt(dataS[0]));
  }

  public String format() {
    return String.format("%02d/%02d/%04d", dia, mes, ano);
  }
}

class Veiculo {
  private int id;
  private String marca;
  private String modelo;
  private int ano;
  private String categoria;
  private String[] combustivel;
  private int cilindros;
  private double cilindrada;
  private String transmissao;
  private String tracao;
  private double consumoCidade;
  private double consumoEstrada;
  private double co2;
  private boolean turbo;
  private Data dataRegistro;

  public Veiculo(int id, String marca, String modelo, int ano, String categoria, String[] combustivel, int cilindros,
      double cilindrada, String transmissao, String tracao, double consumoCidade, double consumoEstrada, double co2,
      boolean turbo, Data dataRegistro) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.categoria = categoria;
    this.combustivel = combustivel;
    this.cilindros = cilindros;
    this.cilindrada = cilindrada;
    this.transmissao = transmissao;
    this.tracao = tracao;
    this.consumoCidade = consumoCidade;
    this.consumoEstrada = consumoEstrada;
    this.co2 = co2;
    this.turbo = turbo;
    this.dataRegistro = dataRegistro;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String[] getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(String[] combustivel) {
    this.combustivel = combustivel;
  }

  public int getCilindros() {
    return cilindros;
  }

  public void setCilindros(int cilindros) {
    this.cilindros = cilindros;
  }

  public double getCilindrada() {
    return cilindrada;
  }

  public void setCilindrada(double cilindrada) {
    this.cilindrada = cilindrada;
  }

  public String gettransmissao() {
    return transmissao;
  }

  public void settransmissao(String transmissao) {
    this.transmissao = transmissao;
  }

  public String getTracao() {
    return tracao;
  }

  public void setTracao(String tracao) {
    this.tracao = tracao;
  }

  public double getConsumoCidade() {
    return consumoCidade;
  }

  public void setConsumoCidade(double consumoCidade) {
    this.consumoCidade = consumoCidade;
  }

  public double getConsumoEstrada() {
    return consumoEstrada;
  }

  public void setConsumoEstrada(double consumoEstrada) {
    this.consumoEstrada = consumoEstrada;
  }

  public double getCo2() {
    return co2;
  }

  public void setCo2(double co2) {
    this.co2 = co2;
  }

  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(boolean turbo) {
    this.turbo = turbo;
  }

  public Data getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(Data dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public String format() {
    String strCombustivel = "[";
    for (int i = 0; i < combustivel.length; i++) {
      strCombustivel += combustivel[i];
      if (i < combustivel.length - 1) {
        strCombustivel += ",";
      }
    }
    strCombustivel += "]";

    return "[" + id + " ## " + marca + " ## " + modelo + " ## " + ano + " ## " + categoria + " ## "
        + strCombustivel + " ## " + cilindros + " ## " + cilindrada + " ## "
        + transmissao + " ## " + tracao + " ## "
        + String.format("%.2f", consumoCidade) + " ## "
        + String.format("%.2f", consumoEstrada) + " ## " + co2 + " ## " + turbo + " ## "
        + dataRegistro.format() + "]";
  }

  public static Veiculo parseVeiculo(String s) {
    String[] v = s.split(",");

    int id = Integer.parseInt(v[0]);
    String marca = v[1];
    String modelo = v[2];
    int ano = Integer.parseInt(v[3]);
    String categoria = v[4];
    String[] combustivel = v[5].split(";");
    int cilindros = Integer.parseInt(v[6]);
    double cilindrada = Double.parseDouble(v[7]);
    String transmissao = v[8];
    String tracao = v[9];
    double consumo_cidade = Double.parseDouble(v[10]);
    double consumo_estrada = Double.parseDouble(v[11]);
    double co2 = Double.parseDouble(v[12]);
    boolean turbo = Boolean.parseBoolean(v[13]);
    Data data = Data.parseData(v[14]);

    return new Veiculo(id, marca, modelo, ano, categoria, combustivel, cilindros, cilindrada, transmissao,
        tracao, consumo_cidade, consumo_estrada, co2, turbo, data);
  }
}

public class Main {
  public static void main(String[] args) {
    Veiculo veiculos[] = LeitorCsv.ler("../../veiculos.csv");
    Veiculo veiculosAOrdenar[] = new Veiculo[600];
    int totalVeiculos = 0;

    Scanner scanner = new Scanner(System.in);
    int id;
    while ((id = scanner.nextInt()) != -1) {
      for (int i = 0; i < veiculos.length; i++) {
        if (id == veiculos[i].getId()) {
          veiculosAOrdenar[totalVeiculos] = veiculos[i];
          totalVeiculos++;
          i = veiculos.length;
        }

      }
    }
    scanner.close();

    Veiculo[][] baldes = new Veiculo[10][totalVeiculos];
    int[] cont = new int[10];

    for (int i = 0; i < totalVeiculos; i++) {
      Veiculo v = veiculosAOrdenar[i];
      int indice = (int) ((v.getCilindrada() / 8.1) * 10);

      if (indice >= 10) {
        indice = 9;
      }
      baldes[indice][cont[indice]] = v;
      cont[indice]++;
    }
    int posOriginal = 0;
    for (int i = 0; i < 10; i++) {
      int tamanhoBalde = cont[i];
      if (tamanhoBalde > 1) {
        for (int j = 1; j < tamanhoBalde; j++) {
          Veiculo tmp = baldes[i][j];
          int k = j - 1;

          while (k >= 0 && tmp.getCilindrada() < baldes[i][k].getCilindrada()) {
            baldes[i][k + 1] = baldes[i][k];
            k--;
          }
          baldes[i][k + 1] = tmp;
        }
      }
      for (int j = 0; j < tamanhoBalde; j++) {
        veiculosAOrdenar[posOriginal++] = baldes[i][j];
      }
    }

    for (int i = 0; i < totalVeiculos; i++) {
      System.out.println(veiculosAOrdenar[i].format());
    }

  }
}
