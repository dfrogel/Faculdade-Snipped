a = 2
b = 1

# Solicita ao usuário que digite a fórmula geral da equação linear
equacao = input("Digite a fórmula geral da equação linear (a * x + b): ")

# Imprime o tipo da entrada do usuário (equacao)
print(f"\nA entrada do usuário (equacao) é do tipo {type(equacao)}")

# Calcula e imprime o resultado da equação para diferentes valores de x
for x in range(5):
    # Avalia a expressão matemática contida em equacao para o valor atual de x
    y = eval(equacao)

    # Imprime o resultado da equação
    print(f"\nResultado da equação para x = {x} é {y}")
