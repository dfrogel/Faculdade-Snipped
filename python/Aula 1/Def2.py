def converter_maiuscula(texto, flag_maiuscula):
    """
    Converte o texto para maiúsculas ou minúsculas com base na flag de maiúsculas.

    Args:
        texto (str): O texto a ser convertido.
        flag_maiuscula (bool): Indica se o texto deve ser convertido para maiúsculas (True) ou minúsculas (False).

    Returns:
        str: O texto convertido.
    """
    if flag_maiuscula:
        return texto.upper()
    else:
        return texto.lower()

texto = converter_maiuscula(texto="Eduarda", flag_maiuscula=True)  # Passagem nominal de parâmetros
print(texto)
