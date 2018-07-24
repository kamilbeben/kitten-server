package pl.kamilbeben.kittenserver.events;

import pl.kamilbeben.kittenserver.abstracted.AbstractPlayer;
import org.springframework.context.ApplicationEvent;

public class PlayerDisconnectEvent extends ApplicationEvent {

  public PlayerDisconnectEvent(AbstractPlayer player) {
    super(player);
  }

}