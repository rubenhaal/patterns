# Project about design patterns

## Based on gang of four:

### Creational patterns:

- Abstract Factory.
  - This design pattern is useful when there are family or dependant objects. The key element is the main inferface for the factories that can be used in the code 
  - The system should be easily extensible 
  - With this pattern you can have loosely coupled classes
  - And if you want to change this during execution 
  - TODO Multi platform database connections.
- Builder.
  - This design pattern is to make easy to create new objects
  - It allows clarity in the creation of complex objects. It also gives more legibility.
  - Make the object Immutable.
  - Avoid the problem of the telescopic constructor.
  - Can validate step by step
  - Easy to add new optional attributes.
- Chain of constructor.
  - Centralize the logic for the constructor
  - Less duplicated code if you need more than one constructor
  - Flexibility but it could be used wrong for complex objects
- Factory.
  - With this creational pattern the encapsulation of the creation logic is delegated to the factory class.
  - We have less coupled code and easy to change and add new classes.
- Singleton.
  - Less memory use, global access and control on the creation of the instance
- Other factory.
  - Based on the abstract factory

### Behavioral pattern