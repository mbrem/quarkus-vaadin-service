package ch.inacta.example.views;

import static java.time.LocalDate.now;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the quarkus-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Route("")
@Tag("quarkus-view")
@SuppressWarnings("serial")
@JsModule("./views/quarkus-view.js")
public class QuarkusView extends PolymerTemplate<QuarkusView.QuarkusViewModel> implements BeforeEnterObserver {

    @Id("dateOfBirth")
    private DatePicker dateOfBirth;

    /**
     * Creates a new QuarkusView.
     */
    public QuarkusView() {

    }

    @Override
    public void beforeEnter(final BeforeEnterEvent event) {

        this.dateOfBirth.setValue(now());

    }

    /**
     * This model binds properties between QuarkusView and quarkus-view
     */
    public interface QuarkusViewModel extends TemplateModel {

    }
}
