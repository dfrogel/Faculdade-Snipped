# Objetivo
O objetivo deste projeto é fornecer uma explicação detalhada de conceitos importantes da linguagem Python, por meio de exemplos práticos e demonstrações claras. O foco principal é a compreensão dos conceitos, em vez de apenas fornecer códigos específicos.

Além de oferecer um recurso útil para estudantes, desenvolvedores e entusiastas da linguagem Python, fornecendo exemplos claros e práticos que ajudem a solidificar a compreensão dos conceitos abordados.

<img src="https://media.giphy.com/media/coxQHKASG60HrHtvkt/giphy.gif" alt="gif animado" width="300" height="100">

Sei que é um projeto simples, mas assim como me ajudou no início, espero que possa ajudá-los também. 😉

# Conteúdos
- [Variáveis e Tipos Básicos de Dados](#variáveis-e-tipos-básicos-de-dados-em-python)
- [Operadores Numéricos](#operadores-numéricos)
- [Estruturas Condicionais](#estruturas-condicionais-em-python)
- [Estruturas de Repetição](#estruturas-de-repetição-em-python)
- [Operadores Lógicos](#operadores-lógicos-em-python)
- [Funções Built-In](#funções-built-in-em-python)
- [Funções Definidas Pelo Usuário](#funções-definidas-pelo-usuário)
- [Listas, Tuplas, Sets e Dicionários](#listas-tuplas-sets-e-dicionários-em-python)
- [Algoritmos de Busca](#algoritmos-de-busca)
- [Algoritmos de Ordenação](#algoritmos-de-ordenação)
- [Definições Importantes](#definições-importantes-em-python)
- [Organização em Módulos (Bibliotecas)](#organização-em-módulos-bibliotecas)

# Variáveis e Tipos Básicos de Dados em Python
- As variáveis são usadas para armazenar valores em uma área de memória identificada por um nome. 
- Em Python, o tipo da variável é determinado no momento da atribuição de um valor. 
- Não existem tipos primitivos em Python, pois as variáveis referem-se a valores.

# Operadores Numéricos
Os operadores numéricos em Python permitem realizar operações matemáticas em números. Aqui estão os símbolos utilizados:

- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/)
- Divisão inteira (//)
- Resto da divisão (%)
- Exponenciação (**)
- Incremento (+=)
- Decremento (-=)

# Estruturas Condicionais em Python
As estruturas condicionais permitem executar diferentes blocos de código com base em condições. Em Python, as estruturas condicionais são representadas pelos comandos if, else e elif.

- **if**: Executa um bloco de código se a condição for verdadeira.
- **else**: Executa um bloco de código se a condição do if for falsa.
- **elif**: Executa um bloco de código se uma condição intermediária for verdadeira.

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/802ce865-cd5c-42a9-ac81-75a3bd36f3d6" alt="Condicionais" width="300" height="300">

# Estruturas de Repetição em Python
As estruturas de repetição permitem executar um bloco de código repetidamente. Em Python, as estruturas de repetição são representadas pelos comandos while e for.

- while: Executa um bloco de código enquanto uma condição for verdadeira.
- for: Executa um bloco de código para cada item em uma sequência.
- 
<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/3286b792-162f-43e9-987f-7165c90c7152" alt="Repetições" width="300" height="300">

# Operadores Lógicos em Python
Os operadores lógicos permitem combinar condições em expressões lógicas mais complexas. Em Python, os operadores lógicos são representados por palavras-chave:

- and: Retorna verdadeiro se todas as condições forem verdadeiras.
- or: Retorna verdadeiro se pelo menos uma condição for verdadeira.
- not: Inverte o valor de uma expressão lógica.

# Funções Built-in em Python
As funções built-in em Python são funções integradas no interpretador Python. Algumas das principais funções built-in em Python são:

- print(): Exibe um valor na tela.
- enumerate(): Retorna a posição de um valor em uma sequência.
- input(): Captura um valor digitado pelo usuário.
- int() e float(): Convertem um valor para os tipos inteiro e float, respectivamente.
- type(): Retorna o tipo de um objeto (variável).

# Funções Definidas pelo Usuário
Além das funções built-in, é possível definir funções personalizadas. As funções definidas pelo usuário são criadas usando a palavra-chave "def" seguida pelo nome da função, parênteses para os parâmetros e, opcionalmente, a palavra-chave "return" para retornar um valor.

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/e1b19825-8d3d-48b7-b8e0-d448edea6e6c" alt="Def" width="200" height="200">

# Break e Continue
O break é usado para interromper imediatamente a execução de um loop, enquanto o continue é usado para pular para a próxima iteração do loop sem executar o restante do código para aquela iteração em particular.


# Listas, Tuplas, Sets e Dicionários em Python
Python oferece diversas estruturas de dados para manipulação e organização de informações. Neste texto, abordaremos as principais estruturas: listas, tuplas, sets e dicionários.

## Listas
Uma lista é uma estrutura de dados sequencial e mutável em Python. Ela permite armazenar uma coleção ordenada de elementos, que podem ser de diferentes tipos. Listas são criadas usando colchetes **[]** e os elementos são separados por vírgulas. Veja um exemplo:

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/581fe9f2-d3e1-4134-b594-b3427e1bb5bc" alt="Listas" width="200" height="200">

Além de armazenar elementos, as listas possuem métodos para adicionar, remover, acessar e modificar elementos. Também é possível percorrer uma lista usando loops e aplicar diversas operações sobre ela.

## List comprehension
List Comprehension é uma forma concisa de criar listas em Python a partir de uma sequência existente. É uma construção poderosa que combina loops e condicionais em uma única linha.

A sintaxe básica de uma List Comprehension é:

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/64ffb98d-6a5f-467c-a6f1-e7b0968333b7" alt="List Comprehension" width="200" height="180">

A expressão é aplicada a cada item da sequência que atende à condição. O resultado é uma nova lista contendo os valores resultantes da expressão aplicada a cada item da sequência.

## Tuplas
Uma tupla é uma estrutura de dados sequencial e imutável em Python. Ela é semelhante a uma lista, mas não pode ser modificada após a sua criação. Tuplas são criadas usando parênteses **()** ou simplesmente separando os elementos por vírgulas. Veja um exemplo:

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/ab0376f2-be07-4b1a-a8cc-f52dff749ab8" alt="Tuplas" width="200" height="180">

As tuplas são frequentemente usadas para representar coleções de valores relacionados, como coordenadas geográficas, informações de um ponto no espaço etc. Embora não seja possível modificar uma tupla, é possível acessar seus elementos e realizar operações sobre eles.

## Sets
Um set (conjunto) é uma estrutura de dados não ordenada que armazena elementos únicos. Em um set, a ordem dos elementos não é garantida e não é possível ter elementos duplicados. Sets são úteis quando precisamos verificar a presença de um elemento em uma coleção ou quando queremos eliminar duplicatas de uma sequência.

Em Python, sets são criados usando chaves **{}** ou a função **set()**. Veja um exemplo:

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/f8a02804-fa02-4afc-aea6-86248111911d" alt="Set" width="300" height="200">

Os sets suportam operações de conjuntos, como união, interseção e diferença. Também é possível adicionar e remover elementos de um set.

## Dicionários
Um dicionário é uma estrutura de dados que armazena pares de chave-valor. Em vez de acessar os elementos por uma posição numérica, como em uma lista, os elementos de um dicionário são acessados por meio de suas chaves. Dicionários são úteis para representar estruturas de dados complexas e associar informações relacionadas.


Dicionários em Python são criados usando chaves **{}** e os pares de chave-valor são especificados usando **chave: valor**. Veja um exemplo:

<img src="https://github.com/dfrogel/Faculdade-Snipped/assets/129911019/729de247-4415-432d-ba4f-c9743badbb84" alt="Dicionario" width="300" height="200">

Podemos acessar os valores de um dicionário usando suas chaves e também podemos adicionar, modificar ou remover elementos. Dicionários são flexíveis e permitem armazenar diferentes tipos de valores como chaves e valores.

# Algoritmos de Busca
Algoritmos de busca são usados para encontrar um elemento específico em uma estrutura de dados. Em Python, existem vários algoritmos de busca com diferentes abordagens. Alguns dos algoritmos de busca comuns são:

## Busca Linear
A busca linear percorre sequencialmente os elementos da estrutura até encontrar o valor desejado ou percorrer todos os elementos. Ela começa pelo primeiro elemento e continua até encontrar o valor desejado ou percorrer toda a estrutura. É um método simples, mas menos eficiente em estruturas grandes, pois requer percorrer todos os elementos mesmo que o valor desejado esteja no início da estrutura.

<img src="https://camo.githubusercontent.com/5cfe6f9610708af79ad630ab47faf788eb600b6dfe543903492675780aecc11d/68747470733a2f2f7777772e7475746f7269616c73706f696e742e636f6d2f646174615f737472756374757265735f616c676f726974686d732f696d616765732f6c696e6561725f7365617263682e676966" alt="gif animado" width="300" height="100">


## Busca Binária
A busca binária é aplicada em estruturas ordenadas, como uma lista ordenada. Ela divide repetidamente a estrutura pela metade, comparando o valor desejado com o elemento central, até encontrar o valor ou determinar que ele não está presente. A busca binária é eficiente e geralmente é muito mais rápida do que a busca linear, especialmente em estruturas grandes.

<img src="https://i.stack.imgur.com/R5kJk.gif" alt="gif animado" width="300" height="100">

## Busca em Árvore
A busca em árvore é usada em estruturas de árvore para localizar um elemento. A estrutura de árvore permite organizar os elementos de forma hierárquica. A busca em árvore segue as ramificações da árvore de acordo com as comparações entre os valores, percorrendo o caminho adequado até encontrar o valor desejado. A busca em árvore é amplamente utilizada em estruturas como árvores binárias de busca e árvores de decisão.

<img src="https://pythonhelp.files.wordpress.com/2015/01/image11.gif" alt="gif animado" width="300" height="300">

# Algoritmos de ordenação
Algoritmos de ordenação são usados para organizar os dados em uma sequência específica, como ordem numérica ou alfabética. Existem vários algoritmos de ordenação com diferentes abordagens e complexidades. Alguns dos algoritmos de ordenação mais comuns são:

## Insertion Sort (Ordenação por Inserção)
O algoritmo de ordenação por inserção é baseado na ideia de inserir cada elemento da lista em sua posição correta em uma sublista ordenada. Ele percorre a lista da esquerda para a direita, comparando cada elemento com os elementos à esquerda e movendo-os uma posição para a direita, se necessário. O algoritmo continua até que todos os elementos estejam em suas posições corretas.

<img src="https://markmoylan.gitbooks.io/csp-java/content/static/algorithms/Algorithms_Insertion_Sort_Example.gif" alt="gif animado" width="300" height="100">

## Selection Sort (Ordenação por Seleção)
O algoritmo de ordenação por seleção funciona selecionando repetidamente o menor elemento da lista e movendo-o para a posição correta. Ele divide a lista em duas partes: uma parte ordenada e uma parte não ordenada. A cada iteração, encontra o menor elemento da parte não ordenada e o coloca na posição correta na parte ordenada. O processo continua até que todos os elementos estejam em suas posições corretas.

<img src="https://markmoylan.gitbooks.io/csp-java/content/static/algorithms/Algorithms_And_Recursion_Selection_Sort_Example.gif" alt="gif animado" width="300" height="100">

## Bubble Sort (Ordenação por Bolha)
O algoritmo de ordenação por bolha percorre a lista várias vezes, comparando elementos adjacentes e trocando-os se estiverem na ordem errada. A ideia é "flutuar" os elementos maiores para o final da lista, gradualmente movendo os elementos menores para o início. O processo continua até que a lista esteja completamente ordenada.

<img src="https://stackabuse.s3.amazonaws.com/media/bubble-sort-in-java-1.gif" alt="gif animado" width="300" height="100">

## Merge Sort (Ordenação por Mesclagem)
O algoritmo de ordenação merge sort é baseado no princípio "dividir para conquistar". Ele divide repetidamente a lista em duas metades, ordena cada metade separadamente e, em seguida, mescla as duas metades ordenadas para obter uma lista ordenada. Esse processo é realizado recursivamente até que a lista esteja completamente ordenada.

<img src="https://markmoylan.gitbooks.io/csp-java/content/static/algorithms/Algorithms_and_Recursion_Mergesort_Example.gif" alt="gif animado" width="300" height="100">

## Quick Sort (Ordenação Rápida)
O algoritmo de ordenação quick sort é baseado no princípio de "dividir para conquistar" e usa a estratégia de "pivô". Ele seleciona um elemento como pivô e divide a lista em duas partes: uma parte com elementos menores que o pivô e outra parte com elementos maiores que o pivô. Em seguida, o processo é aplicado recursivamente às duas partes. O quick sort é eficiente e geralmente mais rápido que outros algoritmos de ordenação.

<img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/Quicksort-example.gif" alt="gif animado" width="300" height="100">

# Definições Importantes em Python
A seguir estão algumas definições importantes relacionadas à programação em Python:

## Objetos
Em Python, um programa orientado a objetos é composto por uma coleção de objetos. Um objeto é uma instância de uma classe e representa uma entidade que possui atributos (dados) e métodos (comportamentos).

## Classe
Uma classe é um modelo ou uma estrutura que define as características e comportamentos que um objeto do tipo dessa classe terá. É como um plano ou uma descrição para criar objetos. As classes são usadas para organizar dados e funcionalidades relacionadas em um único bloco.

## Instância
Uma instância é um objeto específico criado a partir de uma classe. É a existência física de um objeto em memória.

## Atributos 
Os atributos são os dados armazenados em um objeto que representam o estado do objeto. Eles são as características que diferenciam os objetos. Os atributos podem ser variáveis ou propriedades associadas a um objeto.

## Métodos
Os métodos são os comportamentos de um objeto, ou seja, as ações que um objeto pode realizar. Eles são as funções definidas dentro de uma classe que operam em objetos daquela classe. Os métodos permitem que os objetos executem tarefas específicas e interajam com seus atributos e outros objetos. 

## Encapsulamento
O encapsulamento é a combinação de atributos e métodos dentro de uma mesma entidade, a classe. É a prática de ocultar certos detalhes de implementação de um objeto e fornecer uma interface para interagir com ele. Em Python, o encapsulamento é alcançado por meio do uso de modificadores de acesso, como atributos privados e métodos públicos.

## Construtor da Classe - __init__()
O método **__init__()** é um construtor especial em Python que é chamado automaticamente quando um objeto é criado a partir de uma classe. Ele é usado para inicializar os atributos de um objeto com valores iniciais. O parâmetro **self** é usado para referenciar o objeto sendo criado.

# Organização em Módulos (Bibliotecas)
Os módulos em Python são arquivos que contêm definições de classes, funções e variáveis relacionadas a um determinado assunto. Eles são usados para organizar o código em unidades lógicas e reutilizáveis. Os módulos podem ser importados e usados em outros programas Python.

## Bibliotecas
As bibliotecas em Python são conjuntos de módulos que fornecem funcionalidades específicas para tarefas comuns. Existem bibliotecas built-in, que são fornecidas com a instalação do interpretador Python, e bibliotecas de terceiros, que são criadas por desenvolvedores externos e disponibilizadas para uso geral.

## Como utilizar um módulo
Para usar um módulo em um programa Python, ele precisa ser importado. A importação de módulos pode ser feita de diferentes maneiras, como **import modulo, import modulo as alias ou from modulo import item**. Essas formas de importação permitem acessar as funcionalidades do módulo e usá-las em um programa.

## Classificação dos Módulos (Bibliotecas)
Os módulos em Python podem ser classificados em três categorias principais: módulos built-in, módulos de terceiros e módulos próprios. Cada uma dessas categorias desempenha um papel importante na organização e reutilização de código.

### Módulos Built-in
Os módulos built-in são aqueles que fazem parte da biblioteca padrão do Python e são embutidos no interpretador Python. Eles são fornecidos juntamente com a instalação do Python e oferecem funcionalidades essenciais para tarefas comuns. Alguns exemplos de módulos built-in são:

- **math**: fornece funções matemáticas e operações numéricas avançadas.
- **os**: fornece funcionalidades relacionadas ao sistema operacional, como manipulação de arquivos, acesso ao ambiente do sistema, etc.
- **datetime**: fornece classes para manipulação de datas, horas e intervalos de tempo.
- **random**: fornece funções para geração de números aleatórios.
- **re**: fornece suporte a expressões regulares para manipulação de texto.

Esses módulos built-in são amplamente utilizados e são uma parte fundamental da biblioteca padrão do Python.

### Módulos de Terceiros
Os módulos de terceiros são bibliotecas desenvolvidas por terceiros e disponibilizadas através do Python Package Index (PyPI) ou de outros repositórios. Essas bibliotecas contêm funcionalidades específicas que podem ser úteis para diferentes propósitos, desde análise de dados até desenvolvimento web. Alguns exemplos populares de módulos de terceiros são:

- **numpy**: biblioteca para computação numérica com suporte a arrays multidimensionais e funções matemáticas avançadas.
- **pandas**: biblioteca para manipulação e análise de dados, oferecendo estruturas de dados flexíveis e eficientes.
- **matplotlib**: biblioteca para criação de gráficos e visualização de dados.
- **requests**: biblioteca para fazer requisições HTTP, permitindo a comunicação com APIs e acesso a recursos na web.
- **django**: framework web completo e poderoso para desenvolvimento rápido de aplicações web.
Esses módulos de terceiros ampliam as funcionalidades do Python e permitem a criação de soluções mais complexas e especializadas.

### Módulos Próprios
Os módulos próprios são aqueles criados pelos desenvolvedores para seus próprios projetos. Eles são usados para organizar o código em unidades lógicas e reutilizáveis dentro de um projeto específico. Os módulos próprios podem conter classes, funções e variáveis relacionadas a um determinado domínio ou funcionalidade. Ao criar módulos próprios, os desenvolvedores podem encapsular a lógica do programa e facilitar a manutenção e expansão do código.

A criação de módulos próprios é uma prática comum na programação Python, permitindo a modularização e reutilização do código em diferentes partes do projeto.


Obrigada por chegar até aqui 🥰
