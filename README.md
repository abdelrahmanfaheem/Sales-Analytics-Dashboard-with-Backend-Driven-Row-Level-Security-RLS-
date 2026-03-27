# Sales Analytics Dashboard with Backend-Driven Row-Level Security (RLS)

A **secure, dynamic sales analytics solution** combining **Power BI** dashboards with a **custom Spring Boot API**, implementing **backend-driven Row-Level Security** for enterprise-grade data access.

---

## 📖 Project Overview

This project demonstrates a modern approach to BI by **shifting Row-Level Security (RLS) from Power BI to the backend**. Users only access the data they’re authorized to see **before it reaches the reporting layer**, ensuring robust security.

The solution also incorporates **Power BI User-Defined Functions (UDFs)** and parameterized queries to create **dynamic, reusable dashboards** that adapt based on the user identity.

---

## 🎯 Objectives

- Build a **scalable BI solution with secure data access**  
- Implement **backend-driven RLS** outside Power BI  
- Enable **dynamic filtering based on user identity (email)**  
- Replace static database connections with a **REST API-based architecture**

---

## 🧰 Tech Stack

- **Backend:** Java + Spring Boot (REST API)  
- **Frontend / BI Tool:** Microsoft Power BI  
- **Data Processing:** Power Query (M Language)  
- **Database:** SQL Server (AdventureWorks DW)  
- **Data Integration:** REST API

---

## ⚙️ Architecture & Workflow

1. User opens the Power BI report  
2. Power Query captures a **dynamic parameter (user email)**  
3. API request is sent with the email  
4. Backend validates permissions and filters the data  
5. Filtered dataset is returned to Power BI for visualization

---

## 🔐 Key Features

- **Backend-driven Row-Level Security** for enterprise-level security  
- **Dynamic API integration** with Power BI  
- **Custom Power BI UDFs** for reusable, functional programming-style queries  
- Parameterized Power Query for **user-specific filtering**  
- Interactive dashboards with **Month-to-Month comparisons** and **Top N product analysis**  
- Conditional formatting and dynamic storytelling based on selected measures

---

## 🚀 Achievements

- Enhanced data security by shifting RLS to the backend  
- Built a **reusable API-driven architecture** reducing database dependency  
- Delivered **dynamic, user-specific dashboards**  
- Demonstrated **full-stack BI + backend integration**
