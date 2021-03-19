package coverage_specs2

import org.specs2.mutable.SpecWithJUnit
import org.specs2.specification.Scope

class TestWithSpecs2WithJUnit extends SpecWithJUnit {
  "testA1" in new Scope {
    A1.a1(true) must_== B1
  }

  "testA2" in new Scope {
    A2.a2()
  }

  "testD1" in new Scope {
    D1.veryLongFunctionNameIsHereAaaaaaaaa()
  }
}
