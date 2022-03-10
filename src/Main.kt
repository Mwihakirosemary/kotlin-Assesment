fun main (){
    school("codeHive")
     numbers(100,7)
    info("Rose",23)


}
fun school (name: String){
    var cumpus = "codeHive"
    var cmps1 = cumpus[4]
    var cmps2 = cumpus[5]
    var cmps3 = cumpus[6]
    var cmps4 = cumpus[7]
    var stmnt = ("$cmps1$cmps2$cmps3$cmps4")
    println(stmnt)
    statement("Today is a good day")

}
fun numbers (a: Int,B: Int): Int{
    var modulus = a%B
    println(modulus)
    return modulus
}
fun info (p:String,z:Int): String{
    var line = "Hi,my name is $p and I am $z years old."
    println(line)
    return line

}
fun statement (h: String): String{
    var summary = "The length is " +h.length
    println(summary)
    return summary
}