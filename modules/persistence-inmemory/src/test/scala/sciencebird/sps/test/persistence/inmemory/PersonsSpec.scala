package sciencebird.sps.test.persistence.inmemory

import cats.Id
import org.scalatest.freespec.AnyFreeSpecLike
import sciencebird.sps.domain.{ CoreGenerators, CreatePerson }
import sciencebird.sps.persistence.inmemory.Persons
import org.scalacheck.Prop.forAll
import sciencebird.sps.domain.Person.{ PersonId, PersonName }

class PersonsSpec extends AnyFreeSpecLike with CoreGenerators {
  "Persons should" - {
    "be able to create one person" in {
      val repo = new Persons[Id]
      forAll { (id: PersonId, name: PersonName) =>
        repo.create(CreatePerson(id, name)) == id
      }
    }
  }
}
