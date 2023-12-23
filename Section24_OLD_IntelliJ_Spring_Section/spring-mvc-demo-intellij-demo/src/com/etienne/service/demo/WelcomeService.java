package com.etienne.service.demo;

import java.util.ArrayList;
import java.util.List;

/**
 *  Created by Etienne KOA.
 */

public class WelcomeService {

    public List<String> getWelcome(String name) {
        List<String> myWelcomeMessage = new ArrayList<>();

        // Add data to the list
        myWelcomeMessage.add("Hello");
        myWelcomeMessage.add(name);
        myWelcomeMessage.add(", welcome to the Spring course.");

        return myWelcomeMessage;
    }
}
