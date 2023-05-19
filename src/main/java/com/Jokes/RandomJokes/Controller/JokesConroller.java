package com.Jokes.RandomJokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesConroller {

  static ArrayList<String> jokelist = new ArrayList<>();
  @PostMapping(value = "/jokes")
    public String savejokes(@RequestBody String jokes){

      jokelist.add(jokes);

      return "joke saved";
    }
@GetMapping(value = "/jokes")
  public String getjokes(){



//    jokelist.add("Why did the teddy bear skip out on dessert when she was on a date?\n" +
//            "\n" +
//            "She was stuffed! Here are more bear puns that’ll make you growl with laughter.");
//
//    jokelist.add("What is a little bear with no teeth is called?\n" +
//            "\n" +
//            "A gummy bear.");
//
//    jokelist.add("What do you call a noodle that is fake?\n" +
//            "\n" +
//            "An im-pasta. Foodies of all ages will also love these pasta puns that’ll spice up your daily rotini.");
//
//    jokelist.add(" What’s an alligator in a vest called?\n" +
//            "\n" +
//            "An investi-gator.");
//
//    jokelist.add("What’s the best way to throw a birthday party on Mars?\n" +
//            "\n" +
//            "You planet.");

    int randomNumber = 0 + (int)(Math.random() * ((jokelist.size()-1 - 0) + 1));

    return jokelist.get(randomNumber);


  }
}
