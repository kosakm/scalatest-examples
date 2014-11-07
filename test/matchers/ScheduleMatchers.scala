package matchers

import testable.Schedule
import org.scalatest.matchers.Matcher
import org.scalatest.matchers.MatchResult

trait ScheduleMatchers {
  class ScheduleIdMatcher(expected: Schedule) extends Matcher[Schedule] {
    def apply(left: Schedule) = {
      val siteId = left.site
      MatchResult(siteId == expected.site, s"Site ID $siteId did not match ${expected.site}", s"Site ID was $siteId ")
    }
  }
  
  def matchOnSiteId(s: Schedule) = new ScheduleIdMatcher(s)

}