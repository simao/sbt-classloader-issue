scalaVersion := "2.12.2"

libraryDependencies ++= {
  val bouncyCastleV = "1.57"

  Seq(
    "org.scalatest"  %% "scalatest" % "3.0.0" % "test",
    "org.bouncycastle" % "bcprov-jdk15on" % bouncyCastleV,
    "org.bouncycastle" % "bcpkix-jdk15on" % bouncyCastleV
  )
}
