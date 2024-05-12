import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.users

external fun require(module:String):dynamic

fun main() {
    println("Hello Kotlin/JS")
    val express=require("express")
    val app=express()
    app.listen(3000) {
        println("Listening on port 3000")
    }
    app.get("/") { _, res ->
        res.send("Hello world")
    }
    app.get("/users") { _, res ->
        res.send(Json.encodeToString(users))
    }
}