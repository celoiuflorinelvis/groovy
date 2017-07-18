package ro.test.groovy.basictest

class Person {
	Integer age
	String name
	
	void sayHello() {
		println "Hello $name"
	}
	
	Person plus(Person p) {
		return new Person(name: this.name + " " + p.name, age: this.age + p.age)
	}
	
}
