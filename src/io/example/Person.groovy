#!groovy
package io.example

/**
  * Person class for example
**/

class Person {

    String name
    Integer age

    Person(String name, Integer age) {
        this.name = name
        this.age = age
    }

    def getAbout() {
        return "Name: ${name} / Age: ${age}"
    }

}
