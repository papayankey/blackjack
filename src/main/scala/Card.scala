package com.papayankey.github

case class Card(suit: Suit, rank: Rank):
  override def toString: String = s"Card($suit, $rank)"

// Suit represents type of card
enum Suit:
  case Diamond, Club, Spade, Heart

// Rank represents weight of card
enum Rank(val value: Int):
  case Ace extends Rank(11)
  case King extends Rank(10)
  case Queen extends Rank(10)
  case Jack extends Rank(10)
  case Ten extends Rank(10)
  case Nine extends Rank(9)
  case Eight extends Rank(8)
  case Seven extends Rank(7)
  case Six extends Rank(6)
  case Five extends Rank(5)
  case Four extends Rank(4)
  case Three extends Rank(3)
  case Two extends Rank(2)
