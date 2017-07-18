package ro.test.groovy.basictest

import java.util.zip.Adler32

class FirstGroovy {

	static void main(def args) {
		def mulist = [1, 2, "abs", "4"]
		mulist.each{println it}		
		println 1.class
		
		// operators and ranges
		assert 1.plus(2).multiply(3).previous() == 8
		assert 2 ** 3 == 8
		// FALSE assert 'A'..'C' == ['B', 'A', 'C']
		assert 'A'..'C' == ['A', 'B', 'C']
		def ar = 0..2
		ar.forEach{println it}
		println ar.reverse()
		println "Sum = " + ar.stream().reduce(0, {s, e -> s + e}).doubleValue()
		for (i in 0..2) {
			println "BAU = $i"
		}
		
		// object and operator override
		def p1 = new Person(name: "ion", age: 12)
		def p2 = new Person(name: "petre", age: 10)
		p1.sayHello()
		p2.sayHello()
		(p1 + p2).sayHello()
		println "Age SUM = " + (p1+p2).age
		
		
		
	}
	
}
