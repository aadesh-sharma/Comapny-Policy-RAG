---

# AI RAG Application with Spring Boot

This project demonstrates a **Retrieval-Augmented Generation (RAG)** application built using Spring Boot and Spring AI with a local LLM powered by Ollama.

The application allows users to **ask questions about uploaded documents**, and the system retrieves relevant information from the documents before generating an AI-powered answer.

---

# Architecture

```
User Query
     ↓
Spring Boot REST API
     ↓
Document Embedding
     ↓
Vector Store
     ↓
Relevant Document Retrieval
     ↓
LLM (via Ollama)
     ↓
Generated Response
```

---

# Tech Stack

* Spring Boot
* Spring AI
* Ollama
* Llama 3
* Vector Store (in-memory)
* Java 17+

---

# Features

* Upload documents (PDF / text)
* Convert documents into embeddings
* Store embeddings in a vector store
* Retrieve relevant context based on user query
* Generate AI-powered responses using a local LLM

---

# Prerequisites

Before running the project, install:

### 1. Install Ollama

Download and install:

[https://ollama.com](https://ollama.com)

### 2. Pull the LLM Model

```bash
ollama pull llama3
//this will take some time and space to download, around 4gb
//you can use other models also, just pull them and change the model name in chatmodel config file
```

---

# Project Setup

### Clone the Repository

```bash
git clone  https://github.com/aadesh-sharma/Comapny-Policy-RAG.git
```

Navigate to project folder:

```bash
cd [your proj root]
```

---

### Run the Application

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

# API Endpoint

### LOAD Documet
**GET
1.Place a PDF/txt file in your local machine and give path in code.
2.For testing i have shared one pdf file in this repo , you can use it or use any other.
3.Hit this end-point 
```
URL :http://localhost:8080/api/v1/load
```
### Ask Question

**GET**
//Alright! we are ready to see the things in action
//just ask questions in the request param.
```
URL: http://localhost:8080/api/v1/chat?userQuery="What are the working hours?")
```

Example Response:

```json
{
  "Monday to Friday, 9:30 AM to 6:30 PM. Employees are allowed flexible login between 9:00 AM and 10:30 AM. Remote work is allowed for up to 2 days per week, subject to manager approval."
}
```

---

# Example Use Cases

* Document Q&A system
* Internal company knowledge assistant
* Customer support automation
* AI-powered knowledge base

---

# Future Improvements

* Add support for multiple document uploads
* Use persistent vector databases
* Improve document chunking strategies
* Add streaming responses
* Implement chat history

---

# Learning Outcome

This project helped in understanding:

* Retrieval-Augmented Generation (RAG)
* AI integration with backend applications
* Vector embeddings and semantic search
* Running LLMs locally with Ollama

---

# Author

Aadesh Sharma
Senior Software Engineer | Java | Spring Boot | AI Enthusiast

---
