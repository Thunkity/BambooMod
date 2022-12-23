package net.thunkity.bamboo.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.thunkity.bamboo.BambooMod;
import net.thunkity.bamboo.entity.custom.BamboyEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BamboyEntity> BAMBOY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(BambooMod.MOD_ID, "bamboy"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BamboyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

}