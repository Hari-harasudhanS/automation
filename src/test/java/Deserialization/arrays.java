package Deserialization;

import java.util.List;

public class arrays {
    // Fields of the outer class
    private List<WebAutomation> webAutomation;
    private String api;
    private String mobile;

    // Main method
    public static void main(String[] args) {
        // Example usage of inner class instances and accessing data
        arrays arrays = new arrays();
        arrays.api = "example_api";
        arrays.mobile = "example_mobile";
        
        // Assuming WebAutomation has appropriate constructor and methods
        arrays.webAutomation = List.of(
            new WebAutomation("Course1", "100"),
            new WebAutomation("Course2", "200")
        );
        
        // Accessing and printing data
        if (arrays.webAutomation != null && !arrays.webAutomation.isEmpty()) {
            System.out.println(arrays.webAutomation.get(1).getCourseTitle());
        } else {
            System.out.println("No web automation courses available.");
        }
    }

    // Inner class WebAutomation
    public static class WebAutomation {
        private String courseTitle;
        private String price;

        // Constructor
        public WebAutomation(String courseTitle, String price) {
            this.courseTitle = courseTitle;
            this.price = price;
        }

        // Getters
        public String getCourseTitle() {
            return courseTitle;
        }

        public String getPrice() {
            return price;
        }
    }
}

















/*


package Deserialization;

import java.util.List;

public class arrays
// Another Classp
public static void main(String[]args) {
public list<webAutomation> webAutomation;
private String api;
private String mobile;

// Inner Class====>webAutomation
private String courseTitle;
private String price;
                        //courses  //webautomation //coursetitle
System.out.println(value.getData().get(1).getFirst_name());
}

*/