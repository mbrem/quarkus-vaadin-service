import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class OurView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout id="layout" style="width: 100%; height: 100%;">
 <vaadin-grid id="grid"></vaadin-grid>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'our-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(OurView.is, OurView);
