# Projeto IMC - Aplicativo Móvel

## FECAP - Ciência da Computação - 2024/2

### Programação de Dispositivos Móveis
### Professor: Vinícius Heltaí

---

## Descrição do Projeto

Este é o primeiro projeto de programação de dispositivos móveis para a disciplina de Programação de Dispositivos Móveis, lecionada pelo Prof. Vinícius Heltaí. O objetivo principal deste projeto é aprimorar um aplicativo de cálculo do Índice de Massa Corporal (IMC). A aplicação atual será modificada para fornecer classificações de IMC e validar as informações inseridas pelo usuário.

## Requisitos do Projeto

- **Classificação do IMC**:
  - IMC < 18,5 kg/m²: Baixo peso.
  - IMC entre 18,5 e 24,9 kg/m²: Peso normal.
  - IMC entre 25 e 29,9 kg/m²: Sobrepeso.
  - IMC entre 30 e 34,9 kg/m²: Obesidade grau 1.
  - IMC entre 35 e 39,9 kg/m²: Obesidade grau 2.
  - IMC > 40 kg/m²: Obesidade extrema.

- **Validação das Informações**:
  - Caso o usuário insira valores incorretos, o aplicativo deverá exibir:
    - `"resultado1" -> ERRO`
    - `"resultado2" -> ENTRADA INVÁLIDA`

## Entrega

- **Data de Entrega**: 10/09/2024 até 23h59 (inicialmente programado para 05/09)
- **Formato da Entrega**:
  - O arquivo `.apk` deve ser incluído no projeto.
  - O código-fonte deve ser enviado em um diretório zip contendo todo o projeto.
  - Todos os membros do grupo devem enviar o projeto no Moodle para registro no processo avaliativo.
  - O projeto deve estar alocado em um repositório no GitHub (um repositório por grupo).

## Equipe

- **Membro 1**: João Paulo Souza Colombo - 23025476
- **Membro 2**: Luciano Reis Massaro - 23025304
- **Membro 3**: Ettore Grecco - 23025294
- **Membro 4**: Nycolas Pedro Lagareiro - 23025468

## Estrutura do Repositório

- `app/`: Diretório contendo o código-fonte do aplicativo.
- `docs/`: Documentação adicional, se houver.
- `build/`: Arquivos de construção do projeto.
- `IMC_App.apk`: Arquivo APK do aplicativo.
- `README.md`: Este arquivo.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu_usuario/nome_do_repositorio.git
   
*Como Executar o Projeto
**Clone o repositório:

bash
Copiar código
git clone https://github.com/seu_usuario/nome_do_repositorio.git
Navegue até o diretório do projeto:

bash
Copiar código
cd nome_do_repositorio
Construa e execute o aplicativo:

Importe o projeto para o Android Studio.
Construa o aplicativo e execute-o em um dispositivo Android ou emulador.
