# SEM-VI-Programs

This repository contains all the laboratory programs and assignments for SPPU (Savitribai Phule Pune University) Third Year Computer Engineering (TE Comp) Semester 6 under the 2019 Pattern. Below is a comprehensive list of lab courses along with their assignments and practical requirements. Each subject has a dedicated folder in this repository for easy navigation.

## Semester VI Laboratory Courses (2019 Pattern)

### 1. Data Science and Big Data Analytics Laboratory (DSBDAL) - 310256
**Credit:** 2 | **Hours per week:** 4

**Assignment Groups:**

**Group A: Data Wrangling (Any Two)**
- **Assignment 1:** Data Wrangling I
  - Import required Python libraries (NumPy, Pandas, Matplotlib)
  - Load dataset (e.g., data.csv) into Pandas DataFrame
  - Data preprocessing: handle missing values using isnull(), describe()
  - Data formatting and normalization
  - Turn categorical variables into quantitative variables

- **Assignment 2:** Data Wrangling II
  - Create "Academic performance" dataset
  - Scan for missing values and inconsistencies
  - Handle missing data using appropriate techniques
  - Scan for outliers and anomalous data
  - Data transformation and feature engineering

- **Assignment 3:** Data Wrangling III
  - Descriptive statistics on dataset
  - Variable descriptions and types identification
  - Check data frame dimensions
  - Statistical analysis and data profiling

**Group B: Data Visualization (Any Two)**
- **Assignment 4:** Data Visualization I
  - Use Titanic dataset (891 rows)
  - Plot histogram for ticket fare distribution
  - Use Seaborn library for pattern identification
  - Statistical visualization and insights

- **Assignment 5:** Data Visualization II
  - Box plot for age distribution by gender and survival
  - Analyze Titanic dataset relationships
  - Gender-based survival analysis

- **Assignment 6:** Data Visualization III
  - Download Iris flower dataset or similar
  - Create histograms for each feature
  - Identify feature types (numeric, nominal)
  - Illustrate feature distributions

**Group C: Text Analytics (Any Two)**
- **Assignment 7:** Text Analytics I
  - Extract sample document and apply text analytics
  - Tokenization, POS tagging, stop words removal
  - Stemming and lemmatization
  - Create representation of document using Term Frequency and TF-IDF

- **Assignment 8:** Text Analytics II
  - Document similarity analysis
  - Text preprocessing and cleaning
  - Feature extraction techniques

- **Assignment 9:** Text Analytics III
  - Sentiment analysis on reviews/tweets
  - Opinion mining techniques
  - Polarity and subjectivity analysis

**Group D: Data Analytics (Any Two)**
- **Assignment 10:** Linear Regression
  - Implement Simple Linear Regression
  - Predict continuous target variable
  - Model evaluation using R², RMSE
  - Visualization of regression line

- **Assignment 11:** Logistic Regression
  - Binary classification problem
  - Implement Logistic Regression
  - Confusion matrix and accuracy metrics
  - ROC curve analysis

- **Assignment 12:** Clustering
  - Implement K-Means clustering algorithm
  - Hierarchical clustering
  - Determine optimal number of clusters
  - Visualization of clusters

**Group E: Mini Project**
- Apply data science concepts on real-world dataset
- Complete pipeline: Data collection → Preprocessing → Analysis → Visualization → Insights
- Documentation and presentation

---

### 2. Web Technology Laboratory (WTL) - 310257
**Credit:** 1 | **Hours per week:** 2

**Assignment List:**

**Group A: Basic Web Technologies (Any Two)**
- **Assignment 1:** Website Case Study
  - Analyze existing websites
  - Study design issues and best practices
  - Document findings on layout, navigation, responsiveness

- **Assignment 2:** HTML5 & CSS3
  - Create responsive web pages using HTML5
  - Apply CSS3 for styling (Grid, Flexbox)
  - Form validation and semantic HTML

