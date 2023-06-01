codigo_compra = 5222

if codigo_compra == 5222:
    print("Compra à vista")  # Se o código de compra for igual a 5222, exibe a mensagem "Compra à vista"
elif codigo_compra == 5333:
    print("Compra parcelada")  # Caso contrário, se o código de compra for igual a 5333, exibe a mensagem "Compra parcelada"
elif codigo_compra == 5444:
    print("Compra no boleto")  # Caso contrário, se o código de compra for igual a 5444, exibe a mensagem "Compra no boleto"
else:
    print("Código não cadastrado")  # Caso contrário, ou seja, se o código de compra não corresponder a nenhum dos códigos especificados, exibe a mensagem "Código não cadastrado"
