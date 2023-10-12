object Exam_data extends App{

  val file = "src/main/resources/Exam_data.txt"
  val bufferedSource = scala.io.Source.fromFile(file)

  for(lines <- bufferedSource.getLines()){
    val arr = lines.split(", ")
    if (arr(0).toInt * arr(1).toInt <= arr(2).toInt){
      println(1)
    } else println(0)
  }
  bufferedSource.close()
}
