# Solicita ao usuário que digite o login e a senha
login = input("Digite o seu login: ")
senha = input("Digite sua senha: ")

# Verifica se o login e a senha correspondem a algum conjunto predefinido
if login == "duda01" and senha == "teste01":
    print("Bem-vindo duda01")  # Exibe a mensagem de boas-vindas para o login "duda01"
elif login == "duda02" and senha == "teste02":
    print("Bem-vindo duda02")  # Exibe a mensagem de boas-vindas para o login "duda02"
elif login == "duda03" and senha == "teste03":
    print("Bem-vindo duda03")  # Exibe a mensagem de boas-vindas para o login "duda03"
elif login == "duda04" and senha == "teste04":
    print("Bem-vindo duda04")  # Exibe a mensagem de boas-vindas para o login "duda04"
else:
    print("Login falhou!")  # Exibe a mensagem de falha no login se nenhum dos conjuntos predefinidos corresponder
