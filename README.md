# employee_record_system
Java GUI for managing employee record
<h1>OOP Concept</h1>
<p>In my program, I show the concept of Object Oriented Programming including Abstraction, Encapsulation, Inheritance and Polymorphism.

As for the Encapsulation, it is used to hide unimportant implementation details from other objects. Then, the setter allow clients to modify private data and the getter allow clients to read private data.
For example, in Employee.java, staffID, name, gender, mobileNo, post, address, age, salary and mpf are the private data. getStaffID(), getName(), getGender(), getAge(), getMobileNo(), getPost(), getAddress(), getSalary() and getMpf() are the getter of above private data respectively. Also, setSalary() is the setter of salary. The constructor of Employee() is instead of setter of others data to initialize instance variables of object when ‘this’ refers to private variables.
In Manager.java, houseAllow and travelAllow are the variables. getHouseAllow() and getTravelAllow() are the getter of them respectively. Also, the constructor of Manager() is instead of setter of them to initialize instance variables.
In GeneralStaff.java, bonus is the private variable. getBonus() is the getter of bonus and constructor of GeneralStaff() define the setter of bonus.

In relation to Inheritance, it allow classes to be defined in terms of other classes. Class can inherit variables and methods from other classes. The inheriting class can then add extra attributes and methods of its own.
For example, in these programs, Manager and GeneralStaff inherits from Employee. Manager and GeneralStaff call Subclasses. Employee call Superclass. Therefore, the constructor of Manager() and GeneralStaff() use super() to initialize instance variables of superclass.

In terms of Abstraction, there are some situations in which it is useful to define base classes that are never instantiated.
For instance, Employee is an abstract super class. In this class, increaseSalary() is an abstract method. Therefore, subclasses of Manager and GeneralStaff have a method of increaseSalary() to define the content of superclass.

Last but not least, Polymorphism means that a single variable might be used with several different types of related objects at different times in a program. In TestSystem.java or IncreaseSalary.java, method to run in emp[].Employee depends on object emp[i] refers to.
</p>
<h1>Test Cases</h1>
<p>Normally Test for Success
When input record1,
 
When click”add manager”button,
 
When click”show record”button,

 


When input record2,
 
When click”add generalStaff”button,

 
When click”show record”button,

 




Test Case 2:
Input Information Incorrectly
When input record 1 samely,
 
When click GeneralStaff button,(should be error)
 






When input record 2 samely,
 
When click manager button,(should be error)

 








Test Case 3
When data range input wrongly
 
When null input / data type error 
In manager button,
 
In generalStaff button,
 

Test Case 4
About the TestSystem.java
 



Test Case 5
About the IncreaseSalary.java
 
</p>
