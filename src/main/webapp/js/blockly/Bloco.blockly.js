window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {
	this.cronapi.screen.changeValueOfField("Pessoa.active.user",
			this.cronapi.util
					.callServerBlockly('blockly.UserID:Executar', null));
}
