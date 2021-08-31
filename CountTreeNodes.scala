case class Node(data: Int, left: Option[Node], right: Option[Node])

object CountTreeNodes extends App {

  def countNodes(rootOption: Option[Node]): Int = rootOption match {
    case None => 0
    case Some(root) => countNodes(root.left) + countNodes(root.right) + 1
  }

  val root = Node(
                  50,
                  Some(Node(40, Some(Node(20, None, None)), Some(Node(45, None, None)))),
                  Some(Node(80, Some(Node(55,None, None)), Some(Node(90, Some(Node(70, None, None)) , None))))
                 )

  println(s"No. of nodes in the tree = ${CountTreeNodes.countNodes(Some(root))}")
}

