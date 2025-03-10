package eu.minehome.mineHomeCore.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void OnJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.joinMessage(null);
    }
}
