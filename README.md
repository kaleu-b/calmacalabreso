## 🤖 Projeto Robocode - IFSC

Esse repositório contém todo o código fonte do robô **Calmacalabreso**, criado como 
parte da atividade de robocode da disciplina de **[Introdução à Computação no IFSC - São José](https://www.ifsc.edu.br/web/campus-sao-jose)**.

## 🏔️ Objetivo da Atividade

- Aprender a usar o Git e o Github para versionamento de projetos;
- Desenvolver um robô competitivo no Robocode;
- Trabalhar em equipe usando branches, commits, pull requests, merges, entre outras ferramentas utilizadas para a organização e implementação de código de diferentes membros da equipe.
- Aplicar conceitos de lógica e programação aprendidos durante o semestre na prática.

## 🥸 Membros da Equipe

- [Kaléu Borges](https://github.com/kaleu-b)

- [Kanna Waltrick](https://github.com/kankanlearnsputers) 

- [Michel Claudino](https://github.com/Mi-Claudino)

- [Rafael Floriano](https://github.com/Moonikuz)

## 🔢 Estrutura do projeto

- 'Calmacalabreso.class' : Arquivo compilado do robô.
- 'Calmacalabreso.java' : Código-fonte do robô.
- 'README.md' : Este arquivo de documentação que você está lendo agora.

## 🖥️ Como executar o robô

- 1. Instale o [robocode](https://robocode.sourceforge.io/)
- 2. Baixe esse repositório (preferencialmente usando o comando git clone na linha de comando)
- 3. Copie a pasta 'calmacalabreso' dentro da pasta 'robots/' do robocode

**OBS: caso o nome da pasta em que o robô 'calmacalabreso' seja diferente (ex: calmacalabreso-master), 
renomeie a pasta para 'calmacalabreso.'**

## 🧑‍💻 Controle de versão com Git/GitHub

- Cada membro da equipe trabalhou em **branches separadas**;
- As branches foram separadas entre as ações do robô (uma branch para as ações caso o robô batesse em uma parede, etc.);
- As alterações foram revisadas e discutidas antes de serem integradas à branch '**main**';
- Todos os membros contribuiram com pelo menos um commit.

## 💥 Estratégia do robô

**1-Movimentação**

Se move em círculos ao redor do inimigo, usando as seguintes informações:
- Ângulo em que o inimigo se encontra em relação ao nosso robô;
- Sua distância.
Com o objetivo de confundir robôs com mira inteligente e robôs cuja estratégia é se aproximar demais do oponente (Ram fire).

**2-Mira e disparo**

Nosso robô tem um radar inteligente que acompanha e coleta informações sobre o inimigo.
Usando informações como seu ângulo e distância, ele:
- Tenta advinhar seu próximo passo;
- Calcula qual potência ele deve usar para atirar (quanto mais longe, menos força usar na hora de atirar e vice versa).
Assim, ele tenta (apesar de nem sempre conseguir) advinhar o próximo passo do nosso oponente e atirar na direção em que ele está se movimentando.

**3-Tratativa de situações no campo de batalha**

Ao colidir de frente com o inimigo, atira na potência máxima para tentar matá-lo, e ao bater na parede, gira em outra direção na tentativa de não ficar travado. 

## 💯 Considerações finais

Nosso robô, apesar de ser bem eficiente em cenários de 1v1 contra robôs Ram fire e com mira inteligente, acaba perdendo um pouco sua eficácia em arenas maiores (1000*1000) e contra múltiplos inimigos.
Por não conseguimos pensar em uma forma de tratar a situção de um robô terceiro colidir por trás com o nosso robô, por exemplo.

Mas, apesar disso, ainda conseguimos ficar em segundo lugar da competição de Robocode realizada no dia 30/6/25, perdendo somente para o robô [**Molieres**](https://github.com/anaclat/projeto-java-robocode) das nosssas colegas de classe. Muitíssimos parabéns a elas <3

## 📕 Licença

Esse projeto é **educacional** e **sem fins lucrativos**.
