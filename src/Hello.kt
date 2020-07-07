fun main(){
    //変数定義
    var arg:Int=1
    val cons:String="Number"
    println(arg)
    println(cons)
    //文字列テンプレート
    val textTemp= "文字列"
    println("$textTemp テンプレート")
    //型変換 toTypeで変換
    val str ="1"
    val intVal: Int =str.toInt()
    println(2 + intVal)
    // nullを?で許容
    var nullOk: String?=null
    println(nullOk)
    // array
    val arrayOfInt: Array<Int> = arrayOf(1,2,3,4,5)
    for (i in arrayOfInt) print("$i,")
}
