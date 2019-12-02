package com.springformat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// In a real world app, this should be an Entity!
/**
 * 
 */
//@Component
@Entity
@Table(name = "TB_USER")
public class User {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String jobTitle;

    /**
     * 
     */
    private String company;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String city;

    /**
     * 
     */
    private String country;

    /**
     * 
     */
    private String phoneNumber;

    /**
     * 
     */
    public User() {

    }

    /**
     * 
     *
     * @param firstName 
     * @param lastName 
     * @param age 
     * @param jobTitle 
     * @param company 
     * @param address 
     * @param city 
     * @param country 
     * @param phoneNumber 
     */
    public User(String firstName, String lastName, Integer age, String jobTitle, String company, String address,
                String city, String country, String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.address = address;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
    
    

    /**
     * 
     *
     * @return 
     */
    public Integer getId() {
		return id;
	}

	/**
	 * 
	 *
	 * @param id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getFirstName() {

        return firstName;
    }

    /**
     * 
     *
     * @param firstName 
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * 
     *
     * @return 
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * 
     *
     * @param lastName 
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * 
     *
     * @return 
     */
    public Integer getAge() {

        return age;
    }

    /**
     * 
     *
     * @param age 
     */
    public void setAge(Integer age) {

        this.age = age;
    }

    /**
     * 
     *
     * @return 
     */
    public String getJobTitle() {

        return jobTitle;
    }

    /**
     * 
     *
     * @param jobTitle 
     */
    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    /**
     * 
     *
     * @return 
     */
    public String getCompany() {

        return company;
    }

    /**
     * 
     *
     * @param company 
     */
    public void setCompany(String company) {

        this.company = company;
    }

    /**
     * 
     *
     * @return 
     */
    public String getAddress() {

        return address;
    }

    /**
     * 
     *
     * @param address 
     */
    public void setAddress(String address) {

        this.address = address;
    }

    /**
     * 
     *
     * @return 
     */
    public String getCity() {

        return city;
    }

    /**
     * 
     *
     * @param city 
     */
    public void setCity(String city) {

        this.city = city;
    }

    /**
     * 
     *
     * @return 
     */
    public String getCountry() {

        return country;
    }

    /**
     * 
     *
     * @param country 
     */
    public void setCountry(String country) {

        this.country = country;
    }

    /**
     * 
     *
     * @return 
     */
    public String getPhoneNumber() {

        return phoneNumber;
    }

    /**
     * 
     *
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     *
     * @return 
     */
    public int getColumnCount() {

        return getClass().getDeclaredFields().length;
    }
}
