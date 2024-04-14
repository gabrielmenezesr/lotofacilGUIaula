# lotofacilGUIaula

PROJETO LOTOFÁCIL, criado em Java que demonstra com interface gráfica um simulador de apostas bastante conhecido chamado "LotoFácil".

# Requesitos

• Crie um menu para a loteria utilizando as estruturas switch case e do while. Enquanto
o usuário não digitar 0, para sair, novas apostas serão permitidas.
**************************
**Menu LOTOFÁCIL:**
1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair
**************************
**•** Regras para a aposta de 0 a 100:
**•** Utilizando a biblioteca Scanner, leia um número inteiro via teclado, de 0 a 100,
caso o número seja maior que 100 ou menor que 0, imprima a mensagem: “Aposta
inválida.”.
**•** Documentação:
**•** https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
**•** Utilize a biblioteca Random para sortear aleatoriamente um número de 0 a 100.
**•** Compare o número escolhido pelo usuário apostador com o número sorteado pelo
sistema.
**•** Documentação:
 https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
**•** Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 1.000,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! O número sorteado
foi: X.”.

**• Regras para a aposta de A à Z:**

**•** Utilizando o método System.in.read(), leia um char via teclado, de A à Z, podendo
ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, imprima a
mensagem: “Aposta inválida.”. Você poderá utilizar o método Character.isLetter()
para verificar se a entrada digitada é uma letra válida.

**• Documentação:**

**•** https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

**•** Converta a entrada do usuário apostador para maiúsculo, utilizando o método
Character.toUpperCase().

**•** Escolha a letra com a inicial do seu nome para ser a letra premiada.
**•** Exemplo: char letraPremiada = 'J'.

**•** Compare a letra lida via teclado, e convertida para maiúsculo, com a letra
premiada.

 Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 500,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! A letra sorteada foi:
X.”.

• Regras para a aposta de número par ou ímpar:**

**•** Utilizando a biblioteca Scanner, leia um número inteiro via teclado. Exemplo: 600.

**•** Utilize o operador de módulo (%) para verificar se o número é par ou ímpar.

Lembrando que, caso o resto da divisão do número por 2 seja 0, o número é par.
**•** O prêmio será dado caso o usuário digite um número par. O sistema não irá
premiar jogadores que digitarem um número ímpar.

**•** Se o número digitado for par, imprima a mensagem: “Você ganhou R$ 100,00
reais.”. Caso o usuário digite um número ímpar, imprima a mensagem: “Que pena!
O número digitado é ímpar e a premiação foi para números pares.”.

# Rodando


![Captura de tela 2024-04-14 095945](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/c6d6e12c-6d98-44ef-af3e-55448b3b8718)

![Captura de tela 2024-04-14 095956](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/7d407dae-d770-4894-9d2e-15538cc69628)

![Captura de tela 2024-04-14 100003](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/bde8dde1-5932-4399-8131-35333e506a0c)

![Captura de tela 2024-04-14 100015](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/1f9de7ad-36e7-4884-8ba2-a19665d08a4b)

![Captura de tela 2024-04-14 100021](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/1f05c55e-0af7-4f76-b140-181b137a0419)

![Captura de tela 2024-04-14 100031](https://github.com/gabrielmenezesr/lotofacilGUIaula/assets/163942114/4ab7eb24-f3a6-4f71-8652-f5c4c6ff5dc6)





