name := "twitter-kafka-producer"

version := "1.0"

scalaVersion := "2.12.1"

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")

libraryDependencies += "net.cakesolutions" %% "scala-kafka-client" % "0.10.2.0"
