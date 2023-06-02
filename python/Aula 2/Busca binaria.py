def busca_binaria(lista, elemento):
    minimo = 0  # Índice mínimo da parte da lista a ser considerada
    maximo = len(lista) - 1  # Índice máximo da parte da lista a ser considerada
    encontrado = False  # Indica se o elemento foi encontrado

    while minimo <= maximo and not encontrado:
        meio_lista = (minimo + maximo) // 2  # Índice do meio da parte da lista
        if lista[meio_lista] == elemento:  # O elemento está no índice meio_lista
            encontrado = True
        else:
            if elemento < lista[meio_lista]:  # O elemento é menor que o valor do índice meio_lista
                maximo = meio_lista - 1  # Atualiza o índice máximo para buscar na metade inferior
            else:
                minimo = meio_lista + 1  # Atualiza o índice mínimo para buscar na metade superior

    return encontrado

testelista = [1, 2, 8, 10, 13, 15, 18, 20]
print(busca_binaria(testelista, 5))  # Busca pelo elemento 5 na lista
print(busca_binaria(testelista, 15))  # Busca pelo elemento 15 na lista
