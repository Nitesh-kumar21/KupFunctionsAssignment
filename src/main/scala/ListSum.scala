class ListSum {

  val sumOfList: Function1[List[Int],Int] = new Function1[List[Int],Int] {
    override def apply(list: List[Int]): Int = list.sum
  }


}
