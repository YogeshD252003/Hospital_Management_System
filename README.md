Encapsution concept example:

2. Hospital Management System 
Problem Statement: 
Create a system to manage patient information while protecting sensitive data using encapsulation. 
Requirements: 
1. Create a Patient class with the following fields: 
o patientId (int): A unique identifier. 
o name (String): The patient's name. 
o age (int): The patient's age. 
o medicalHistory (String): Sensitive data related to the patient. 
2. Make all fields private and provide: 
o Getters for all fields. 
o A setter for age with validation (e.g., age should be between 0 and 150). 
o No setters for patientId or medicalHistory. 
3. Implement a displayInfo() method to display non-sensitive details (e.g., name and age). 
4. In the Main class, create instances of Patient, modify age using the setter, and display details using 
the displayInfo() method. 


  By creatinng the patient class having persnal detailes.
  Setting up the data by using setter methods. 
  Getting the stored data by using getter methods.
  Main class is to provide and set the deatiles from outside class means another class
  
  
