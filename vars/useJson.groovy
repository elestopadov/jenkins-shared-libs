#!groovy
@Grab(group='com.google.code.gson', module='gson', version='2.8.6') import com.google.gson.Gson
import io.example.Person

def readJson(String s1, script) {
    Gson gson = new Gson()
    Person[] persons =  gson.fromJson(s1, Person[].class)
    persons.each { script.echo it.getAbout() }
}
