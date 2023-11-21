////////////////////////////////////////////////////////////////////////////////
// Created By Etienne KOA
////////////////////////////////////////////////////////////////////////////////

package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageGeneratorImpl implements MessageGenerator{

	//== constant ==
	public static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

	// == field ==

	private final Game game;

	// constructors


	public MessageGeneratorImpl(Game game) {
		this.game = game;
	}

	// == init ==
	@PostConstruct
	public void init() {
		log.info("game = {}", game);
	}


	// == public methods ==
	@Override
	public String getMainMessage() {
		return "Number is between " +
				game.getSmallest() +
				" and " +
				game.getBiggest() +
				". Can you guess it?";
	}

	@Override
	public String getResultMessage() {

		if (game.isGameWon()) {
			return "You gusted it! The number was " + game.getNumber();
		} else if (game.isGameLost()) {
			return "You lost. The number was " + game.getNumber();
		} else if (!game.isValidNumberRange()) {
			return "Invalid number range!";
		} else if (game.getRemainingGuesses() == game.getGuessCount()) {
			return "What is your first guess";
		} else {
			String direction = "Lower";

			if (game.getGuess() < game.getNumber()) {
				direction = "Higher";
			}
			return direction + "! You have " + game.getRemainingGuesses() + " guess left";
		}
	}
}
