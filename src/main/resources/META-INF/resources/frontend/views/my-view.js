import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-rich-text-editor/src/vaadin-rich-text-editor.js';

class MyView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-rich-text-editor style="width: 100%; height: 100%;"></vaadin-rich-text-editor>
`;
    }

    static get is() {
        return 'my-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(MyView.is, MyView);
