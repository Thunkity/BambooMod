package net.thunkity.bamboo.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.thunkity.bamboo.BambooMod;
import net.thunkity.bamboo.entity.custom.BamboyEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BamboyRenderer extends GeoEntityRenderer<BamboyEntity> {
    public BamboyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BamboyModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public Identifier getTextureResource(BamboyEntity animatable) {
        return new Identifier(BambooMod.MOD_ID, "textures/entity/bamboy_texture.png");
    }

    @Override
    public RenderLayer getRenderType(BamboyEntity animatable, float partialTick, MatrixStack stack, @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight, Identifier texture) {
        stack.scale(1.0f, 1.0f, 1.0f);

        return super.getRenderType(animatable, partialTick, stack, bufferSource, buffer, packedLight, texture);
    }
}
