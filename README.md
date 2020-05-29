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
 
 ![1](https://user-images.githubusercontent.com/37294801/83220741-6fc44c00-a1a6-11ea-99d0-4982febb8935.png)
When click”add manager”button,

 ![2](https://user-images.githubusercontent.com/37294801/83220756-781c8700-a1a6-11ea-988c-a96e02f5b6f8.png)
When click”show record”button,

![3](https://user-images.githubusercontent.com/37294801/83220757-794db400-a1a6-11ea-931b-56524d604520.png)

 


When input record2,
 ![4](https://user-images.githubusercontent.com/37294801/83220759-79e64a80-a1a6-11ea-938a-b55c6abc00f4.png)

When click”add generalStaff”button,
![5](https://user-images.githubusercontent.com/37294801/83220761-79e64a80-a1a6-11ea-97e9-ee53a926cac9.png)

 
When click”show record”button,

![6](https://user-images.githubusercontent.com/37294801/83220957-0264eb00-a1a7-11ea-8a54-e8a8accdb4f9.png)

 




Test Case 2:
Input Information Incorrectly
When input record 1 samely,
 ![7](https://user-images.githubusercontent.com/37294801/83220776-7fdc2b80-a1a6-11ea-8a09-9dd0cb8b59ba.png)

When click GeneralStaff button,(should be error)
 
![8](https://user-images.githubusercontent.com/37294801/83220778-810d5880-a1a6-11ea-89a6-647d08656e15.png)






When input record 2 samely,
![9](https://user-images.githubusercontent.com/37294801/83220779-810d5880-a1a6-11ea-8355-668664d2d215.png)

When click manager button,(should be error)

 ![10](https://user-images.githubusercontent.com/37294801/83220782-81a5ef00-a1a6-11ea-8eda-01b834ec22ba.png)





Test Case 3
When data range input wrongly
  ![11](https://user-images.githubusercontent.com/37294801/83220784-81a5ef00-a1a6-11ea-951b-092732dabeeb.png)
When null input / data type error 
In manager button,
![12](https://user-images.githubusercontent.com/37294801/83220959-03961800-a1a7-11ea-9d16-8d54b251739e.png)

In generalStaff button,
  ![13](https://user-images.githubusercontent.com/37294801/83220790-85397600-a1a6-11ea-9ed2-d06eaedce538.png)


Test Case 4
About the TestSystem.java

![14](https://user-images.githubusercontent.com/37294801/83220792-85d20c80-a1a6-11ea-9d91-6cd4457f6f79.png)



Test Case 5
About the IncreaseSalary.java
 ![15](https://user-images.githubusercontent.com/37294801/83220793-85d20c80-a1a6-11ea-9773-7876567ec463.png)

</p>
