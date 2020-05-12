package sciencebird.sps.domain

trait RepositoryFacade[F[_]] {
  val accounts: Accounts[F]
  val persons: Persons[F]
}
