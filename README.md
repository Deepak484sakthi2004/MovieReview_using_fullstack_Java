```markdown
# SpringBoot Backend Application with MongoDB Integration

This Java SpringBoot backend application is built to fetch movie data from a MongoDB remote database using APIs. It provides endpoints to retrieve a list of movies and details of a specific movie based on its IMDb ID.

## Installation

1. Clone the repository to your local machine:

```bash
git clone https://github.com/your_username/your_repository.git
```

2. Ensure you have Java Development Kit (JDK) and Maven installed on your machine.

3. Configure your MongoDB remote database connection in the `application.properties` file:

```properties
spring.data.mongodb.uri=mongodb://<username>:<password>@<host>:<port>/<database>
```

4. Build the project using Maven:

```bash
mvn clean install
```

5. Run the application:

```bash
java -jar target/your-application-name.jar
```

## Usage

### Endpoints

#### Get Movies List

Endpoint: `GET /dummy/movies`

Description: Returns a JSON array containing a list of movies.

Example:

```bash
curl localhost:8080/dummy/movies
```

#### Get Movie Details

Endpoint: `GET /dummy/movies/{imdbId}`

Description: Returns the JSON file with details of the movie specified by its IMDb ID.

Example:

```bash
curl localhost:8080/dummy/movies/tt1234567
```

### Components

#### Movies Repository

The `MoviesRepository` is an interface that extends `MongoRepository` to interact with the MongoDB database. It provides methods for CRUD operations on movie entities.

#### Movie Service

The `MovieService` class handles business logic related to movie operations. It utilizes the `MoviesRepository` for database interactions.

#### Movies Controller

The `MoviesController` class controls the HTTP requests and responses related to movie operations. It maps endpoints to methods in the `MovieService`.

#### Reviews Repository, Review Service, and Reviews Controller

Similarly, there are corresponding components for handling movie reviews.

## Contributing

Contributions are welcome! If you have any suggestions, improvements, or feature requests, feel free to open an issue or create a pull request.

## License

[MIT License](LICENSE)

