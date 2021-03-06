package Spell;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import me.cakenggt.Ollivanders.Ollivanders;
import me.cakenggt.Ollivanders.SpellProjectile;
import me.cakenggt.Ollivanders.Spells;
import me.cakenggt.Ollivanders.StationarySpells;

/**
 * Creates an Anti-apparition spell object.
 * @author lownes
 *
 */
public class NULLUM_APPAREBIT extends SpellProjectile implements Spell{

	public NULLUM_APPAREBIT(Ollivanders plugin, Player player, Spells name,
			Double rightWand) {
		super(plugin, player, name, rightWand);
	}

	public void checkEffect() {
		move();
		if (getBlock().getType() != Material.AIR && getBlock().getType() != Material.FIRE && getBlock().getType() != Material.WATER && getBlock().getType() != Material.STATIONARY_WATER){
			int duration = (int)(usesModifier*1200);
			StationarySpell.NULLUM_APPAREBIT nullum = new StationarySpell.NULLUM_APPAREBIT(player, location, StationarySpells.NULLUM_APPAREBIT, 5, duration);
			nullum.flair(10);
			p.addStationary(nullum);
			kill();
		}
	}
	
}