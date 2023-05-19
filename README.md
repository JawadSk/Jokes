# Random Jokes

* This is a API project for adding Jokes and fetching added Jokes randomly.

* Spring Boot 
* Java 
* Postman 
* Google Chrome

## Frameworks and Languages
* Java v17 
* Spring Boot

## Browser / Tools
* Google Chrome Postman

## Dataflow

## End Points / Controllers
@GetMapping(value = "/jokes")
@PostMapping(value = "/jokes")

 *  public String getJoke() {

  int randNum = (int) (Math.random() * (jokes.size() - 1));

  return jokes.get(randNum);
  }
  public void addJoke(String joke) {

  jokes.add(joke);
  }
## Database
I haven't used any Database in this project yet. But for data storing I have used a Collections.

* private List<String> jokes
## Datastructures
ArrayList<>
  
## Summary
  
  * This API is a Spring Boot project that is about fetching random jokes. We can add and fetch random jokes. In this project request is sent from the client on HTTP in JSON body or from path variable and stored in object then response is sent back from the server by JSON format to the client.
