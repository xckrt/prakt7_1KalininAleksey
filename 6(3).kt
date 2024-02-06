
import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.ln
import kotlin.math.E
import kotlin.math.abs
fun main()
{
    try {
        var x = readLine()!!.toDouble()
        var f = (sqrt(abs(x)) * ln(Math.pow(x,x)))/(-5/(4*x)+ Math.pow(E,x/2))
        print("Результат $f")
    }
    catch(e:Exception)
    {
        print("Некорректно введены данные")
    }
}
