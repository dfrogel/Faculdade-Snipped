class FuncionarioTecnico:
    nivel = 'Técnico'  # Nível é um atributo da classe, não precisa ser definido no construtor

    def __init__(self, status):
        self.status = status
        # O método __init__ é um construtor que recebe o parâmetro 'status' e o atribui à variável de instância 'self.status'.

func1 = FuncionarioTecnico('Ativo')
func2 = FuncionarioTecnico('Licença Mestrado')

print(func1.nivel)
print(func2.nivel)
print(func1.status)
print(func2.status)
