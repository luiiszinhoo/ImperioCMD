package luisera.imperiocmds.Comandos;

import luisera.imperiocmds.ImperioCMDS;
import luisera.imperiocmds.Utilidades.Cor;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    private ImperioCMDS plugin;

    public Gamemode(ImperioCMDS plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("gms")) {
            if (sender instanceof Player){
                Player p = (Player) sender;
                if (p.hasPermission("imperio.staff.gm")) {
                    String msgSURV = this.plugin.getConfig().getString("msg-survival");
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', msgSURV));
                } else {
                    p.sendMessage(Cor.color("&cVocê não possui acesso a este tipo de comando!"));
                }

            }
        }

        if (command.getName().equalsIgnoreCase("gmc")) {
            if (sender instanceof Player){
                Player p = (Player) sender;
                if (p.hasPermission("imperio.staff.gm")) {
                    String msgCT = this.plugin.getConfig().getString("msg-criativo");
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', msgCT));
                } else {
                    p.sendMessage(Cor.color("&cVocê não possui acesso a este tipo de comando!"));
                }
            }
        }

        if (command.getName().equalsIgnoreCase("gmspec")) {
            if (sender instanceof Player){
                Player p = (Player) sender;
                if (p.hasPermission("imperio.staff.gm")) {
                    String msgSPEC = this.plugin.getConfig().getString("msg-spec");
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', msgSPEC));
                } else {
                    p.sendMessage(Cor.color("&cVocê não possui acesso a este tipo de comando!"));
                }
            }
        }

        return true;
    }




}
