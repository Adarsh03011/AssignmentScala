import scala.collection.mutable.ListBuffer

object Core_digit {
  def core_digit(a: String,b:Int):Int = {
    var arr = new ListBuffer[Int]
    val char = a.split("")
    for(c <- char){
      arr.append(c.toInt)
    }
    var sum = 0
    for(a <- arr){
      sum += a
    }
    if (sum > 10){
      core_digit(sum.toString,b)
    }else{
      if(b == 1){
        sum
      }
      else{
        sum = sum * b
        core_digit(sum.toString,1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val file = "src/main/resources/Core_data.txt"
    val bufferedSource = scala.io.Source.fromFile(file)
    var a = ""
    var b = 0
    for (lines <- bufferedSource.getLines()) {
      val arr = lines.split(" ")
      a = arr(0)
      b = arr(1).toInt
    }

    println(core_digit(a, b))
    bufferedSource.close()
  }


}
