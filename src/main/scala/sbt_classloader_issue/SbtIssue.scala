package sbt_classloader_issue

import java.security.{KeyPair, KeyPairGenerator}

import org.bouncycastle.jce.ECNamedCurveTable
import org.bouncycastle.jce.spec.ECParameterSpec

object SbtIssue {
  def generateKeyPair(): KeyPair = {
    val generator = KeyPairGenerator.getInstance("ECDSA", "BC")
    val ecP = ECNamedCurveTable.getParameterSpec("curve25519")
    val ecSpec = new ECParameterSpec(ecP.getCurve, ecP.getG, ecP.getN, ecP.getH, ecP.getSeed)
    generator.initialize(ecSpec)
    generator.generateKeyPair()
  }
}
