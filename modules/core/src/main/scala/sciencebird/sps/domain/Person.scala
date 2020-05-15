package sciencebird.sps.domain

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.{ MaxSize, NonEmpty }
import eu.timepit.refined.string.Uuid
import sciencebird.sps.domain.Person._
import sciencebird.sps.domain.accounts.AccountId

object Person {

  type PersonId   = String Refined Uuid
  type PersonName = String Refined (MaxSize[80] And NonEmpty)
}

//TODO: Compose this aggregate root with the account
case class Person(id: PersonId, name: PersonName, accountId: AccountId)

case class CreatePerson(id: PersonId, name: PersonName) {
  def toPerson: Person = Person(id: PersonId, name: PersonName, AccountId.generate)
}

trait Persons[F[_]] {
  def findAll: F[List[Person]]
  def create(createPerson: CreatePerson): F[PersonId]
}
