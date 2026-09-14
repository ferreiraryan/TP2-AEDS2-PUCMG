#include "Data.h"

typedef struct {
  int id;
  char marca[50];
  int ano;
  char categoria[50];
  char combustivel[50][50];
  int cilindros;
  double cilindrada;
  char transmissao[50];
  char tracao[50];
  double consumoCidade;
  double consumoEstrada;
  double co2;
  bool turbo;
  Data dataRegistro;

} Veiculo;
