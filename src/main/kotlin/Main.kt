import java.util.*

fun main(){
    var y =name("shoes","bags","clothes","scarfs")
    println(y)
    println(cities())
    numbers()
    var x=person("Idaya","Amina","Halima")
    println(x)

}
fun name(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach {city-> println(city.capitalize()) }
}
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    numbers.sort()
    println(numbers.contentToString())

}
fun person(nem1:String,nem2:String,nem3:String){
    println(arrayOf(nem1,nem2,nem3).contentToString())

}