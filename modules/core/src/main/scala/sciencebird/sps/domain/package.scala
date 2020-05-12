package sciencebird.sps

import eu.timepit.refined.types.string.NonEmptyString
import io.estatico.newtype.macros.newtype

package object domain {
  @newtype case class AccountId(val value: NonEmptyString)

  @newtype case class PersonId(val value: NonEmptyString)
  @newtype case class PersonName(val value: NonEmptyString)

  @newtype case class EmployeeId(val value: NonEmptyString)
}
