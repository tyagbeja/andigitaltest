# Andigital test
## Approach
Used Java and the Spring MVC/Spring Boot framework in setting the web application. Spring boot helps with the configuration aspects of Spring MVC, enabling me to focus on the coding aspects. Also Spring Boot comes with an embedded server which provides a container to easily deploy the web application in.
In processing JSON object returned from the foursquare API, I have used Spring's RestTemplate which enables returning Java Objects directly from the rest api calls/json object returned.(You can find the Objects hierarchy in the com.andigital.foursquare.model package).Also within the controller I have set 2 actions to support a web based view and the venue action to support web-based api.

## Running the program
To run the web api/app 
1) Change directory to location of project
2) Execute gradle bootRun
3) In a browser navigate to http://localhost:8080/search for web view
   or
   http://localhost:8080/venue?name=<Place> for web api. Where <Place> is replaced with the location you are interested in
To run test only
1) Change directory to location of project
2) Execute gradle test