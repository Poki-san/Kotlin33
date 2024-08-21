//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    loveBook("BioShock: Восторг")
    loveBook(null)
    println("\nЗадание 2")
    val n = DivideIfWhole(6, 3)
    if (n==null) println("Число не делится на цело")
    else println("Число делится на цело: $n раз")
    println("Число делится на цело: ${DivideIfWhole(7, 3)?:0} раз")
    println("\nЗадание 3")
    val array = arrayOf("Привет","как", null, "дела")
    val arrayTwo = clearNullArray(array)
    println("Было")
    array.forEach { el -> print("$el ") }
    println("\nРезультат")
    arrayTwo.forEach { el -> print("$el ") }
}
fun loveBook(title:String?){
    if (!title.isNullOrEmpty()) println("Моя любимая книга - $title")
    else println("У меня нет любимой книги")
}
fun DivideIfWhole(one:Int?, two:Int?): Int? {
    if (one == null || two==null) return null
    return if (one % two == 0) one / two
    else null
}
fun <T> clearNullArray(array: Array<T?>): Array<out Any> {
    val list = arrayListOf<T>()
    for(i in array) if (i != null)list.add(i)
    return list.toArray()
}