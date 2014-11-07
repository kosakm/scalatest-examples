package fixtures

import Fake.FakeScheduleDAO
import testable.Schedule
import testable.ScheduleService

trait ScalaFixture {
    val scheduleService = new ScheduleService(new FakeScheduleDAO)
    val schedToCreate = Schedule(1, List(12, 14, 16), "Schedule 1")
}