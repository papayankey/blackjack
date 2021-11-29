package com.papayankey.github

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class BlackjackSpec extends AnyFlatSpec {

  "A card" should "be created given a suit and rank" in {
    val expected = s"Card(Diamond, Jack)"
    assertResult(expected) {
      Card(Suit.Diamond, Rank.Jack).toString
    }
  }

  "A deck" should "be initialized with 52 combination of cards" in {
    val expected = 52
    assertResult(52) {
      val deck = Deck(mutable.Stack[Card]())
      deck.initialize
      deck.cards.length
    }
  }

}
