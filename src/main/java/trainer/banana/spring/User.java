package trainer.banana.spring;
import java.lang.String;

public class User 
{

 private int id,age;
 private String name,country,preferredLanguage,adress;

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}


/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the preferredLanguage
 */
public String getPreferredLanguage() {
	return preferredLanguage;
}

/**
 * @param preferredLanguage the preferredLanguage to set
 */
public void setPreferredLanguage(String preferredLanguage) {
	this.preferredLanguage = preferredLanguage;
}

/**
 * @return the adress
 */
public String getAdress() {
	return adress;
}

/**
 * @param adress the adress to set
 */
public void setAdress(String adress) {
	this.adress = adress;
}

/**
 * @return the country
 */
public String getCountry() {
	return country;
}

/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}


}