import org.specs2.mutable._

class FooSpec extends Specification {

  val foo: Foo = new Foo

  "Foo" should {
    "sum two numbers" in {
      foo.sum(1, 2) mustEqual 3
    }
  }
}
