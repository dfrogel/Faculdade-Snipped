def executar_selection_sort(lista):
    n = len(lista)
    
    for i in range(0, n-1):
        min = i  # Índice do elemento mínimo atualmente encontrado

        # Encontra o índice do menor elemento na parte não ordenada da lista
        for j in range(i+1, n):
            if lista[j] < lista[min]:
                min = j

        # Troca o elemento mínimo com o elemento na posição atual (i)
        lista[i], lista[min] = lista[min], lista[i]

    return lista


lista = [10, 8, 7, 3, 2, 1]
ordenada = executar_selection_sort(lista)
print(ordenada)
