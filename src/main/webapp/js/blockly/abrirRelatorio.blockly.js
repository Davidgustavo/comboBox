window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbrirRelatorio = window.blockly.js.blockly.AbrirRelatorio || {};

/**
 * abrirRelatorio
 */
window.blockly.js.blockly.AbrirRelatorio.abrirRelatorio = function() {

  this.cronapi.util.openReport('reports/teste.report', [{ parametro : this.cronapi.screen.getValueOfField("vars.parametro") }]);
}
