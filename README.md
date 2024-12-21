# WeatherApp
# WeatherApp Final

![WeatherApp Logo](path_to_your_logo_image)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Screenshots](#screenshots)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

**WeatherApp Final** is a feature-rich Android application that provides users with up-to-date weather information for various locations. Leveraging modern Android development practices and libraries, the app ensures a smooth and intuitive user experience. Users can view current weather conditions, hourly forecasts, and multi-day predictions. Additionally, the app supports location-based weather retrieval and manual city searches.

## Features

- **Current Weather**: Displays real-time weather information, including temperature, condition, and location.
- **Hourly Forecast**: Shows weather predictions for the upcoming hours.
- **Daily Forecast**: Provides weather forecasts for the next few days.
- **City Search**: Allows users to search for weather information by city name.
- **Location-Based Weather**: Automatically retrieves weather data based on the user's current location.
- **Responsive UI**: Intuitive and visually appealing interface adhering to Material Design guidelines.

## Screenshots


### Home Screen
![Home Screen](path_to_home_screen_image)

### Hourly Forecast
![Hourly Forecast](path_to_hourly_forecast_image)

### Daily Forecast
![Daily Forecast](path_to_daily_forecast_image)

### Search Dialog
![Search Dialog](path_to_search_dialog_image)

## Architecture

WeatherApp Final follows the **MVVM (Model-View-ViewModel)** architectural pattern to ensure a clear separation of concerns, making the codebase more maintainable and testable.

- **Model**: Represents the data layer, including data classes like `WeatherModel` and (if implemented) Room database entities.
- **View**: Consists of UI components such as `MainActivity`, `MainFragment`, `HoursFragment`, and `DaysFragment`.
- **ViewModel**: Handles data processing and business logic, encapsulated within `MainViewModel` using `LiveData` for reactive UI updates.

### Component Interaction

1. **MainActivity**: Hosts the `MainFragment` and sets up the edge-to-edge display.
2. **MainFragment**: Manages the main UI, including the current weather card and navigation tabs for hourly and daily forecasts. It interacts with `MainViewModel` to fetch and observe weather data.
3. **HoursFragment & DaysFragment**: Display lists of hourly and daily weather forecasts respectively, using `RecyclerView` with `WeatherAdapter`.
4. **WeatherAdapter**: Utilizes `DiffUtil` for efficient list updates and handles user interactions within the forecast lists.
5. **DialogManager**: Provides reusable dialog components for location settings and city search functionalities.

## Technologies Used

- **Kotlin**: Primary programming language.
- **Android Jetpack Components**:
  - **ViewModel** & **LiveData**: For managing UI-related data in a lifecycle-conscious way.
  - **Fragment**: Modular sections of the UI.
  - **ViewPager2** & **TabLayoutMediator**: For swipeable tabs navigation.
- **RecyclerView**: For displaying scrollable lists of data.
- **DiffUtil**: For efficient updates to RecyclerView items.
- **Material Components**: To adhere to Material Design guidelines.
- **Volley**: For handling network requests.
- **Picasso**: For image loading and caching.
- **FusedLocationProviderClient**: For accessing location services.

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/muktarkhanabilda/WeatherApp.git
   ```
2. **Open in Android Studio**
   - Launch Android Studio.
   - Click on `File` > `Open` and navigate to the cloned repository folder.
3. **Obtain Weather API Key**
   - Register at [WeatherAPI.com](https://www.weatherapi.com/) to obtain a free API key.
   - In the project, locate the `MainFragment.kt` file.
   - Replace the placeholder `API_KEY` with your actual API key:
     ```kotlin
     const val API_KEY = "YOUR_ACTUAL_API_KEY"
     ```
4. **Run the App**
   - Connect an Android device or start an emulator.
   - Click the `Run` button in Android Studio.

## Usage

1. **Launching the App**
   - Upon opening, the app will request location permissions. Granting permission allows the app to fetch weather data based on your current location.
2. **Viewing Current Weather**
   - The home screen displays the current weather, including temperature, condition, and location.
3. **Navigating Forecasts**
   - Swipe or tap on the tabs to switch between hourly and daily forecasts.
4. **Searching for a City**
   - Tap the search icon to open the city search dialog.
   - Enter the desired city name and submit to view its weather information.
5. **Refreshing Data**
   - Use the sync icon to manually refresh weather data.

## Contributing

Contributions are welcome! Please follow these steps to contribute to the project:

1. **Fork the Repository**
2. **Create a New Branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. **Make Your Changes**
4. **Commit Your Changes**
   ```bash
   git commit -m "Add some feature"
   ```
5. **Push to the Branch**
   ```bash
   git push origin feature/YourFeatureName
   ```
6. **Open a Pull Request**

Please ensure that your contributions adhere to the project's coding standards and include appropriate documentation.

