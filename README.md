# Job Search Portal

This is a simple Job Search Portal application built using Spring Boot. It provides CRUD operations for managing job listings and applies validation using annotations.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Entity Class: Job

The `Job` entity class represents a job listing and includes the following fields:

- `id` (Long): The unique identifier of the job.
- `title` (String): The title of the job.
- `description` (String): The description of the job.
- `location` (String): The location of the job.
- `salary` (Double): The salary of the job (should be above 20,000).
- `companyEmail` (String): The email address of the company.
- `companyName` (String): The name of the company.
- `employerName` (String): The name of the employer.
- `jobType` (Enum): The type of the job (IT, HR, Sales, Marketing, etc.).
- `appliedDate` (LocalDate): The date when the job was applied for.

## Usage

1. Clone the repository:

```bash
git clone https://github.com/your-username/job-search-portal.git

```
## Endpoints ##

The following endpoints are available:

GET /jobs: Get all jobs.

GET /jobs/{id}: Get a job by its ID.

POST /jobs: Create a new job.

PUT /jobs/{id}: Update an existing job.

DELETE /jobs/{id}: Delete a job.

### Job Model ###

```
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private String description;

    private String location;

    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;

    @Column(name = "company_email")
    private String companyEmail;

    private String companyName;

    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @NotNull
    private LocalDate appliedDate;

    // Constructor, getters, and setters
}
````
### Contributing ###
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.


