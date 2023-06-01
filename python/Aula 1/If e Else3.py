qtde_faltas = int(input("Digite a quantidade de faltas: "))  # Solicita ao usuário que digite a quantidade de faltas e converte para um número inteiro
media_final = float(input("Digite a média final: "))  # Solicita ao usuário que digite a média final e converte para um número de ponto flutuante

# Verifica as condições para aprovação do aluno
if qtde_faltas <= 5 and media_final >= 7:
    print("Aluno aprovado!")  # Imprime a mensagem "Aluno aprovado!" se a quantidade de faltas for menor ou igual a 5 e a média final for maior ou igual a 7
else:
    print("Aluno reprovado!")  # Imprime a mensagem "Aluno reprovado!" se as condições anteriores não forem atendidas

#Neste código, o usuário é solicitado a fornecer a quantidade de faltas
# e a média final do aluno. Em seguida, um bloco condicional if-else é usado para 
# verificar se o aluno está aprovado ou reprovado com base nas condições estabelecidas. 
# Se a quantidade de faltas for menor ou igual a 5 e a média final for maior ou igual a 7, 
# o aluno é considerado aprovado e a mensagem "Aluno aprovado!" é impressa. 
# Caso contrário, a mensagem "Aluno reprovado!" é impressa.




