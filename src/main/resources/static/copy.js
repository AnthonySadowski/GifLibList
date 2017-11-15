function Copy() {
  var copyText = document.getElementById("txtarea");
  copyText.select();
  document.execCommand("Copy");
}