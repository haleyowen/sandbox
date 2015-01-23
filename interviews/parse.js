function parse(num) {
  var arr = num.split(".");

  var res = 0;
  var wholeNum = arr[0];
  for(var i = 0; i < wholeNum.length; i++) {
    res += (wholeNum.charAt(i) - '0') * Math.pow(10, wholeNum.length - i - 1);
  }

  if(arr.length > 1) {
    var dec = arr[1];

    for(var i = 0; i < dec.length; i++) {
      res += (dec.charAt(i) - '0') * Math.pow(10, (i+1) * -1);
    }
  }
  return res;
}
