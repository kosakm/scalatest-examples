package specexamples

import org.scalatest.FlatSpec
import fixtures.ScalaFixture

/**
 * From the scalatest website
 * A good first step for teams wishing to move from xUnit to BDD, FlatSpec's structure is flat like xUnit, so simple and familiar, 
 * but the test names must be written in a specification style: "X should Y," "A must B," etc.
 */
class FlatSpecTest extends FlatSpec with ScalaFixture {
  "ScheduleService.create" should "return one more schedule after creating a new schedule" in {
    val sizeBefore = scheduleService.count
    
    scheduleService.createSchedule(schedToCreate)
    
    val sizeAfter = scheduleService.count
    
    assert(sizeBefore < sizeAfter)
  }
}