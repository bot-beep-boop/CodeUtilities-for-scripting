package io.github.codeutilities.screen.widget;

import java.awt.Rectangle;
import net.minecraft.client.util.math.MatrixStack;

public interface CWidget {

    void render(MatrixStack stack, int mouseX, int mouseY, float tickDelta);

    default void mouseClicked(double x, double y, int button) {
    }

    default void charTyped(char ch, int keyCode) {
    }

    default void keyPressed(int keyCode, int scanCode, int modifiers) {
    }

    default void mouseScrolled(double mouseX, double mouseY, double amount) {
    }

    default void renderOverlay(MatrixStack stack, int mouseX, int mouseY, float tickDelta) {

    }

    Rectangle getBounds();
}
