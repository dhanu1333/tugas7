fun main() {

    val elda : Human = Human("Dhanu Eko Pramono")
    val dito : Human = Human("Dito")

    dhanu.email = "dhanu@gmail.com"
    dhanu.address = "Pacitan, Jawa Timur"

    andi.email = "dito@gmail.com"
    andi.address = "sleman, Yogyakarta"

    dhanu.talk()
    dito.talk()

    dhanu.introduce()

    println(dhanu.verify("dhanu@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(dhanu)
}