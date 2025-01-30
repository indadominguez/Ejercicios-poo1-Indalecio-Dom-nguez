class Rectangulo(val base: Double,val altura: Double){

    init {
        require(base > 0) { "La base debe de ser mayor que 0"}
        require(altura > 0){ "La altura debe de ser mayor que 0"}

    }


    fun area(): Double {
        return base * altura
    }

    fun perimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Rectángulo(base=$base, altura=$altura"
    }
}