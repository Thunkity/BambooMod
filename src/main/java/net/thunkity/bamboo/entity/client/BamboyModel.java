package net.thunkity.bamboo.entity.client;

import net.minecraft.util.Identifier;
import net.thunkity.bamboo.BambooMod;
import net.thunkity.bamboo.entity.custom.BamboyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BamboyModel extends AnimatedGeoModel<BamboyEntity> {
    @Override
    public Identifier getModelResource(BamboyEntity object) {
        return new Identifier(BambooMod.MOD_ID, "geo/bamboy.geo.json");
    }

    @Override
    public Identifier getTextureResource(BamboyEntity object) {
        return new Identifier(BambooMod.MOD_ID, "textures/entity/bamboy_texture.png");
    }

    @Override
    public Identifier getAnimationResource(BamboyEntity animatable) {
        return new Identifier(BambooMod.MOD_ID, "animations/bamboy.animation.json");
    }
}
