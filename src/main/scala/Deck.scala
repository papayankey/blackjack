package com.papayankey.github

import scala.collection.mutable.Stack

/** stores and deals cards */
case class Deck(cards: Stack[Card])

extension (d: Deck)
  def initialize: Deck =
    val stack = Stack[Card]()
    for {
      suit <- Suit.values
      rank <- Rank.values
    } stack.push(Card(suit, rank))
    d.copy(cards = d.cards.concat(stack))    
