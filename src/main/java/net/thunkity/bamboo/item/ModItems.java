package net.thunkity.bamboo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thunkity.bamboo.BambooMod;

public class ModItems {

    // Hardened Bamboo
    public static final Item HARDENED_BAMBOO = registerItem("hardened_bamboo", new Item(new Item.Settings()), ItemGroups.NATURAL);

    private static Item registerItem(String name, Item item, ItemGroup NATURAL) {
        ItemGroupEvents.modifyEntriesEvent(NATURAL).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(BambooMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BambooMod.LOGGER.debug("Registering Mod Items for " + BambooMod.MOD_ID);
    }
}
