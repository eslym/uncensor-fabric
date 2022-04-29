package com.eslym.uncensor.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Inject(at = @At("HEAD"), method = "shouldFilterText()Z", cancellable = true)
	private void injectShouldFilterText(CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(false);
	}
}
