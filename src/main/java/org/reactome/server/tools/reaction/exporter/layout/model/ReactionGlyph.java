package org.reactome.server.tools.reaction.exporter.layout.model;

import org.reactome.server.graph.domain.model.ReactionLikeEvent;
import org.reactome.server.tools.reaction.exporter.layout.common.RenderableClass;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 * @author Pascual Lorente (plorente@ebi.ac.uk)
 */
public class ReactionGlyph extends AbstractGlyph {

    private Long dbId;
    private String stId;
    private String name;
    private RenderableClass renderableClass;
    private Boolean disease;

    ReactionGlyph(ReactionLikeEvent rle) {
        super();
        dbId = rle.getDbId();
        stId = rle.getStId();
        name = rle.getDisplayName();
        renderableClass = RenderableClass.getRenderableClass(rle);
        disease = rle.getIsInDisease() ? true : null;
    }

    public String getStId() {
        return stId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public RenderableClass getRenderableClass() {
        return renderableClass;
    }

    @Override
    public Long getDbId() {
        return dbId;
    }

    public Boolean isDisease() {
        return disease;
    }

    @Override
    public String toString() {
        return "ReactionGlyph{stId='" + stId + "'}";
    }
}
