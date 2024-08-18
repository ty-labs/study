name := "learning-spark"
scalaVersion in ThisBuild := "2.12.18"

lazy val commonDependencies = Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.spark" %% "spark-core" % "3.0.0"
)

// PROJECTS
lazy val root = project
  .in(file("."))
  .aggregate(
    ch2,
    ch3
  )

lazy val ch2 = project
  .in(file("ch2"))
  .settings(
    name := "ch2",
    libraryDependencies ++= commonDependencies,
    artifactName := { (_: ScalaVersion, _: ModuleID, artifact: Artifact) =>
      f"ch2.${artifact.extension}"
    }
  )

lazy val ch3 = project
  .in(file("ch3"))
  .settings(
    name := "ch3",
    libraryDependencies ++= commonDependencies,
    artifactName := { (_: ScalaVersion, _: ModuleID, artifact: Artifact) =>
      f"ch3.${artifact.extension}"
    }
  )
