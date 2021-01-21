open class Pessoa constructor(nome: String, altura: Double){
    var nome:String = nome
    var altura:Double = altura
    var dataNasc:Int = 0
    var idade:Int = 0
    private set;

    constructor(nome: String, dataNasc: Int, altura: Double) : this(nome, altura){
        this.dataNasc = dataNasc
        this.idade = calcIdade(dataNasc)
    }

    override fun toString():String{
        return "$nome ($dataNasc, $altura)"
    }

    private fun calcIdade(dataNasc: Int): Int{
        return 2021-dataNasc
    }

}

