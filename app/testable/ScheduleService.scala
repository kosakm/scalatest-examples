package testable


case class Schedule(site: Int, employees: List[Int], name: String)

class ScheduleService(dao: DAO[Schedule]) {
  
  def getSchedule(siteId: Int): Option[Schedule] = {
    dao.findById(siteId)
  }
  
  def createSchedule(s: Schedule) = {
    dao.create(s)
  }
  
  def count(): Int = {
    dao.findAll.length
  }
 
}