package model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val name:String,
    val age:Int,
    val address:String
)

val users= listOf(
    User("Ted Omino",25,"Mbita"),
    User("Israel Omino",21,"Langata"),
    User("Brayden Omino",11,"Komarock"),
    User("Young Bill Omino",30,"Kitengela"),
    User("Egbert Omino",33,"Langata"),
    User("Valarie Omino",35,"Komarock,Nairobi")
)
