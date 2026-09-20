import java.io.BufferedReader;
import java.io.FileReader;

public class lista()
{

  }

  public class LeitorCsv {
    private String caminhoArquivo;

    public LeitorCsv(String caminho) {
      this.caminhoArquivo = caminho;
    }

  public Veiculo[] lerCSV() {
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ",";
    Veiculo veiculos[] = 

    br = new BufferedReader(new FileReader(caminhoArquivo));
    while ((linha = br.readLine()) != null) {

      String[] Veiculo = linha.split(csvDivisor);
      Veiculo vei = vei.parseVeiculo(Veiculo);

      veiculos.app

    }

    br.close();
  }

  }

  public class Data {

    private int ano;
    private int mes;
    private int dia;

    public Data(int dia, int ano, int mes) {
      this.dia = dia;
      this.ano = ano;
      this.mes = mes;
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

    public Data parseData(String d) {
      String[] dataS = d.split("-");
      Data aux = new Data(Integer.parseInt(dataS[0]), Integer.parseInt(dataS[1]), Integer.parseInt(dataS[2]));
      return aux;
    }

    public String format() {
      return dia + "/" + mes + "/" + ano;
    }
  }

  public class Veiculo {
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
      return id + "##" + marca + "##" + modelo + "##" + ano + "##" + categoria + "##" + combustivel + "##" + cilindros
          + "##" + cilindrada + "##" + transmissao + "##" + tracao + "##" + consumoCidade + "##" + consumoEstrada + "##"
          + co2 + "##" + turbo + "##" + dataRegistro;
    }

    public Veiculo parseVeiculo(String[] v) {
      int id = Integer.parseInt(v[0]);

      String marca = v[1];
      String modelo = v[2];
      int ano = Integer.parseInt(v[3]);
      String categoria = v[4];
      String combustivel[] = v[5].split(";");
      int cilindros = Integer.parseInt(v[6]);
      double cilindrada = Double.parseDouble(v[7]);
      String transmissao = v[8];
      String tracao = v[9];
      double consumo_cidade = Double.parseDouble(v[10]);
      double consumo_estrada = Double.parseDouble(v[11]);
      double co2 = Double.parseDouble(v[12]);
      boolean turbo = Boolean.parseBoolean(v[13]);
      Data data = data.parseData(v[14]);

      Veiculo aux = new Veiculo(id, marca, modelo, ano, categoria, combustivel, cilindros, cilindrada, transmissao,
          tracao, consumo_cidade, consumo_estrada, co2, turbo, data);
      return aux;
    }

  }

  public class main {

    public static void main(String[] args) {

    }
}
