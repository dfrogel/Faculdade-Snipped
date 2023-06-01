## Variáveis e tipos básicos de dados em Python
As variáveis são usadas para armazenar valores, como números, texto ou outros tipos de dados, em uma área de memória identificada por um nome. Isso permite que os dados sejam acessados e manipulados durante a execução do programa.

Muitas linguagens de programação possuem variáveis com tipo primitivo, como int, ou string – em Python esses tipos primitivos não existem. 

Na linguagem Python, o tipo de variável é identificado no momento que se atribui um valor a ela. Portanto, uma variável refere-se a um valor.

## Operadores numéricos
Os operadores numéricos em Python são símbolos especiais que permitem realizar operações matemáticas em números. Aqui está uma explicação bem resumida dos operadores numéricos em Python:

| **Operador** | **Símbolo** | **Descrição** | 
|----------|---------|-----------|
| Adição   | + | Realiza a adição entre dois números |
| Subtração | - | Realiza a subtração entre dois números |
| Multiplicação | * | Realiza a multiplicação entre dois números |
| Divisão | / | Realiza a divisão entre dois números |
| Divisão inteira | // | Realiza a divisão inteira entre dois números |
| Resto da divisão | % | Retorna o resto da divisão entre dois números |
| Exponenciação | ** | Realiza a exponenciação de um número elevado a outro |
| Incremento | += | Incrementa o valor de uma variável com outro valor |
| Decremento | -= | Decrementa o valor de uma variável com outro valor |

## Estruturas condicionais em Python
Em Python o comando para as estrutura condicional é dada por if, else, elif.

### If (se)
Estrutura de condição que avalia uma expressão executando caso essa seja verdadeira. Estrutura:

```
if .....:
 print (....)

``` 

### Else (senão)
Instrução dependente que completa a estrutura if executada quando expressão não ser satisfatória (falsa). Estrutura: 

```
else .....:
 print (....)

```

### Elif
Abreviação do else if executa expressões intermediárias. Estrutura:

```
elif .....:
 print (....)

```

## Estruturas de repetição em Python: while e for
Essas estruturas são criadas para a necessidade de se executar várias vezes o mesmo trecho de código.

### While (enquanto)
Permite que um conjunto de instruções seja executada enquanto uma condição for verdadeira. 

```
while .....:
 print (....)

```
### For
Executa uma instrução por uma certa quantidade de vezes.

```
for .....:
 print (....)

```

## Estruturas lógicas em Python
Em Python utilizamos operadores booleanos para construir estruturas de decisões mais complexas.

### And
Retorna verdadeiro quando ambos A e B forem verdadeiros

### OR
Retorna verdadeiro retorna Verdadeiro (TRUE), se A ou B ou ambos forem verdadeiros (TRUE).

### NOT
Retorna verdadeiro (TRUE) se A for falso. Ou retorna falso, quando A for verdadeiro.

## Funções built-in em Python
Uma função built-in é um objeto que está integrado ao núcleo do interpretador Python. Ou seja, não precisa ser feita nenhuma instalação adicional, já está pronto para uso. O interpretador Python possui várias funções disponíveis.

Algumas das principais: 

| **Função** | **Descrição** |
|------------|---------------|
| print() | Usada para imprimir um valor na tela |
| enumarate() | Usada para retornar a posição de um valor em uma sequência |
| input() | Usada para capturar um valor digitado no teclado |
| int() e float() | Usadas para converter um valor no tipo inteiro ou float | 
| type() | Usada para saber qual é o tipo de um objeto (variável) | 

## Função definidas pelo usuário
Além das Funções built-in, muitas vezes as soluções exigem a implementação de funções específicas, as quais são chamadas de funções definidas pelo usuário. 

A sintaxe de uma função em Python é feita com:

- A palavra reservada def
- O nome da função
- Os parênteses que indicam se existem ou não parâmetros para a função
- E o comando return (que é opcional)