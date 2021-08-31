case class Node(data: Int) {
  var left: Node = null
  var right: Node = null
}

object CountTreeNodes extends App {

  def countNoOfNodes(root: Node): Int = {
    if (root == null) 0
    else countNoOfNodes(root.left) + countNoOfNodes(root.right) + 1
  }

  val root = Node(50)

  root.left = Node(40)
  root.left.left = Node(35)
  root.left.right = Node(45)

  root.right = Node(60)
  root.right.left = Node(55)
  root.right.right = Node(65)

  println(s"No. of nodes in the tree = ${CountTreeNodes.countNoOfNodes(root)}")
}

