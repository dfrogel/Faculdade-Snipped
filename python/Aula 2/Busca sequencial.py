def busca_sequencial(lista, elemento):
    pos = 0
    encontrado = False
     
    # Percorre a lista enquanto não encontrar o elemento e não ultrapassar o tamanho da lista
    while pos < len(lista) and not encontrado:
        if lista[pos] == elemento:
            encontrado = True
        else:
            pos = pos + 1
  
    return encontrado

# Exemplo de uso da função busca_sequencial
testelista = [2, 10, 8, 15, 18, 20, 12, 1]

# Buscando o elemento 5 na lista
print(busca_sequencial(testelista, 5))  # Saída: False, pois o elemento 5 não está na lista

# Buscando o elemento 15 na lista
print(busca_sequencial(testelista, 15))  # Saída: True, pois o elemento 15 está na lista
