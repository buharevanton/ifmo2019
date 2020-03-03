Первая часть задания
Необходимо скачать по адресам:

kodaktor.ru/mysteries/key kodaktor.ru/mysteries/secret

соответственно публичный RSA-ключ и зашифрованные данные.

С помощью этого ключа и метода publicDecrypt встроенного модуля crypto расшифруйте данные. Текст сценария должен начинаться с комментария (Первыми двумя символами сценария должны быть /* (прямой слэш и >>звёздочка)). В комментарии укажите свои ФИО.

Перейдите по полученному после расшифровки адресу для получения оставшейся части задания.

let c = require('crypto'),
  fs = require('fs'),
  pK = fs.readFileSync('key').toString(),
  sD = fs.readFileSync('secret'),
  oD = c.publicDecrypt(pK, sD);
console.log(oD.toString());
https://kodaktor.ru/g/secret2311

Поздравляю. Вы успешно расшифровали адрес задания и его первую часть.
  Теперь сделайте, пожалуйста, следующее.

  С помощью полученного вами ключа (key) зашифруйте методом publicEncrypt тот JavaScript-сценарий, который вы использовали для расшифровки секрета с заданием. 
  Первыми двумя символами сценария должны быть /* (прямой слэш и звёздочка)

  Сценарий должен иметь разумный объём, ненамного больше 200 байт
  
  const { writeFileSync: w, readFileSync: r } = require('fs');
  
  const { publicEncrypt: enc } = require('crypto');
  
  const b = r('./encoder.js');
  const publicKey = String(r('./key'));
  
  const result = enc(publicKey, b);
  w('secret2anton', result);

  Ответ - source/secret2anton
  
 
