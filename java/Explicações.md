# Objetivo
O objetivo deste projeto é fornecer uma explicação detalhada de conceitos importantes da linguagem Java, 
por meio de exemplos práticos e demonstrações claras. O foco principal é a compreensão dos conceitos, 
em vez de apenas fornecer códigos específicos.

Além de oferecer um recurso útil para estudantes, desenvolvedores e entusiastas da linguagem Java, 
fornecendo exemplos claros e práticos que ajudem a solidificar a compreensão dos conceitos abordados.

Sei que é simples, mas assim como me ajudou no início, espero que possa ajudá-los também ;)

# Conteúdos

- [POO - Programação Orientada a Objetos](#-poo-programacao-orientada-a-objetos)
- [Modificadores de Acesso](#-modificadores-de-acesso)
- [Sobrecarga x Sobreposição](#-sobrecarga-x-sobreposicao)
- [Operadores aritméticos](#-operadores-aritmeticos)
- [Operadores relacionais](#-operadores-relacionais)
- [Operadores de atribuição](#-operadores-de-atribuicao)
- [Operadores de incremento e decremento](#-operadores-de-incremento-e-decremento)
- [Operadores lógicos](#-operadores-logicos)
- [Tratamento de exceções ](#-tratamento-de-excecoes)
- [Sequências de scape](#-sequencias-de-scape)
- [Especificadores de formato](#-especificadores-de-formato)
- [Estrutura de pasta](#-estrutura-de-pasta-visão-geral)
- [Tipos de comentários](#tipos-de-comentarios)
- [Vetores](#-arrays-unidimensionais-vetores)
- [Matrizes](#arrays-multidimensionais-matrizes)

## POO - Programação Orientada a Objetos
A programação orientada a objetos tem como base a:

### Abstração
É o processo de simplificar e representar um objeto do mundo real em um modelo conceitual. 
É uma técnica que nos permite focar nos aspectos essenciais de um objeto, ignorando detalhes irrelevantes. 

### Encapsulamento
Princípio de proteger os dados dentro de uma classe e fornecer acesso controlado por meio de métodos públicos, 
garantindo a segurança e a integridade dos dados, além de facilitar a manutenção do código.

### Herança
Permite criar novas classes com base em classes existentes, aproveitando suas características e expandindo suas funcionalidades.

### Polimorfismo
Permite que objetos de diferentes classes sejam tratados de maneira uniforme, oferecendo flexibilidade e permitindo 
que o comportamento específico seja determinado em tempo de execução.

### O que é classe?
De maneira resumida, uma classe é um modelo que descreve as características e os comportamentos que os objetos terão.

### O que é objeto?
É uma instância concreta de uma classe, representando uma entidade específica com suas próprias propriedades e ações.

## Modificadores de acesso
Os modificadores de acesso em Java são palavras-chave que definem a visibilidade e o 
nível de acesso aos membros (variáveis e métodos) de uma classe. Verifique um exemplo abaixo: 
| 👩‍💻 | **Classe** | **Pacote** | **Subclasse** | **Todos** |
|----|------------|-------------|-------------|---------|
| **Public** | ✅ | ✅| ✅ | ✅ |
| **Protected** | ✅ | ✅ | ✅ | ❌ |
| **Default** | ✅ | ✅ | ❌ | ❌ |
| **Private** | ✅ | ❌ | ❌ | ❌ |

## Sobrecarga x Sobreposição
Em resumo, a **Sobreposição** permite que uma classe filha substitua um método da classe pai com uma implementação personalizada, 
enquanto a **Sobrecarga** permite que uma classe tenha vários métodos com o mesmo nome, mas com diferentes parâmetros. 
Ambos os conceitos ajudam a melhorar a flexibilidade e a reutilização de código em Java. Confira abaixo um exemplo:

| **Características** |        **Sobrecarga**         | **Sobreposição** |
|---------------------|-------------------------------|------------------|
| Argumentos          | Devem ser trocados            | Não devem ser trocados |
| Tipo de Retorno     | Pode ser trocado              | Não pode ser trocado |
| Tipo de Acesso      | Pode ser trocado              | Pode ser trocado por um modificador menor restritivo |
| Tipo de Exceção     | Pode ser trocado              | Pode ser trocado por uma exceção menos restritiva |
| Classe              | Ocorre em uma classe          | Ocorre entre duas classes |
| Herança             | Não envolve Herança           | Envolve herança |
| Invocação           | Ocorre em tempo de compilação | Ocorre em tempo de execução |

## Operadores aritméticos
|**Nome operador**|**Símbolo**|**Exemplo em Java**|**Exemplo numérico**|
|-----------------|-----------|-------------------|--------------------|
| Soma | + | x + y | 5 + 3 (=8) | 
| Subtração | - | x - y | 5 - 3 (=2) |
| Multiplicação | * | x * y | 5 * 3 (=15) |
| Divisão | / | x / y | 5 / 3 (=1) |
| Resto da divisão | % | x % y | 5 % 3 (=2) |

## Operadores relacionais
|**Nome operador**|**Símbolo**|**Exemplo em Java**|**Exemplo numérico**|
|-----------------|-----------|-------------------|--------------------|
| Igualdade | == | x == y | 5 == 3 (Falso) | 
| Diferente | != | x != y | 5 != 3 (Verdadeiro) |
| Maior que | > | x > y | 5 > 3 (Verdadeiro) |
| Maior ou igual a | >= | x >= y | 5 >= 3 (Verdadeiro) |
| Menor que | < | x < y | 5 < 3 (Falso) |
| Menor ou igual a | <= | x <= y | 5 <= 3 (Falso) |

## Operadores de atribuição
|**Nome operador**|**Símbolo**|**Exemplo Encurtado**|**Significado exemplo**|
|-----------------|-----------|-------------------|--------------------|
| Atribuição de adição | += | x += 3 | x = x + 3 | 
| Atribuição de subtração | -= | x -= 3 | x = x - 3 |
| Atribuição de multiplicação | * = | x * = 3 | x = x * 3 | 
| Atribuição de divisão | /= | x /= 3 | x = x / 3 | 
| Atribuição de resto | %= | x %= 3 | x = x % 3 | 

## Operadores de incremento e decremento
|**Nome operador**|**Símbolo**|**Exemplo em Java**|**Explicação do exemplo**|
|-----------------|-----------|-------------------|--------------------|
| Pré-incremento | ++ | ++x | Incrementa x em 1 e, então, utiliza x na expressão atual | 
| Pós-incremento | ++ | x++ | Utiliza x na expressão atual e, então, incrementa x em 1 |
| Pré-decemento | -- | --x | Decrementa x em 1 e, então, utiliza x na expressão atual | 
| Pós-decremento | -- | x-- | Utiliza x na expressão atual e, então, decrementa x em 1 |

## Operadores lógicos
|**Nome operador**|**Símbolo**|**Exemplo em Java**|**Exemplo com Valores**|
|-----------------|-----------|-------------------|--------------------|
| E Lógico | && | exp1 && exp2 | true && false (falso) | 
| Ou Lógico | II | exp1 II exp2 | true II false (verdade) | 
| Negação Lógico | ! | !exp | !true (falso) | 

## Tratamento de exceções 
O tratamento de exceções em Java é uma técnica usada para lidar com erros e condições excepcionais que podem ocorrer 
durante a execução de um programa.

Quando um problema ocorre, uma exceção é lançada, interrompendo a execução normal do programa. 
O tratamento de exceções permite que você capture e trate essas exceções, 
fornecendo um plano de ação alternativo para lidar com o erro.


Em resumo, o tratamento de exceções em Java permite que você lide com erros e condições excepcionais de forma controlada, 
evitando falhas no programa e fornecendo uma forma de lidar com situações inesperadas.

## Sequências de scape
A sequência de escape em Java é uma combinação especial de caracteres que começa com uma barra invertida 
() seguida por um ou mais caracteres. Essas sequências são usadas para representar caracteres especiais 
que não podem ser digitados diretamente em um código Java.

| **Sequência de Escape** | **Descrição** | **Exemplo de utilização** |
|---------------------|-----------|-----------------------|
| \n | Insere uma nova linha | System.out.println("Introdução\na\nProgramação\ncom\nJava"); |
| \t | Insere tabulação na horizontal | System.out.println("Col A\t Col B\t Col C\t Col D"); |
| \\ | Insere barra invertida | System.out.println("C:\\Windows\\system64"); |
| \" | Insere aspa dupla | System.out.println("Nome do livro \"Dom Quixote\" de Miguel de Cervantes"); |
| \r | Realiza retorno | System.out.println("Texto não mostrado \rEsse texto aparece\n"); |

## Especificadores de formato 
Em resumo, o especificador de formato em Java é usado para definir a formatação de saída de dados, 
permitindo controlar a aparência dos valores exibidos ou impressos.

| **Especificador** | **Descrição** | **Exemplo de utilização** | **Saída** |
|---------------|-----------|-----------------------|-------|
| %d | Valor inteiro em decimal com sinal (pode ser usado para byte, short, int e long) | System.out.print("%d", 127); | 127 |
| %o | Valor inteiro em octal com sinal | System.out.print("%o", 127); | 177 |
| %x | Valor inteiro em hexadecimal com sinal (minusculo) | System.out.printf("%x", 127); | 7f |
| %X | Valor inteiro em hexadecimal com sinal (maiusculo) | System.out.printf("%X", 127); | 7F |
| %f | Valor real (float ou double) | System.out.printf("%f", 3,141592); | 3,141592 |
| %e | Valor real (notação exponencial) (minusculo) | System.out.printf("%e, 3,14); | 3,14e+00 |
| %E | Valor real (notação exponencial) (maiusculo) | System.out.printf("%E, 3,14); | 3,14E+00 |
| %b | Valor lógico (boolean) (minusculo) | System.out.printf("%b, 3 > 2); | true |
| %B | Valor lógico (boolean) (maiusculo) | System.out.printf("%B, 2 > 3); | FALSE |

## Estrutura de pasta - visão geral

| **Diretório** | **Descrição do Conteúdo** |
|-----------|-----------------------|
| src/ | Código fonte da aplicação |
| test/ | Código de teste unitário |
| lib/ | Dependências do projeto |
| dist/ | Arquivos de distribuição como .jar e suas dependências |
| build/ | Arquivos gerados pelo processo de compilação |

## Tipos de comentários
Em uma única linha utiliza-se o comando "//" para inserção do comentário. 

```
Exemplo: //Este é um comentário de linha única
```

Em blocos utiliza-se o comando "/* conteúdo * /" para inserção de comentários.

```
Exemplo: /* Este
         * É
         * Um
         * Exemplo
         */
         
``` 

## Arrays unidimensionais (Vetores)
Arrays unidimensionais em Java são estruturas de dados que permitem armazenar e acessar uma 
coleção de elementos do mesmo tipo. Eles são usados para representar conjuntos de valores relacionados, 
que podem ser do tipo primitivo (como inteiros, caracteres, etc.) ou do tipo de objeto.

Em resumo, os arrays unidimensionais em Java são estruturas de dados que permitem armazenar 
e manipular uma coleção de elementos do mesmo tipo, acessíveis por meio de índices. 
Eles fornecem uma maneira eficiente de trabalhar com conjuntos de valores relacionados.

```
EXEMPLO DE VETOR: 
| 6 | 3 | 5 | 2 | 8 | 

  0   1   2   3   4 
```

### Criando vetores 
| **Operação sobre vetores** | **Exemplo de código** |
|----------------------------|-----------------------|
| Declaração de um vetor | *tipo* nomeVetor[]; |
| Alocação de espaço de um vetor | nomeVetor = *new tipo* [tamanho]; |
| Declaração e alocação de um vetor | *tipo* nomeVetor[] = *new tipo*[tamanho]; |
| Acesso de uma posição do vetor | nomeVetor[indice]; |
| Atribuição de um valor a uma posição | nomeVetor[indice] = valor; |
| Acesso ao tamanho de um vetor | nomeVetor.length | 

## Arrays multidimensionais (Matrizes)
Arrays multidimensionais em Java são estruturas de dados que permitem armazenar e acessar elementos em várias dimensões.
Ao contrário dos arrays unidimensionais, que são representados por uma única sequência de elementos, os arrays 
multidimensionais têm várias dimensões, como uma tabela ou matriz.

Em resumo, os arrays multidimensionais em Java permitem armazenar e acessar coleções de elementos organizados 
em várias dimensões, como matrizes ou estruturas tabulares. Eles fornecem uma maneira eficiente de trabalhar 
com dados estruturados em várias dimensões.

```
EXEMPLO DE MATRIZ: 
| 6 | 3 | 5 | 2 | 8 |     0
| 4 | 2 | 3 | 1 | 6 |     1

  0   1   2   3   4 
```

### Criando matrizes

|          Operação sobre Matrizes             |              Exemplo de código               |
| -------------------------------------------- | -------------------------------------------- |
| Declaração de uma matriz                     | *tipo* nomeMatriz[][];                         |
| Alocação de espaço de uma matriz             | nomeMatriz = *new tipo*[tamX][tamY];           |
| Declaração e alocação de uma matriz          | *tipo* nomeMatriz[][] =  new tipo[tamX][tamY]; |
| Acesso de uma posição da matriz              | nomeMatriz[indiceX][indiceY];                |
| Atribuição de um valor a uma posição         | nomeMatriz[indiceX][indiceY] = valor;        |
| Acesso ao número de linhas                   | nomeMatriz.length;                           |
| Acesso ao número de colunas da i-ésima linha | nomeMatriz[i].length;                        |

Obrigada por você que chegou até aqui ;) 