- **Assignment 3:** JavaScript Basics
  - Client-side scripting
  - DOM manipulation
  - Event handling and form validation

**Group B: Advanced Web Technologies (Any Two)**
- **Assignment 4:** JavaScript Advanced
  - AJAX for asynchronous communication
  - JSON data handling
  - REST API consumption

- **Assignment 5:** PHP & MySQL
  - Server-side scripting with PHP
  - Database connectivity
  - CRUD operations implementation

- **Assignment 6:** Node.js & Express
  - Server setup using Node.js
  - RESTful API development
  - MongoDB integration

**Group C: Frameworks & Libraries (Any Two)**
- **Assignment 7:** Bootstrap Framework
  - Responsive web design
  - Bootstrap components (navbar, cards, forms)
  - Grid system implementation

- **Assignment 8:** React.js/Angular
  - Component-based architecture
  - State management
  - Single Page Application (SPA)

- **Assignment 9:** Web Application Development
  - Full-stack web application
  - Authentication and session management
  - Deployment on cloud (Heroku/AWS/Netlify)

**Group D: Mini Project**
- Complete web application with frontend and backend
- Database integration
- Security implementation
- Hosted deployment

---

### 3. Laboratory Practice II (LP-II) - 310258
**Credit:** 2 | **Hours per week:** 4

**Assignments from:** Artificial Intelligence (310253) and Elective II (310254)

**Artificial Intelligence Assignments:**

**Group A: Search Algorithms (Any Two)**
- **Assignment 1:** Depth First Search (DFS) and Breadth First Search (BFS)
  - Graph traversal algorithms
  - Implementation on 8-puzzle problem or similar

- **Assignment 2:** A* Algorithm
  - Heuristic search implementation
  - Path finding problems
  - Cost function optimization

- **Assignment 3:** Constraint Satisfaction Problems
  - N-Queens problem
  - Graph coloring
  - Backtracking algorithms

**Group B: Game Playing (Any Two)**
- **Assignment 4:** Minimax Algorithm
  - Game tree generation
  - Optimal move selection
  - Tic-Tac-Toe implementation

- **Assignment 5:** Alpha-Beta Pruning
  - Optimization of Minimax
  - Game playing strategy

**Group C: Machine Learning (Any Two)**
- **Assignment 6:** Expert System
  - Rule-based system development
  - Knowledge representation
  - Inference engine implementation

- **Assignment 7:** Neural Networks
  - Perceptron or multi-layer implementation
  - Backpropagation algorithm
  - Classification problems

- **Assignment 8:** Chatbot Development
  - Natural Language Processing basics
  - Intent recognition
  - Response generation

**Elective II Assignments (Based on chosen elective):**

**For Information Security (310254A):**
- Cryptography algorithms (Caesar, Playfair, Hill Cipher)
- RSA, Diffie-Hellman key exchange
- Digital signatures and certificates
- Firewall and intrusion detection

**For Augmented and Virtual Reality (310254B):**
- AR application using ARCore/ARKit
- VR scene development using Unity3D
- 3D modeling and rendering
- Interaction design

**For Cloud Computing (310254C):**
- Cloud service deployment (AWS/Azure/GCP)
- Virtual machine creation and management
- Docker containerization
- Load balancing and auto-scaling

**For Software Modeling and Architectures (310254D):**
- UML diagrams (Use Case, Class, Sequence)
- Design patterns implementation
- Architectural styles (MVC, Microservices)
- Software design documentation

---

## Repository Structure

```
SEM-VI-Programs/
├── DSBDAL_310256/
│   ├── Group_A/
│   ├── Group_B/
│   ├── Group_C/
│   ├── Group_D/
│   ├── Group_E/
│   └── README.md
├── WTL_310257/
│   ├── Group_A/
│   ├── Group_B/
│   ├── Group_C/
│   ├── Group_D/
│   └── README.md
├── LP-II_310258/
│   ├── Artificial_Intelligence/
│   │   ├── Group_A/
│   │   ├── Group_B/
│   │   └── Group_C/
│   ├── Elective_II/
│   │   ├── Information_Security/
│   │   ├── AR_VR/
│   │   ├── Cloud_Computing/
│   │   └── Software_Modeling/
│   └── README.md
└── README.md
```

