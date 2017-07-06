package sbt_classloader_issue

import java.security.{KeyPair, Security}

import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.scalatest.{FunSuite, Matchers}

class SbtIssueTest extends FunSuite with Matchers {
  Security.addProvider(new BouncyCastleProvider)

  test("generates a key pair key") {
    SbtIssue.generateKeyPair() shouldBe a[KeyPair]
  }
}
