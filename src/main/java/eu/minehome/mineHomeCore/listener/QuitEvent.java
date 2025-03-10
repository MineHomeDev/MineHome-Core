package eu.minehome.mineHomeCore.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

@SuppressWarnings("deprecation")
public class QuitEvent implements Listener {

    @EventHandler
    public void OnQuitEvent(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(null);
    }
}
