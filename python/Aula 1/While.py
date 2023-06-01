numero = 1

# O loop irá continuar enquanto o número informado for diferente de zero
while numero != 0:
    numero = int(input("Digite um número: "))  # Solicita ao usuário que digite um número e converte para um número inteiro

    # Verifica se o número é par ou ímpar
    if numero % 2 == 0:
        print("O número informado é par.")  # Imprime a mensagem "O número informado é par." se o número for divisível por 2 (resto da divisão é zero)
    else:
        print("O número informado é ímpar.")  # Imprime a mensagem "O número informado é ímpar." se o número não for divisível por 2 (resto da divisão é diferente de zero)

#Neste código, o usuário é solicitado a fornecer um número. 
# O loop while continua enquanto o número informado for diferente de zero. 
# Dentro do loop, o número é verificado para determinar se é par ou ímpar. 
# Se o número for divisível por 2 (resto da divisão por 2 é zero), é considerado par e a mensagem 
# "O número informado é par." é impressa. Caso contrário, a mensagem "O número informado é ímpar." é impressa. 
# O loop continua até que o usuário digite zero, momento em que o programa será encerrado.




