fun main()
{
    try {
    var n = readLine()!!.toInt()
    var m = readLine()!!.toInt()
    var an = readLine()!!.toInt()
    var am = readLine()!!.toInt()
    when (m < n)
    {
        true ->
        {

            var sum = (am + an)/2 * n
            print("Сумма равна $sum")
        }
        false -> print("Условие не выполняется")

    }
    }
    catch(e:Exception)
    {
        print("Некорректно введены данные")
    }
}