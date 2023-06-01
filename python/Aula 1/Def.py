def calcular_desconto(valor, desconto=0):
    """
    Calcula o valor com desconto baseado no valor original e na taxa de desconto.

    Args:
        valor (float): O valor original.
        desconto (float, optional): O valor do desconto em porcentagem. Valor default é 0.

    Returns:
        float: O valor com o desconto aplicado.
    """
    valor_com_desconto = valor * (1 - desconto)
    return valor_com_desconto

valor1 = calcular_desconto(100)  # Não aplicar nenhum desconto
valor2 = calcular_desconto(100, 0.25)  # Aplicar desconto de 25%

print(f"\nPrimeiro valor a ser pago: R${valor1:.2f}")
print(f"\nSegundo valor a ser pago: R${valor2:.2f}")
