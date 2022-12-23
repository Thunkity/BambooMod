package net.thunkity.bamboo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.thunkity.bamboo.entity.ModEntities;
import net.thunkity.bamboo.entity.client.BamboyRenderer;

public class BambooModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BAMBOY, BamboyRenderer::new);
    }
}
