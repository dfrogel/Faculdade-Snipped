import pandas as pd

# Criação de um DataFrame com uma coluna a partir de uma lista
df = pd.DataFrame('Eduarda Gustavo Roberto Rose Alice'.split(), columns=['nome'])
# Neste caso, o parâmetro 'data' recebe uma lista de nomes ['Eduarda', 'Gustavo', 'Roberto', 'Rose', 'Alice'].
# O parâmetro 'columns' é utilizado para definir o nome da coluna no DataFrame. Neste exemplo, a coluna será chamada de 'nome'.
# Os demais parâmetros possuem valores padrão (default).

print(df)
# Output:
#      nome
# 0    Eduarda
# 1    Gustavo
# 2    Roberto
# 3    Rose
# 4    Alice
