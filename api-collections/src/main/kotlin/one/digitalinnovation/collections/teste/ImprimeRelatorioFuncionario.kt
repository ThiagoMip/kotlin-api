package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            print(
                funcionario.toString()
            )
        }
    }
}