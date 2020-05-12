package sciencebird.sps.domain

/**
  *
  * @param id
  * @param personId Unique identifier of a person. A person can hold as many accounts as we want.
  */
case class Account(id: AccountId, personId: PersonId)

trait Accounts[F[_]] {
  def findAll: F[List[Account]]
  def create(id: AccountId, personId: PersonId): F[Unit]
}
