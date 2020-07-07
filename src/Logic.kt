fun main(){
    //if
    val a=10
    val b=20
    val max=if(a>b){
        print("a > b")
        a
    }else{
        print("a <= b")
        b
    }
    //
    //for
    val aFor= arrayOf(1,2,3,10,11,12)
    for (i in aFor.indices){
        println("aFor[$i]=${aFor[i]}")
    }
}