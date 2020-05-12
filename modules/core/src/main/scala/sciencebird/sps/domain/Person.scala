package sciencebird.sps.domain

case class Person(id: PersonId, name: PersonName)

trait Persons[F[_]] {
  def findAll: F[List[Person]]
  def create(id: PersonId, name: PersonName): F[Unit]
}
