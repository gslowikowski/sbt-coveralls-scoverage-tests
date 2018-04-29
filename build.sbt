version := "0.1"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.4")

libraryDependencies += "org.specs2" %% "specs2" % "2.5" % "test"

coverageMinimum := 60

coverageFailOnMinimum := true
