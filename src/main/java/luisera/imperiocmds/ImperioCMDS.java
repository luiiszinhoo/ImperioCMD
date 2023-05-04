package luisera.imperiocmds;

import luisera.imperiocmds.Comandos.Gamemode;
import luisera.imperiocmds.Comandos.Lixo;
import luisera.imperiocmds.Eventos.JoinAndQuitEvent;
import luisera.imperiocmds.Eventos.NoDeathScreen;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ImperioCMDS extends JavaPlugin {

    @Override
    public void onEnable() {


        //Registrar CMD

        getCommand("gmc").setExecutor(new Gamemode(this));
        getCommand("gms").setExecutor(new Gamemode(this));
        getCommand("gmspec").setExecutor(new Gamemode(this));
        getCommand("lixo").setExecutor(new Lixo());



        //Registrar EVNT

        getServer().getPluginManager().registerEvents(new JoinAndQuitEvent(this), this);
        getServer().getPluginManager().registerEvents(new NoDeathScreen(), this);



        //Iniciar

        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "ImperioSurvival - CMDS");
        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "Plugin " + ChatColor.GREEN + "ATIVADO");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Desenvolvido por: " + ChatColor.YELLOW + "offluisera");





    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "ImperioSurvival - CMDS");
        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "Plugin " + ChatColor.RED + "DESATIVADO");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Desenvolvido por: " + ChatColor.YELLOW + "offluisera");

    }
}
