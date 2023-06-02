def executar_insertion_sort(lista):
    n = len(lista)
    for i in range(1, n):
        valor_inserir = lista[i]  # Armazena o valor atual a ser inserido na posição correta
        j = i - 1

        while j >= 0 and lista[j] > valor_inserir:
            lista[j + 1] = lista[j]  # Desloca os elementos maiores para a direita
            j -= 1

        lista[j + 1] = valor_inserir  # Insere o valor na posição correta

    return lista


lista = [10, 8, 7, 3, 2, 1]
ordenada = executar_insertion_sort(lista)
print(ordenada)
