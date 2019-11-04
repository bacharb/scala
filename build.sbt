lazy val hello = (project in file(".")) .settings(
    name := "optionsX",
    //scalaVersion := "2.13.0",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.25",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.5.25",
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.28",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.9",
    libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
)
