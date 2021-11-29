package com.papayankey.github

import scala.collection.mutable.Stack

/** stores and deals cards */
case class Deck(cards: Stack[Card])

extension (d: Deck)
  def initialize: Unit =
    for {
      suit <- Suit.values
      rank <- Rank.values
    } d.copy(cards = d.cards.push(Card(suit, rank)))

