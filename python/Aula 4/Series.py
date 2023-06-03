import pandas as pd

# Criação de uma Series com o valor 'a'
series1 = pd.Series(data=5)
print(series1)
# Output: 
# 0    5
# dtype: int64

# Criação de uma Series com uma lista de nomes
series2 = pd.Series('Howard Ian Peter Jonah Kellie'.split())
print(series2)
# Output:
# 0    Howard
# 1       Ian
# 2     Peter
# 3     Jonah
# 4    Kellie
# dtype: object

