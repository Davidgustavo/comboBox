window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Split = window.blockly.js.blockly.Split || {};

/**
 * Split
 */
window.blockly.js.blockly.Split.Executar = function() {
 var item, i;
  item = 'TESTE\nTESTE\nTESTE'.split(this.cronapi.text.newline());
  for (var i_index in item) {
    i = item[i_index];
    window.alert('Quebra');
    window.alert(i);
  }
}
