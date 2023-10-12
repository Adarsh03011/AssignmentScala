object Thief_data extends App {

  val file = "src/main/resources/Thief_data.txt"
  val bufferedSource = scala.io.Source.fromFile(file)
  for(lines <- bufferedSource.getLines()){
    val arr = lines.toCharArray
    var count = 1
    var flag = arr(0) != '1'
    for(c <- arr){
      if(flag && c == '1'){
        count +=  1
        flag = false
      }
      if (!flag && c == '0') {
        count += 1
        flag = true
      }
    }
    println(count)
  }
}
