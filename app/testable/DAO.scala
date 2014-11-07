package testable

trait DAO[T] {
  
  def findById(id: Int): Option[T]

  def findAll(): List[T]

  def create(model: T): Boolean
}