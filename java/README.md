# Sequências de scape

\n: Insere uma nova linha
System.out.println("Introdução\na\nProgramação\ncom\nJava");

\t: Insere tabulação na horizontal
System.out.println("Col A\t Col B\t Col C\t Col D");

\\: Insere barra invertida
System.out.println("C:\\Windows\\system64");

\": Insere aspa dupla
System.out.println("Nome do livro \"Dom Quixote\" de Miguel de Cervantes");

\r: Realiza retorno 
System.out.println("Texto não mostrado \rEsse texto aparece\n");

# Especificadores de formato

%d Valor inteiro em decimal com sinal (pode ser usado para byte, short, int e long). 
System.out.print("%d", 127); --> Saída:127

%o Valor inteiro em octal com sinal
System.out.print("%o", 127); --> Saída: 177

%x Valor inteiro em hexadecimal com sinal (minusculo)
System.out.printf("%x", 127); --> Saída:7f

%X Valor inteiro em hexadecimal com sinal (maiusculo)
System.out.printf("%X", 127); --> Saída:7F

%f Valor real (float ou double)
System.out.printf("%f", 3,141592); --> Saída:3,141592

%e Valor real (notação exponencial) (minusculo)
System.out.printf("%e, 3,14); --> Saída:3,14e+00

%E Valor real (notação exponencial) (maiusculo)
System.out.printf("%E, 3,14); --> Saída:3,14E+00

%b Valor lógico (boolean) (minusculo)
System.out.printf("%b, 3 > 2); --> Saída:true

%B Valor lógico (boolean) (maiusculo)
System.out.printf("%B, 2 > 3); --> Saída: FALSE

# Estrutura de pasta - visão geral

src/ Código fonte da aplicação

test/ Código de teste unitário

lib/ Dependências do projeto

dist/ Arquivos de distribuição como .jar e suas dependências

build/ Arquivos gerados pelo processo de compilação

# trechos de códigos que lançam exceções

int divPor0 = 5/0; --> ArithmeticException
Lançada quando uma condição aritmética excepcional ocorre

int valorStr =  Integer.parseInt("A"); --> NumberFormatException
Lançada para indicar que a aplicação tentou converter um valor em algum tipo númerico, mas o valor não possui o formato apropriado

int refNull = Integer.parseInt(null); --> NullPointerException
Lançada quando uma aplicação tenta usar um objeto null quando uma instância de objeto é necessária 

String indiceNegativo = args[-1]; --> ArrayIndexOutOfBoundsException
Lançada para indicar que um vetor foi acessado com um índice ilegal, como valor negativo ou maior ao tamanho do vetor

System.out.printf("%d", "5"); --> IllegalFormatConversionException

Scanner sc = new Scanner(System.in); --> InputMismatchException
