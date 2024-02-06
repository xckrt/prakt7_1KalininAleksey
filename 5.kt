fun main()
{
    try {
        var n = readLine()!!.toDouble()
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()
        var d = n - (a + b + c)
        var percentage = d / n * 100
        print("$percentage%")
    }
    catch (e:Exception)
    {
        print("Некорректно введены данные")
    }
}