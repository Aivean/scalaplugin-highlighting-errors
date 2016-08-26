package com.aivean.example02

/**
  *
  * @author <a href="mailto:ivan.zaytsev@webamg.com">Ivan Zaytsev</a>
  *         2016-08-25
  */
object Example02 {

  class Inner1(val foo: Int)

  class Inner2(foo: String) extends Inner1(0) {

    // the most "recent" `foo` definition should be imported
    import foo._



    // calling methods on String `foo` (works ok)
    foo.charAt(0)
    charAt(0)
  }

}
