package com.papayankey.github

import org.scalatest.flatspec.AnyFlatSpec

class BlackjackSpec extends AnyFlatSpec {

  "A card" should "be created given a suit and rank" in {
    val expected = s"Card(Diamond, Jack)"
    assertResult(expected) {
      Card(Suit.Diamond, Rank.Jack).toString
    }
  }

}
