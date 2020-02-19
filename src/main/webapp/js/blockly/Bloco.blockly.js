window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {

  this.cronapi.util.executeJavascriptNoReturn('var exemplo = \"C:\\\\Program Files\\\\Apache Software Foundation\\\\\";\nvar resultado = exemplo.replace(/\\\\/gi, \"/\");\nresultado = exemplo.replace(\"/\", /\"\\\"/gi);\nconsole.log(resultado);');
}
