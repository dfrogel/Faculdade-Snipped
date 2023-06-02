def executar_bubble_sort(lista):
    n = len(lista)
    for i in range(n-1):
        for j in range(n-1):
            if lista[j] > lista[j + 1]:
                # Troca os elementos se estiverem fora de ordem
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
    return lista


lista = [10, 8, 7, 3, 2, 1]
ordenada = executar_bubble_sort(lista)
print(ordenada)
