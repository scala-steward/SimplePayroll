package sciencebird.sps.domain

case class Employee(id: EmployeeId)

trait Employees[F[_]] {
  def findAll: F[List[Employee]]
  def create(id: EmployeeId): F[Unit]
}
