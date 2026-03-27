# Sales Analytics Dashboard with Backend-Driven Row-Level Security (RLS)

## 📖 Overview
This project demonstrates a secure and dynamic **Sales Analytics Dashboard** by integrating **Power BI** with a custom-built **Spring Boot API**.  

Key highlights:
- **Backend-driven Row-Level Security (RLS):** Ensures users access only their authorized data before it reaches Power BI.  
- **Dynamic Parameterization:** Power BI uses the user email to fetch filtered data via API.  
- **User-Defined Functions (UDFs):** Enhance data processing and make queries reusable and clean.  

---

## 🎯 Objectives
- Build a **scalable BI solution** with secure data access.  
- Implement **RLS at the backend**, not in Power BI.  
- Enable **dynamic filtering** using user email.  
- Replace static database connections with **API-driven architecture**.  
- Provide **interactive dashboards** with storytelling capabilities.  

---

## 🧰 Tech Stack
- **Backend:** Java + Spring Boot (REST API)  
- **Frontend / BI Tool:** Microsoft Power BI  
- **Data Processing:** Power Query (M) with UDFs  
- **Database:** SQL Server (AdventureWorks DW)  
- **Integration:** REST API  

---

## ⚙️ Architecture & Workflow
1. User opens the Power BI report.  
2. Power Query captures **user email** as a dynamic parameter.  
3. Email is sent to the **API endpoint**.  
4. API filters data based on user authorization.  
5. Filtered data is returned to Power BI for visualization.  

**API Endpoint Example:**  **/api/sales?userEmail={email}**

---

**Screenshots & Explanations:**
- ![API Spring Data Query](Project%20Images/API%20Spring%20Data%20Query%20.png)  
  *Backend Spring Data query retrieving sales data filtered by user email.*

- ![API Controller](Project%20Images/API%20controller%20.png)  
  *Spring Boot controller handling API requests and applying Row-Level Security.*

- ![Composite Primary Key](Project%20Images/Compste%20Primary%20Key%20.png)  
  *Database composite key setup ensuring unique identification of sales records.*

---

## 🔐 Row-Level Security Implementation
RLS is implemented entirely in the backend to guarantee **enterprise-level data security**.  

**How it works:**  
- User email acts as a unique identifier.  
- API validates permissions and filters data **before** sending it to Power BI.  

**Screenshots & Explanations:**
- ![SQL Server Authorization Table](Project%20Images/SQL%20Server%20Authrization%20Table%20.png)  
  *Authorization table linking users to allowed sales data.*

- ![Email Parameter](Project%20Images/Email%20Paramter.png)  
  *Power Query parameter setup to dynamically pass the current user’s email to the API.*

---

## ⚙️ Key Features
- **Backend-driven Row-Level Security** implemented in the API.  
- **Dynamic API integration** with Power BI using user email parameter.  
- **Custom User-Defined Functions (UDFs)** for reusable data transformations.  
- **Parameterized Power Query** for user-based filtering.  
- Interactive **sales dashboard** for real-time insights.  

**Screenshots of UDFs:**
- ![UDFs Used in the Project](Project%20Images/UDFs%20Used%20in%20the%20Project%20.png)  
  *Custom Power BI UDF used to process and transform sales data.*

- ![UDFs Used in the Project 2](Project%20Images/UDFs%20Used%20in%20the%20Project%202%20.png)  
  *Additional UDFs demonstrating functional programming for reusable queries.*

- ![JAVA Code Files](Project%20Images/JAVA%20Code%20Files%20.png)  
  *Backend Spring Boot code files implementing RLS logic.*

---

## 📊 Month-to-Month Comparison (Dynamic)
- **Dynamic Month Selection:** Buttons or multi-select filters choose months to compare.  
- **Dynamic Line Chart:** Measures (Revenue, Profit, Quantity) update dynamically with selected months highlighted.  
- **Storytelling / Text Summary:**  
  - DAX measures calculate totals, YoY % changes, and top product drivers.  
  - Displayed dynamically in Cards or Text boxes.  
- **Conditional Formatting:** Colors adapt automatically (green for growth, red for decline).  
- **Dynamic Measure Selection:** Revenue / Profit / Quantity buttons change line chart and summary metrics.  

**Screenshots & Explanations:**
- ![Month VS Month Screen](Project%20Images/Month%20VS%20Month%20Screen%20.png)  
  *Line chart comparing two selected months with conditional formatting.*

- ![Recommendation Screen](Project%20Images/Recommendation%20Screen%20.png)  
  *Dynamic recommendations based on selected month and measure.*

- ![DAX Measure Arranged Folder in Power BI](Project%20Images/DAX%20Measrue%20Arrageded%20Folder%20in%20Power%20BI.png)  
  *Organized folder structure of DAX measures in Power BI for maintainability.*

- ![Reading from API in Power Query](Project%20Images/Reading%20From%20APIS%20IN%20powe%20Query%20.png)
  *Power Query setup to read data dynamically from the API.*

---

## 🚧 Challenges & Solutions

| Challenge | Solution |
|-----------|---------|
| Power BI cannot directly access user email dynamically | Used Power Query parameter to inject user identity. |
| Switching from SQL to API without breaking model | Maintained identical schema and column names. |
| Securing data access | Implemented RLS logic in backend API. |
| Passing parameters to API | Built dynamic query in Power Query (M). |

---

## ✅ Results / Impact
- Enhanced **data security** by shifting RLS to backend.  
- Built a **scalable API-driven architecture**.  
- Reduced dependency on direct database connections.  
- Enabled **user-specific dashboards** dynamically.  

---

## 🚀 Why This Project Stands Out
- Enterprise-level security by moving RLS to backend.  
- Full-stack BI solution combining Power BI and backend development.  
- Real-world architecture demonstration for production systems.  
- Dynamic storytelling and interactive dashboards in Power BI.  

---
 

*This README provides a full overview of the project, including architecture, security approach, dynamic analytics, and all visuals used in development.*

