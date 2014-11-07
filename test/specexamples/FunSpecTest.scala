package specexamples

import org.scalatest.FunSpec
import org.scalatest.Matchers
import tags.SpecExamples
import Fake.FakeScheduleDAO
import testable.Schedule
import fixtures.ScalaFixture
import org.scalactic.Equality
import org.scalatest.tagobjects.CPU
import matchers.ScheduleMatchers


class FunSpecTest extends FunSpec with Matchers with ScalaFixture with ScheduleMatchers {

  describe("The Schedule Service") {
    it("Can create a new schedule", SpecExamples) {
      val addedSched = scheduleService.createSchedule(schedToCreate)

      //Explanations from scalatest on checking equality
      //result should equal(3) // can customize equality
      //result should ===(3) // can customize equality and enforce type constraints
      //result should be(3) // cannot customize equality, so fastest to compile
      //result shouldEqual 3 // can customize equality, no parentheses required
      //result shouldBe 3 // cannot customize equality, so fastest to compile, no parentheses required
      addedSched shouldBe true
    }

    it("Can return the total number of schedules", SpecExamples) {
      val total = scheduleService.count
      
      // Enforces type constraint....Go ahead. change the type
      total should be (1)
      
      // Doesn't enforce type
      // total shouldBe true
    }

    it("Can find a schedule by an ID", SpecExamples) {
      val s = scheduleService.getSchedule(1)
      
      s should be ('defined)
      
      val s1 = Schedule(1, List(), "Bogus String")
      // Custom Matcher
      s.get should matchOnSiteId(schedToCreate)
    }
    
    it("Can do something really cool but resource intensive", CPU) {
      pending
    }
  }
}