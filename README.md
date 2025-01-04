# 🚗 Smart Car Advisor - AI Vehicle Recommendation System

<div align="center">
  
![Smart Car Advisor](https://img.shields.io/badge/Smart%20Car%20Advisor-1.0.0-blue?style=for-the-badge&logo=java)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.1-brightgreen?style=for-the-badge&logo=spring)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-Latest-success?style=for-the-badge&logo=mongodb)](https://www.mongodb.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="100" height="100"/>

*An intelligent, AI-powered system that recommends the perfect vehicle based on your preferences and priorities.*

[Features](#-features) • [Demo](#-live-demo) • [Installation](#-installation) • [API Reference](#-api-reference) • [Tech Stack](#-tech-stack)

🌟 **[View on GitHub](https://github.com/yashodhan271/smart-car-advisor)** 🌟

</div>

## 🌟 Features

<div align="center">
  <table>
    <tr>
      <td align="center">🤖</td>
      <td><strong>AI-Powered Recommendations</strong><br/>Intelligent vehicle suggestions based on user preferences</td>
      <td align="center">💡</td>
      <td><strong>Smart Filtering</strong><br/>Advanced filtering based on multiple criteria</td>
    </tr>
    <tr>
      <td align="center">🎯</td>
      <td><strong>Preference Matching</strong><br/>Precise matching of user requirements</td>
      <td align="center">📊</td>
      <td><strong>Rating System</strong><br/>Comprehensive vehicle rating system</td>
    </tr>
    <tr>
      <td align="center">🎨</td>
      <td><strong>Modern UI</strong><br/>Beautiful and responsive user interface</td>
      <td align="center">📱</td>
      <td><strong>Mobile-Friendly</strong><br/>Works seamlessly on all devices</td>
    </tr>
  </table>
</div>

## 🚀 Live Demo

Visit our application at: `http://localhost:8080`

![Application Screenshot](https://via.placeholder.com/800x400?text=Smart+Car+Advisor+Screenshot)

## 💻 Tech Stack

<div align="center">
  
| Technology | Version | Purpose |
|------------|---------|----------|
| ![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=java) | 21 | Core Language |
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.1-brightgreen?style=flat-square&logo=spring) | 3.2.1 | Backend Framework |
| ![MongoDB](https://img.shields.io/badge/MongoDB-Latest-success?style=flat-square&logo=mongodb) | Latest | Database |
| ![HTML5](https://img.shields.io/badge/HTML5-Latest-red?style=flat-square&logo=html5) | Latest | Frontend |
| ![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-purple?style=flat-square&logo=bootstrap) | 5.3 | UI Framework |
| ![OpenAPI](https://img.shields.io/badge/OpenAPI-3.0-blue?style=flat-square&logo=openapi-initiative) | 3.0 | API Documentation |

</div>

## 🛠 Installation

### Prerequisites

- Java Development Kit (JDK) 21
- Maven 3.8+
- MongoDB
- Git

### Step-by-Step Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yashodhan271/smart-car-advisor.git
   cd smart-car-advisor
   ```

2. **Configure MongoDB**
   ```properties
   # Update application.properties
   spring.data.mongodb.uri=mongodb://localhost:27017/carrecommender
   ```

3. **Build the Project**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**
   - Web Interface: `http://localhost:8080`
   - API Documentation: `http://localhost:8080/swagger-ui.html`

## 📚 API Reference

### Get Vehicle Recommendations

```http
POST /api/recommendations
```

#### Request Body

```json
{
  "budget": 50000.0,
  "vehicleType": "SUV",
  "fuelType": "Petrol",
  "seatingCapacity": 5,
  "safetyPriority": true,
  "fuelEfficiencyPriority": true,
  "luxuryPriority": false,
  "performancePriority": false
}
```

#### Response

```json
[
  {
    "brand": "Toyota",
    "model": "RAV4",
    "price": 45000.0,
    "vehicleType": "SUV",
    "fuelType": "Petrol",
    "seatingCapacity": 5,
    "safetyRating": 9,
    "performanceRating": 7,
    "luxuryRating": 8
  }
]
```

## 🏗 Project Structure

```
smart-car-advisor/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/carrecommender/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       ├── static/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request at [https://github.com/yashodhan271/smart-car-advisor/pulls](https://github.com/yashodhan271/smart-car-advisor/pulls)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Yashodhan Advankar** - *Initial work* - [yashodhan271](https://github.com/yashodhan271)

## 🙏 Acknowledgments

- Spring Boot Team
- MongoDB Team
- OpenAPI Initiative
- Bootstrap Team
- Pexels API Team for providing beautiful car images

---

<div align="center">
  
Made with ❤️ by [Yashodhan Advankar](https://github.com/yashodhan271)

⭐ Star us on [GitHub](https://github.com/yashodhan271/smart-car-advisor) — it motivates us a lot!

</div>
