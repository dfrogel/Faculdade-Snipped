def executar_merge(esquerda, direita):
    # Cria uma lista vazia para armazenar a sub-lista ordenada
    sub_lista_ordenada = []
    
    # Variáveis para rastrear a posição atual nas listas esquerda e direita
    topo_esquerda, topo_direita = 0, 0
    
    # Combina as sub-listas ordenadas em uma única sub-lista ordenada
    while topo_esquerda < len(esquerda) and topo_direita < len(direita):
        if esquerda[topo_esquerda] <= direita[topo_direita]:
            sub_lista_ordenada.append(esquerda[topo_esquerda])
            topo_esquerda += 1
        else:
            sub_lista_ordenada.append(direita[topo_direita])
            topo_direita += 1
    
    # Adiciona os elementos restantes da lista esquerda, se houver
    sub_lista_ordenada += esquerda[topo_esquerda:]
    
    # Adiciona os elementos restantes da lista direita, se houver
    sub_lista_ordenada += direita[topo_direita:]
    
    # Retorna a sub-lista ordenada resultante
    return sub_lista_ordenada

def executar_merge_sort(lista):
    # Caso base: se a lista tiver tamanho 0 ou 1, está ordenada por definição
    if len(lista) <= 1:
        return lista
    
    # Divide a lista em duas partes, aproximadamente do mesmo tamanho
    meio = len(lista) // 2
    esquerda = executar_merge_sort(lista[:meio])  # Ordena recursivamente a sub-lista esquerda
    direita = executar_merge_sort(lista[meio:])  # Ordena recursivamente a sub-lista direita
    
    # Combina as sub-listas ordenadas usando a função executar_merge
    return executar_merge(esquerda, direita)

# Exemplo de uso
lista = [10, 8, 7, 8, 3, 2, 1]
ordenada = executar_merge_sort(lista)
print(ordenada)
