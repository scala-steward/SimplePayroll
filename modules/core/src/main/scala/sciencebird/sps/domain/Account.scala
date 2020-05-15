package sciencebird.sps.domain

import java.util.UUID

import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection.NonEmpty
import sciencebird.sps.domain.Person._

object accounts {
  type AccountId = String Refined NonEmpty
  object AccountId {
    //TODO: There should be better practice
    def generate: AccountId = Refined.unsafeApply(UUID.randomUUID().toString)
  }

  /**
    *
    * @param id
    * @param personId Unique identifier of a person. A person can hold as many accounts as we want.
    */
  case class Account(id: AccountId, personId: PersonId)
}
