package sciencebird.sps.domain

import java.util.UUID

import org.scalacheck.{ Arbitrary, Gen }
import org.scalacheck.Gen._
import sciencebird.sps.domain.Person._
import eu.timepit.refined._

trait CoreGenerators {

  //TODO: Research the refined scalacheck module. It looks like I can get auto-derivation
  val genPersonId: Gen[PersonId] = lzy(const(UUID.randomUUID().toString))
    .map(refineV(_): Either[String, PersonId])
    .flatMap {
      case Right(v) => const(v)
      case Left(_)  => fail
    }

  val genPersonName: Gen[PersonName] = alphaStr
    .map(_.take(80))
    .map(refineV(_): Either[String, PersonName])
    .flatMap {
      case Right(v) => const(v)
      case Left(_)  => fail
    }

  implicit val arbPersonId: Arbitrary[PersonId]      = Arbitrary(genPersonId)
  implicit val arbPersonaName: Arbitrary[PersonName] = Arbitrary(genPersonName)
}

object CoreGenerators extends CoreGenerators
