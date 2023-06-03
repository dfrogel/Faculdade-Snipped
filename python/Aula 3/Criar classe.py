class PrimeiraClasse:
    def __init__(self, nome):
        self.nome = nome
        # O método __init__ é um construtor que é chamado quando um objeto da classe é criado.
        # Ele recebe o parâmetro 'nome' e o atribui à variável de instância 'self.nome'.

    def imprimir_mensagem(self):
        print("Olá, seja bem-vindo(a),", self.nome + "!")
        # O método imprimir_mensagem() imprime uma mensagem de boas-vindas com o nome fornecido.
        # Ele acessa o valor da variável de instância 'self.nome' e concatena com a mensagem.

# Exemplo de uso:
classe_objeto = PrimeiraClasse("Eduarda")
classe_objeto.imprimir_mensagem()
# Output: Olá, seja bem-vindo(a), Eduarda!
