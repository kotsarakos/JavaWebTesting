# Selenium Java Web Tests

A collection of automated web tests written in Java using Selenium and JUnit.  
These tests cover functionality such as:

- Website availability checking
- Checkbox interactions
- UI element clickability and behavior

## 🛠 Technologies Used

- Java
- JUnit
- Selenium WebDriver

## 📁 Structure

- `CheckboxTest.java`: Tests related to selecting and verifying checkbox behavior.
- `ClickBox.java`: Logic for interacting with clickable UI components.
- `SiteAvailabilityTest.java`: Ensures that specific websites are online and responsive.

## 🚀 How to Run

1. Make sure you have Java (JDK 8+) and Maven installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/kotsarakos/JavaWebTesting.git
   ```
3. Navigate to the project directory:
   ```bash
   cd JavaWebTesting
   ```
4. Run the tests:
   ```bash
   mvn test
   ```

## ✅ Notes

- Update the URLs or element selectors inside the test files as needed for your use case.
- Make sure to have the appropriate WebDriver (e.g. ChromeDriver) available in your system PATH.

## 📄 License

This project is open-source and available under the MIT License.
