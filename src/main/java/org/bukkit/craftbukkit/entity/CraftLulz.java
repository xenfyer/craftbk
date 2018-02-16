package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLulz;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Lulz;

public class CraftLulz extends CraftAnimals implements Lulz {

    public CraftLulz(CraftServer server, EntityLulz entity) {
        super(server, entity);
    }
    @Override
    public EntityLulz getHandle() {
        return (EntityLulz) entity;
    }

    @Override
    public String toString() {
        return "CraftLulz";
    }

    @Override
    public EntityType getType() {
        return EntityType.LULZ;
    }
}
