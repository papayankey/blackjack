import sbtide.Keys.idePackagePrefix

name := "blackjack"

version := "0.1"

scalaVersion := "3.1.0"

idePackagePrefix := Some("com.papayankey.github")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"