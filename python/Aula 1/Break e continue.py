disciplina = "Linguagem de programação"

print("Vamos ver o uso do break")

# Exemplo de uso do break
for c in disciplina:
    if c == "a":
        break  # Interrompe o loop quando encontra o caractere "a"
    else:
        print(c)  # Imprime o caractere atual se não for "a"

print("Agora vamos ver o continue")

# Exemplo de uso do continue
for c in disciplina:
    if c == "a":
        continue  # Pula para a próxima iteração se o caractere for "a"
    else:
        print(c)  # Imprime o caractere atual se não for "a"
