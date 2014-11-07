package Fake

import testable.DAO
import testable.Schedule

class FakeScheduleDAO extends DAO[Schedule] {
  var models = List[Schedule]()

  def findById(siteId: Int): Option[Schedule] = {
    models.filter((x: Schedule) => (x.site == siteId)).headOption
  }

  def findAll(): List[Schedule] = {
    models
  }

  def create(s: Schedule): Boolean = {
    if (models.contains(s)) throw new Exception("Unique Constraint Violated") //violates unique constraint
    else {
      models = models ++ List(s)
      true
    }
  }
}