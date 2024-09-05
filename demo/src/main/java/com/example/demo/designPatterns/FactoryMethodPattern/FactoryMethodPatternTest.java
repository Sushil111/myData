package com.example.demo.designPatterns.FactoryMethodPattern;

public class FactoryMethodPatternTest {
	// only used if need of object creation is too much and often and object
	// creation
	// logic need to be abstracted .

	// should not be used where direct object creation logic can be used

	// java logics where Factory method is internally used are : JDBC(where
	// factories are
	// intensively used in connections creation ,statements preparation , result
	// sets etc.)
	// Logging frameworks :(used for consecutive logging instance creation in log4j
	// and logback etc)
	// Used for Different UI components creation like text box , buttons , image
	// loading in Java UI
	// creation logics such as Swing JavaFx etc.
	// Dependency injection frameworks such as Spring rely heavily on factory
	// methods for beans creation
	// and management.
}
