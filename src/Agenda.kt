class Agenda() {
    val tam:Int = 10
    var agenda = Array<Pessoa?>(tam){null}
    var count = 0

    fun armazenarPessoa(p: Pessoa) {
        if (count < this.tam) {
            agenda.set(count++, p)
        }else{
            println("Agenda cheia!")
        }
    }

    fun removerPessoa(p: Pessoa){
        var j = 0
        if(!(count == 0)){
            for (i in 0..count-1){
                var el = agenda.get(i)
                if (el != null) {
                    if(el.nome == p.nome) {
                        j=i
                        break
                    }
                }
            }
            for (i in j..count-2){
                var el = agenda.get(i+1)
                agenda.set(i, el)
            }
            count--

        }else{
            println("Impossivel remover")
        }
    }

    fun buscarPessoa(nome:String): Pessoa{
        for (i in 0..count-1){
            var p = agenda.get(i)
            if (p != null) {
                if(p.nome == nome){
                    return p
                }
            }
        }
        println("Pessoa não encontrada")
        return Pessoa("Ninguem", 0.0)
    }

    fun printAngenda(){
        if(count == 0) {
            println("Agenda vazia")
        }else{
            for (i in 0..count-1){
                println(agenda.get(i))
            }
        }
    }

    fun printPessoa(index: Int){
        if(count == 0 || index > count){
            println("Agenda vazia ou indice invalido")
        }else{
            println(agenda.get(index))
        }
    }
}

fun main(){
    val agendaList: Agenda = Agenda()

    agendaList.armazenarPessoa(Pessoa("Fulano", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("danado", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("calango", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("Fulano", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("danado", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("calango", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("Fulano", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("danado", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("calango1", 2010, 170.0))
    agendaList.armazenarPessoa(Pessoa("calango", 2010, 170.0))


    var dan = agendaList.buscarPessoa("danado")
    println("buscando danado")
    println(dan)
    println()
    agendaList.printPessoa(9)
    println()
    agendaList.removerPessoa(dan)

    agendaList.armazenarPessoa(Pessoa("jjsaa", 2010, 170.0))

    agendaList.printAngenda()

    agendaList.armazenarPessoa(Pessoa("falha", 2010, 170.0))


}

