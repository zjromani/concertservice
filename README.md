# Music Service

## How It Works

Our service acts as a bridge between the MusicVendor API and the [Music FE](https://github.com/zjromani/music-frontend).

- Manages all data related to music, including concerts, songs, artists, and venues. It's responsible for fetching data from external sources (MusicVendor APIs and [PhishRumors.com](http://phishrumors.com/)), storing this data, and serving it to clients.
- Communicates with external APIs to gather music data and with the **`music-prediction`** service for predictive insights.
- Stores relational music data as a cache

## Technologies and Tools

- **Kotlin:** Our choice for its concise syntax and compatibility with the JVM ecosystem.
- **Micronaut Framework:** For building modular, easily testable, and scalable microservices.
- **gRPC:** Facilitates internal communication with the Song Service, ensuring efficient data exchange.
- **Docker & Kubernetes:** Ensures our service is reliably deployed and scaled within cloud environments.
- **Terraform:** Manages our infrastructure as code, providing a stable and predictable deployment mechanism.