## Tools and Technologies Required

### For DSBDAL:
- Python 3.x
- Jupyter Notebook / Google Colab
- Libraries: NumPy, Pandas, Matplotlib, Seaborn, Scikit-learn, NLTK
- Datasets: Titanic, Iris, UCI ML Repository datasets

### For WTL:
- VS Code / Sublime Text / WebStorm
- Web Browsers (Chrome/Firefox with Developer Tools)
- XAMPP / WAMP (for PHP & MySQL)
- Node.js and npm
- MongoDB
- Git for version control

### For LP-II (AI):
- Python 3.x with AI libraries (TensorFlow, Keras, scikit-learn)
- Prolog (for expert systems)
- Java (for game algorithms)
- Development IDE (PyCharm, VS Code, IntelliJ)

### For LP-II (Elective II):
**Information Security:**
- Java / Python / C++
- OpenSSL, Cryptography libraries
- Network tools (Wireshark, Nmap)

**AR/VR:**
- Unity3D / Unreal Engine
- ARCore (Android) / ARKit (iOS)
- Blender (3D modeling)

**Cloud Computing:**
- AWS / Azure / Google Cloud account
- Docker
- Kubernetes (optional)

**Software Modeling:**
- UML tools (StarUML, Lucidchart, draw.io)
- IDE for design pattern implementation
- Documentation tools

## Assessment Guidelines

Each laboratory course follows SPPU assessment pattern:
- **Continuous Assessment:** Regular assignment submissions, code reviews
- **Term Work:** Minimum 8-10 assignments completion mandatory
- **Lab Exam:** Practical examination at the end of semester
- **Mini Project:** Required for final assessment

### Journal Format:
- Certificate and index
- Assignment title, objectives, problem statement
- Theory/concept explanation
- Algorithm/flowchart (where applicable)
- Source code with detailed comments
- Test cases and outputs
- Analysis and conclusion
- Date and signature

## How to Use This Repository

1. Each lab folder contains assignment-wise subfolders
2. Navigate to specific assignment for:
   - Problem statement
   - Solution code
   - Sample input/output
   - Documentation
3. Follow the README in each subfolder for specific instructions
4. Install required dependencies mentioned in requirements.txt (if present)

## Important Notes

- **Group Selection:** Students must complete specified number of assignments from each group
- **Code Quality:** Focus on clean, documented, and efficient code
- **Plagiarism:** Strictly prohibited; understand concepts before implementation
- **Deadlines:** Maintain regular submission schedule as per college calendar
- **Practical Exam:** Be prepared to execute and explain any completed assignment

## Contributing

If you find any errors, want to add more programs, or improve documentation:
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Submit a pull request

## References

- SPPU Official Syllabus Document: [TE Computer 2019 Course](https://www.aitpune.com/Documents/Comp/TE_Computer_2019_Course_revised_draft_7June2021.pdf)
- Official Python Documentation: https://docs.python.org/
- scikit-learn Documentation: https://scikit-learn.org/
- MDN Web Docs: https://developer.mozilla.org/
- SPPU Question Papers: https://www.sppuquestionpapers.com/

## License

This repository is for educational purposes only. Follow SPPU guidelines for academic integrity.

## Disclaimer

This repository is created by students for students. While we strive for accuracy:
- Verify assignments with your college lab manual
- Consult faculty for any discrepancies
- Use as reference, not as sole learning material
- Programs may need modifications based on specific requirements

---

**Last Updated:** February 2026  
**Pattern:** SPPU 2019 Pattern  
**Semester:** VI (Third Year, Second Semester)  
**Branch:** Computer Engineering

For queries, suggestions, or contributions, please open an issue or contact the repository maintainers.