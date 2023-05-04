package luisera.imperiocmds.Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class NoDeathScreen implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onDeath(PlayerDeathEvent e) {
        if (e.getEntity() == null)
            return;
        Player p = e.getEntity().getPlayer();
        if (p.isOnline() && p.isDead())
            p.spigot().respawn();

    }
}
