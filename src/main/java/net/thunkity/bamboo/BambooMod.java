package net.thunkity.bamboo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.thunkity.bamboo.entity.ModEntities;
import net.thunkity.bamboo.entity.custom.BamboyEntity;
import net.thunkity.bamboo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class BambooMod implements ModInitializer {
	public static final String MOD_ID = "bamboo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.BAMBOY, BamboyEntity.setAttributes());
	}
}
