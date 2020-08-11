import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';

class QuarkusView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing-s" style="margin: var(--lumo-space-m);">
 <vaadin-date-picker id="dateOfBirth"></vaadin-date-picker>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'quarkus-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(QuarkusView.is, QuarkusView);
