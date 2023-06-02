def busca_sequencial_ordenada(lista, elemento):
    pos = 0
    encontrado = False
    para = False
    while pos < len(lista) and not encontrado and not para:
        if lista[pos] == elemento:
            encontrado = True
        else:
            if lista[pos] > elemento:
                break  # Interrompe o loop quando o elemento for maior
            else:
                pos = pos + 1

    return encontrado

# Exemplo de uso da função busca_sequencial_ordenada
testelista = [1, 2, 8, 10, 13, 15, 18, 20]

# Buscando o elemento 5 na lista
print(busca_sequencial_ordenada(testelista, 5))  # Saída: False, pois o elemento 5 não está na lista

# Buscando o elemento 15 na lista
print(busca_sequencial_ordenada(testelista, 15))  # Saída: True, pois o elemento 15 está na lista
