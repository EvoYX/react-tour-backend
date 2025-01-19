# react-tour-backend
- [ ] Phase 1
- [ ] Phase 2
- [ ] Phase 3
- [ ] Phase 4
- [ ] Phase 5

### **Phase 1: Setup Basic Project Structure**
- **1.1. Project Initialization**  
  - Set up a new React project (if not already done).
  - Install necessary dependencies: `react-shepherd`, `mongodb`, `axios`, `xlsx`, etc.
  
- **1.2. Set up MongoDB Database**  
  - Create a MongoDB database and collections for storing user progress, tour steps, and Excel file data.
  
---

### **Phase 2: Excel File Upload & Parsing**
- **2.1. Implement Excel File Upload**  
  - Create a component to allow the project manager to upload an Excel file.
  - Handle file input and perform basic validation (check for file type, size, etc.).
  
- **2.2. Excel File Parsing and Conversion**  
  - Use libraries like `xlsx` to read the Excel file and convert it into a JSON object.
  - Implement logic to map the parsed data to a suitable structure for MongoDB storage (e.g., each row as a step).

- **2.3. Store Excel Data in MongoDB**  
  - Implement logic to save the parsed data into the MongoDB collection.
  - Ensure the MongoDB schema is flexible enough to handle the tour steps and any necessary metadata.

---

### **Phase 3: React Shepherd Setup**
- **3.1. Integrate React Shepherd**  
  - Install and configure `react-shepherd` for step-by-step tour functionality.
  - Create the basic structure for the tour steps, making sure they are dynamic (can pull from MongoDB).

- **3.2. Customize Tour Step UI**  
  - Design and structure the CSS for the tour steps.
  - Implement a custom CSS to replace the default (or "ugly") styles.
  
- **3.3. Dynamic Step Rendering**  
  - Ensure that the tour steps pulled from MongoDB are dynamically rendered by React Shepherd.

---

### **Phase 4: User Progress Tracking**
- **4.1. Local Storage Integration for User Progress**  
  - Implement logic to track user progress locally using `localStorage`. 
  - For each step, store the status (completed or not) in the browser’s localStorage so it persists across sessions.

- **4.2. Sync Progress with MongoDB**  
  - If needed, periodically sync the localStorage data to MongoDB (to ensure data consistency and reliability).
  - Implement logic to check the user’s progress from MongoDB during the tour (so you can determine which steps to show them).

---

### **Phase 5: Show Only New Steps to Returning Users**
- **5.1. Determine Pending Steps**  
  - Fetch the user’s progress from MongoDB and compare it with the available steps.
  - Filter out steps the user has already completed.

- **5.2. Conditional Rendering for Returning Users**  
  - Modify the React Shepherd flow to only show steps that are still pending for the returning user.

---

### **Phase 6: Downloading Steps for Project Manager**
- **6.1. Implement Excel File Download**  
  - Create functionality that allows the project manager to download the current list of tour steps (and user progress, if needed) into an Excel file.
  
- **6.2. Upload Updated Steps**  
  - Create functionality for the project manager to upload new or modified steps to MongoDB.

---

### **Phase 7: Final Testing & Refining**
- **7.1. Test Upload and Conversion**  
  - Ensure that uploaded Excel files are correctly parsed and stored.
  
- **7.2. Test User Progress Tracking**  
  - Ensure that the user’s progress is properly saved and displayed on returning sessions.
  
- **7.3. Test React Shepherd Flow**  
  - Ensure that React Shepherd properly guides users through the remaining steps, displaying only the new steps for returning users.

- **7.4. CSS Refining**  
  - Refine the custom styles for the React Shepherd tour to ensure it looks good and aligns with the overall UI.

By breaking it down into these phases, you’ll have clear milestones to work toward, and each task will feel less overwhelming. You can also tackle each phase one at a time to maintain focus. Let me know if you need help with any specific phase or task!
