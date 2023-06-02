def executar_quicksort(lista, inicio, fim):
    # Verifica se ainda há elementos para ordenar
    if inicio < fim:
        # Encontra o pivô e realiza a partição da lista
        pivo = executar_particao(lista, inicio, fim)
        
        # Ordena as sub-listas à esquerda e à direita do pivô
        executar_quicksort(lista, inicio, pivo-1)
        executar_quicksort(lista, pivo+1, fim)
    
    return lista


def executar_particao(lista, inicio, fim):
    # Seleciona o último elemento como pivô
    pivo = lista[fim]
    
    # Inicializa o índice da posição correta do pivô
    esquerda = inicio
    
    # Percorre os elementos da lista e os coloca na posição correta em relação ao pivô
    for direita in range(inicio, fim):
        if lista[direita] <= pivo:
            # Troca o elemento atual com o da posição correta à esquerda do pivô
            lista[direita], lista[esquerda] = lista[esquerda], lista[direita]
            esquerda += 1
    
    # Coloca o pivô na posição correta
    lista[esquerda], lista[fim] = lista[fim], lista[esquerda]
    
    return esquerda


# Exemplo de uso
lista = [10, 9, 5, 8, 11, -1, 3]
ordenada = executar_quicksort(lista, inicio=0, fim=len(lista)-1)
print(ordenada)
