package ch.inacta.example.views;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the our-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Route("our")
@Tag("our-view")
@JsModule("./views/our-view.js")
public class OurView extends PolymerTemplate<OurView.OurViewModel> implements BeforeEnterObserver {

    @Id("layout")
    private HorizontalLayout layout;
    @Id("grid")
    private Grid grid;

    /**
     * Creates a new OurView.
     */
    public OurView() {

    }

    @Override
    public void beforeEnter(final BeforeEnterEvent event) {

        this.layout.add(new TextArea());
    }

    /**
     * This model binds properties between OurView and our-view
     */
    public interface OurViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
