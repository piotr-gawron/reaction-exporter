package org.reactome.server.tools.reaction.exporter.renderer.glyph.entity;

import org.reactome.server.tools.reaction.exporter.layout.common.Position;
import org.reactome.server.tools.reaction.exporter.layout.model.EntityGlyph;
import org.reactome.server.tools.reaction.exporter.renderer.glyph.entity.DefaultEntityRenderer;
import org.reactome.server.tools.reaction.exporter.renderer.profile.DiagramProfile;
import org.reactome.server.tools.reaction.exporter.renderer.profile.NodeColorProfile;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class ProteinRenderer extends DefaultEntityRenderer {

    private static final int ROUNDED_RECTANGLE_ARC = 8;

    @Override
    protected Shape getShape(EntityGlyph entity) {
        final Position position = entity.getPosition();
        return new RoundRectangle2D.Double(position.getX(), position.getY(), position.getWidth(), position.getHeight(), ROUNDED_RECTANGLE_ARC, ROUNDED_RECTANGLE_ARC);
    }

    @Override
    protected NodeColorProfile getColorProfile(DiagramProfile profile) {
        return profile.getProtein();
    }
}