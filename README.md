# Concert Service

## How It Works

Our service acts as a bridge between the MusicVendor API and the [Music FE](https://github.com/zjromani/music-frontend), processing requests from users interested in discovering concerts. Here's a glimpse into the magic:

1. Search for Concerts: Users can initiate searches by date, location, or through open text search, looking for their favorite concerts or exploring new ones.
2. Fetch Concert Details: For every selected concert, we dive enrich the data, fetching detailed information to provide a full picture, including the tracks played and available recordings.

## Technologies and Tools

- **Kotlin:** Our choice for its concise syntax and compatibility with the JVM ecosystem.
- **Micronaut Framework:** For building modular, easily testable, and scalable microservices.
- **gRPC:** Facilitates internal communication with the Song Service, ensuring efficient data exchange.
- **Docker & Kubernetes:** Ensures our service is reliably deployed and scaled within cloud environments.
- **Terraform:** Manages our infrastructure as code, providing a stable and predictable deployment mechanism.
