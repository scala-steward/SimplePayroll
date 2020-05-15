package sciencebird.sps.persistence.inmemory

import cats.Applicative
import cats.syntax.applicative._
import sciencebird.sps.domain.Person.PersonId
import sciencebird.sps.domain.{ CreatePerson, Person }

class Persons[F[_]: Applicative] extends sciencebird.sps.domain.Persons[F] {

  private val persons = scala.collection.mutable.Map[PersonId, Person]()

  override def findAll: F[List[Person]] =
    persons.values.toList.pure[F]

  def create(createPerson: CreatePerson): F[PersonId] = {
    persons += (createPerson.id -> createPerson.toPerson)
    createPerson.id.pure[F]
  }
}
