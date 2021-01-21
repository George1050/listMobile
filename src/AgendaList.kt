class AgendaList() {
    var agenda = arrayListOf<Pessoa>()
    val tam:Int = 10

    fun armazenarPessoa(p: Pessoa) {
        if (agenda.size < this.tam) {
            agenda.add(p)
        }else{
            println("Agenda cheia!")
        }
    }

    fun removerPessoa(p: Pessoa){
        if(!agenda.isEmpty()){
            agenda.remove(p)
        }else{
            println("Impossivel remover")
        }
    }

    fun buscarPessoa(nome:String): Pessoa{
        for (i in 0..agenda.size-1){
            var p = agenda.get(i)
            if(p.nome == nome){
                return p
            }
        }
        println("Pessoa não encontrada")
        return Pessoa("Ninguem", 0.0)
    }

    fun printAngenda(){
        if(agenda.isEmpty()) {
            println("Agenda vazia")
        }else{
            for (i in 0..agenda.size-1){
                println(agenda.get(i))
            }
        }
    }

    fun printPessoa(index: Int){
        if(agenda.isEmpty() || index > agenda.size){
            println("Agenda vazia ou indice invalido")
        }else{
            println(agenda.get(index))
        }
    }
}

fun main(){
    val agendaList: AgendaList = AgendaList()

    agendaList.armazenarPessoa(Pessoa("Fulano", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("danado", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("calango", 2010, 170.0))

    var dan = agendaList.buscarPessoa("danado")
    println(dan)
    println()
    agendaList.printPessoa(50)
    agendaList.removerPessoa(dan)

    agendaList.printAngenda()
}

