case class Queue[A](elements:List[A]) {

  def enqueue(element: A): Queue[A] = Queue(elements ::: List(element))

  def dequeue(): Queue[A] = Queue(elements.drop(1))

  def isEmpty: Boolean = elements.isEmpty
}

object Main extends App{

  val queue = Queue(List(5,8))

  val queueAfterEnQ1 = queue.enqueue(4)
  val queueAfterEnQ2 = queueAfterEnQ1.enqueue(3)

  val queueAfterDeQ = queueAfterEnQ2.dequeue()

  println(s"enQ1 = ${queueAfterEnQ1.elements}")
  println(s"enQ2 = ${queueAfterEnQ2.elements}")

  println(s"deQ1 = ${queueAfterDeQ.elements}")
}
