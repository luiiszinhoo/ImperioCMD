package luisera.imperiocmds.Comandos;

import luisera.imperiocmds.Utilidades.Cor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class Lixo implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Cor.color("&cApenas jogadores podem executar este comando!"));
            return true;
        }
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("lixo") && p.hasPermission("imperio.lixo")) {
            Inventory inv1 = Bukkit.getServer().createInventory((InventoryHolder)p, 54, ChatColor.YELLOW + "Lixeira");
            p.openInventory(inv1);
            return true;
        }
        return false;
    }
}

