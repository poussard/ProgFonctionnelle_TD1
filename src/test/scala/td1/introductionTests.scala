package td1

import org.scalatest.funsuite.AnyFunSuite
import td1.introduction

class introductionTests extends AnyFunSuite {
  test("syracuse 1") {
    assert(introduction.syracuse(1) === 0)
  }

  test("syracuse 10") {
    assert(introduction.syracuse(10) === 6)
  }

  test("syracuse 50") {
    assert(introduction.syracuse(50) === 24)
  }

  test("fib 20") {
    assert(introduction.fib(20) === 6765)
  }

  test("fib 30") {
    assert(introduction.fib(30) === 832040)
  }

  test("fib 40") {
    assert(introduction.fib(40) === 102334155)
  }

  test("fib_tr 20") {
    assert(introduction.fib_tr(20, 1, 0) === 6765)
  }

  test("fib_tr 30") {
    assert(introduction.fib_tr(30, 1, 0) === 832040)
  }

  test("fib_tr 40") {
    assert(introduction.fib_tr(40, 1, 0) === 102334155)
  }
}
