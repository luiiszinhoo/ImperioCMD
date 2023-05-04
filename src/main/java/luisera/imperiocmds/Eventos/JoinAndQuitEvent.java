package luisera.imperiocmds.Eventos;

import luisera.imperiocmds.ImperioCMDS;
import luisera.imperiocmds.Utilidades.Cor;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinAndQuitEvent implements Listener {

    private ImperioCMDS plugin;

    public JoinAndQuitEvent(ImperioCMDS plugin ) {
        this.plugin= plugin;
    }


    @EventHandler
    public void onJoin (PlayerJoinEvent e) {
        Player p = e.getPlayer();

        String tituloEntrada = this.plugin.getConfig().getString("titulo-entrada");
        String subtituloEntrada = this.plugin.getConfig().getString("subtitulo-entrada");
        String entradaVIP = "%luckperms_prefix% &eentrou no servidor!";
        entradaVIP = PlaceholderAPI.setPlaceholders(e.getPlayer(), entradaVIP);

        if (p.hasPermission("imperio.vip")) {
            e.setJoinMessage(entradaVIP);
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', tituloEntrada), ChatColor.translateAlternateColorCodes('&', subtituloEntrada), 5, 8, 5);

        } else {
            e.setJoinMessage("");
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', tituloEntrada), ChatColor.translateAlternateColorCodes('&', subtituloEntrada), 5, 8, 5);

        }

    }

    @EventHandler
    public void onQuit (PlayerQuitEvent e) {
        Player p = e.getPlayer();

        e.setQuitMessage("");

    }

}
